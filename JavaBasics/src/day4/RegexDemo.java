package day4;
/*
 * 
 * Quantifiers
 * '?' - 0-1 occurance of pattern 
 * '+' - 1 or more 
 * '*' - 0 or more
 * '{10}' - number of times to occur
 * '{5, 10}' - min 5 & upto 10
 * '{5, }' - min 5 & max can be any time
 * 
 * Metacharecters
 * \d - represents single digit
 * \D - represents single non-digit
 * \s - represents space
 * \S - represents non space char
 * \w - matches word chars [a-zA-Z_$]
 * \W - matches other than word chars
 *  . - single character
 *  
 *  String str = "Hello12";
 *  \w\w\w\w\w\d\d
 *  \w{5}\d{2}
 *  
 *  [a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z][0-9][0-9]
 *  [a-zA-Z]{5}[0-9]{2,5}
 *  
 *  String contactNo = "091 044 34563456" 
 *  \d\d\d\s\d\d\d\s\d\d\d\d\d\d\d\d
 *  \d{1, 3}\s\d{3, 5}\s\d{8,10}
 *  
 *  [0-9]{3}\s[0-9]{3}\s[0-9]{8, 10}
 *  
 *  
 *  1.1.1.1
 *  10.12.13.14
 *  192.168.23.134
 *  
 *  1a1.1.1
 *  1$1.1.1
 *  
 *  0-255
 *  
 *  0.0.0.0
 *  255.255.255.255
 *  [0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}
 *  \d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}
 *  \d{1,3}\.{3}\d{1,3}
 *  
 *  
 *  
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		
		// Option 1: compile() & matcher()
		Pattern pattern = Pattern.compile(".[a-z]"); // pattern
		Matcher matcher = pattern.matcher("as"); // string
		System.out.println(matcher.matches());// true
		
		// Option 2: Pattern.matches()
		System.out.println(Pattern.matches(".a", "as")); //false
		System.out.println(Pattern.matches(".a", "%a"));// true
		System.out.println(Pattern.matches(".a", "as"));
		System.out.println();
		String contactNo = "1888 634 1407 (Toll Free)";
		System.out.println(Pattern.matches("\\d{4}\\s\\d{3}\\s\\d{4}\\s.*", contactNo));
		System.out.println();
		
		Pattern pattern1 = Pattern.compile("(\\d{4})\\s(\\d{3})\\s(\\d{4})\\s.*"); // pattern
		Matcher matcher1 = pattern1.matcher(contactNo); // string
		System.out.println(matcher1.matches()); // true
		
		System.out.println(matcher1.group()); // 1888 634 1407 (Toll Free)
		System.out.println(matcher1.group(1));//1888
		System.out.println(matcher1.group(2));//634
		System.out.println(matcher1.group(3));// 1407
		
		/*
		 * + 91 124 2641407 (International call rates applicable)
		 * 011 24667473 (Monday to Friday ,0930 hrs - 1730 hrs IST)
		 * flyingreturn.base@airindia.in
		 * golden.edge@airindia.in
		 * mr.
		 * mrs.
		 * 0124-2641407 
		 * contactus@airindia.in
		 * 613 701 98270 (Toll Number) #
		 */
		
		
		
		
		
		
		
	}

}
