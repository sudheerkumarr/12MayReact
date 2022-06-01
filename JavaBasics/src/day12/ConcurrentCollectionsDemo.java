package day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/*
 * Below classes provides thread safety in collection
 * Vector  - 1.0 - Legacy classes
 * Hashtable
 * 
 * java.util.Collections class
 * synchronizedSet
 * synchronizedList
 * synchronizedMap
 * 
 * - Only one thread allowed at a time 
 * - poor performance
 * - Inconsistency in output data
 * 
 * Concurrent collections
 * Map(I)
 *   ConcurrentMap(I) 
 *      ConcurrentHashMap(C)
 *      
 * 
 * Collection(I)     
 *   List(I)   
 *     CopyOnWriteArrayList(C)
 *   Set(I)
 *     CopyOnWriteSet(C)
 *     
 *  ConcurrentMap(I) 
 *    Methods
 *     Object putIfAbsent(Object key, Object value) ; 
 *     boolean remove(Object key, Object value) ;
 *     boolean replace(Object key, Object oldValue, Object newValue);
 *     
 *  HashMap m = new Hashmap();   
 *   put(k,v);
 *   m.put(10, "Pooja");
 *   m.put(10, "Shiva");
 *   
 *   sop(m) ;// {10="Pooja"}
 *   
 *   m.remove(10); //{}
 *   m.replace
 *   
 *  
 *  ConcurrentHashMap cm = new ConcurrentHashMap();
 *   cm.putIfAbsent(10, "Pooja");
 *   cm.putIfAbsent(10, "Shiva");
 *   sop(cm); {10="Pooja"};
 *   
 *   
 *  Allows any number of thread to perform  read operations simultaneously.
 *  Write/update operations are limited to 16. 
 *    - Only 16 threads allowed to perform write/update operation simultaneously.
 *  null keys/value are not allowed
 *  thread safe
 *  while one thread iterating map other thread can able to perform update.
 *  We won't get ConcurrentModificationException
 *  
 *  CopyOnWriteArrayList
 *    Thread safety.
 *    Multiple Threads can perform read operations simultaneously
 *    Write/update operations creates clone copy and then write/update operations
 *      performed
 *    insertion order preserved
 *    null & duplicated are allowed
 *    remove operation can't be performed while performing iteration.
 *     ConcurrentModificationException won't occurs
 *     UnsupportedOperationException - occurs while iterating if you try to remove element from 
 *                                     CopyOnWriteArrayList
 *  
 *  Collection(I)
 *    Set(I)
 *      CopyOnWriteArraySet(C)
 *   developed based on CopyOnWriteArrayList
 *   Multiple Threads can perform read operations simultaneously
 *   Write/update operations creates clone copy and then allows to perform write/update operations
 *   insertion order preserved
 *   dupliates not allowed
 *   null - only one
 *   ConcurrentModificationException won't occurs
 *   recommended not to use CopyOnWriteArrayList/CopyOnWriteSet when the 
 *    requirement frequent write/update.
 *  
 */

public class ConcurrentCollectionsDemo {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(1000, "Ram");
		hm.put(1001, "Ram");
		hm.put(1002, "Sam");
		hm.put(1000, "Ravi"); // if key already present, value will be updated
		hm.put(null, null);

		// Convert map into set view
		Set<Entry<Integer, String>> set = hm.entrySet();

		// Iterate map
		for (Entry<Integer, String> entry : set) {
			System.out.println(entry.getKey() + " | " + entry.getValue()); // 1000 | Ravi
																			// 1001 | Ram
																			// 1002 | Sam
		}

		// remove entry from map
		hm.remove(1000);
		// Iterate map
		System.out.println();
		for (Entry<Integer, String> entry : set) {
			System.out.println(entry.getKey() + " | " + entry.getValue()); // 1001 | Ram
																			// 1002 | Sam
		}

		// replace entry
		hm.replace(1001, "Ravi");
		System.out.println();
		for (Entry<Integer, String> entry : set) {
			System.out.println(entry.getKey() + " | " + entry.getValue()); // 1001 | Ravi
																			// 1002 | Sam
		}

		// ConcurrentHashMap
		ConcurrentMap chm = new ConcurrentHashMap();
		chm.putIfAbsent(1000, "Ram");
		chm.putIfAbsent(1001, "Ram");
		chm.putIfAbsent(1002, "Sam");
		chm.putIfAbsent(1000, "Ravi"); // Won't update value if key already present
		// chm.putIfAbsent(null, null); // NullPointerException

		// Convert map into set view
		Set<Entry<Integer, String>> set1 = chm.entrySet();
		System.out.println();
		for (Entry<Integer, String> entry : set1) {
			System.out.println(entry.getKey() + " | " + entry.getValue());
			/*
			 * 1000 | Ram 1001 | Ram 1002 | Sam
			 */
		}

		// remove
		chm.remove(1000, "Shiv"); // Won't remove entry from map if key and value not matching
		System.out.println();
		for (Entry<Integer, String> entry : set1) {
			System.out.println(entry.getKey() + " | " + entry.getValue());
			/*
			 * 1000 | Ram 1001 | Ram 1002 | Sam
			 */
		}

		chm.remove(1000, "Ram"); // remove entry from map
		System.out.println();
		System.out.println("Remove: ");
		for (Entry<Integer, String> entry : set1) {
			System.out.println(entry.getKey() + " | " + entry.getValue());
			/*
			 * 1001 | Ram 1002 | Sam
			 */
		}

		// Replace
		chm.replace(1001, "Rama", "Ravi"); // key matching but value won't match
		System.out.println();
		System.out.println("Replace: ");
		for (Entry<Integer, String> entry : set1) {
			System.out.println(entry.getKey() + " | " + entry.getValue());
			/*
			 * 1001 | Ram 1002 | Sam
			 */
		}

		chm.replace(1001, "Ram", "Ravi"); // key and value are getting matched, entry will be removed
		System.out.println();
		System.out.println("Replace: ");
		for (Entry<Integer, String> entry : set1) {
			System.out.println(entry.getKey() + " | " + entry.getValue());
			/*
			 * 1001 | Ram 1002 | Sam
			 */
		}

		// CopyOnWriteArrayList - insertion order maintains, null values allowed,
		// duplicates allowed, Thread safe
		CopyOnWriteArrayList<Integer> cal = new CopyOnWriteArrayList<>();
		cal.add(100);
		cal.add(200);
		cal.add(20);
		cal.add(20);
		cal.add(null);
		cal.add(null);

		Iterator itr = cal.iterator();
		System.out.println();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			/*
			 * 100 200 20 20 null
			 */
		}

		// CopyOnWriteSet(C) - duplicates allowed, insertion order maintains, only one null value allowed,
		//                     provides Thread safety
		CopyOnWriteArraySet<String> cs = new CopyOnWriteArraySet<>();
		cs.add("aa");
		cs.add("bb");
		cs.add("aa");
		cs.add("cc");
		cs.add("dd");
		cs.add(null);
		cs.add(null);

		Iterator itr1 = cs.iterator();
		System.out.println();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
			/*
			 * aa bb cc dd null
			 */
		}

	}

}
