package com.app.programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public final class RemoveDuplicatesWordsStr {
	public static void main(String[] args) {
	String inputstring="Java is a programming language and Java is widely used in the software industry.";
	String result=RemoveDuplicatesWordsStr(inputstring);
	System.out.println("After removing duplicate words: "+result);
}
	public static String RemoveDuplicatesWordsStr(String inputstring) {
		String[] words=inputstring.split(" ");
		String result=Arrays.stream(words).distinct().collect(Collectors.joining(" "));
		return result;
	}

}
//The removeDuplicateWords() method takes in the input string as a parameter and returns a new string with duplicate words removed. 
//
//2. Inside the removeDuplicateWords() method, the string is split into words using the split() method, which splits the string based on one or more whitespace characters (\\s+). 
//
//3. Using Java 8's Stream API, we create a stream from the array of words using Arrays.stream(words). 
//
//4. We apply the distinct() operation on the stream to remove duplicates and retain only unique words. 
//
//5. Finally, we collect the distinct words using the Collectors.joining(" ") operation, which joins the words back into a single string separated by spaces. 
//
//6. The resulting string with duplicate words removed is returned from the removeDuplicateWords() method. 
