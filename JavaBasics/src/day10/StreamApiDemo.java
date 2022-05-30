package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Stream API process collection objects
 * 
 */
public class StreamApiDemo {

	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(50);
		list.add(60);
		list.add(57);
		list.add(60);
		list.add(57);
		list.add(98);
		list.add(86);
		list.add(45);
		
//		int[] intArr = {67, 87, 75, 65, 40, 58};
//		// Convert Array into List
//		List lst1 = Arrays.asList(intArr);
//		
//		// return number of elements in Stream
//		Stream<Integer> s = Stream.of(10, 20, 30, 40, 50);
//		long count = s.count();
//		System.out.println(count);
		
		// Filter
		// filter number greater than 50 - filter()
		System.out.println("filter number greater than 50 - filter()");
		List<Integer> lst2 =  list.stream().filter(num->num>50).collect(Collectors.toList());
		System.out.println(lst2);
		
		System.out.println("filter number less than 50 - filter()");
		List<Integer> lst3 =  list.stream().filter(num->num<50).collect(Collectors.toList());
		System.out.println(lst3);
		
		System.out.println("Print all numbers except 75");
		List<Integer> lst4 =  list.stream().filter(num->num!=75).collect(Collectors.toList());
		System.out.println(lst4);
		
		System.out.println("Print all even numbers");
		List<Integer> lst5 =  list.stream().filter(num->num%2==0).collect(Collectors.toList());
		System.out.println(lst5);
		
		System.out.println("Print all odd numbers");
		List<Integer> lst6 =  list.stream().filter(num->num%2!=0).collect(Collectors.toList());
		System.out.println(lst6);
		
		// Map
		System.out.println("add 5 to all numbers");
		System.out.println("Before adding 5: "+list);
		List<Integer> lst7 =  list.stream().map(num->num+5).collect(Collectors.toList());
		System.out.println("After adding 5: " +lst7);
		
		System.out.println("Square all numbers present in collection");
		System.out.println("Before squaring: "+list);
		List<Integer> lst8 =  list.stream().map(num->num*num).collect(Collectors.toList());
		System.out.println("After squaring: " +lst8);
		
		// Sort
		System.out.println("Before sorting: "+ list);
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("After sorting: "+ sortedList);
		
		List<String> strList = new ArrayList<>();
		strList.add("Ram");
		strList.add("Jhon");
		strList.add("Ram");
		strList.add("Sam");
		strList.add("Kavitha");
		strList.add("Krish");
		
		System.out.println("Before sorting: "+ strList);
		List<String> sortedList1 = strList.stream().sorted().collect(Collectors.toList());
		System.out.println("After sorting: "+ sortedList1); // sort in asc order
		
		System.out.println("Before sorting: "+list);
		List<Integer> sortedList2 = list.stream().sorted((obj1, obj2) -> obj1 > obj2 ? 1 : obj1 < obj2 ? -1 : 0)
				.collect(Collectors.toList());
		System.out.println("After sorting: "+sortedList2); // return elements in asc order
		
		System.out.println("Before sorting: "+list);
		List<Integer> sortedList3 = list.stream().sorted((obj1, obj2) -> obj1 > obj2 ? -1 : obj1 < obj2 ? 1 : 0)
				.collect(Collectors.toList());
		System.out.println("After sorting: "+sortedList3); // return elements in asc order
		
		// Min
		Integer min = list.stream().min((obj1, obj2) -> obj1.compareTo(obj2)).get();
		System.out.println("min value: "+min);
		
		// Max
		Integer max = list.stream().max((obj1, obj2) -> obj1.compareTo(obj2)).get();
		System.out.println("max value: "+max);
		
		// forEach - iterate collection
		list.stream().forEach(num->System.out.println(num));
		
		// distinct
		List<Integer> dist = list.stream().distinct().collect(Collectors.toList());
		System.out.println(dist);

	}

}
