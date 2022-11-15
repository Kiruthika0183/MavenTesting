package com.java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  List<String>strList=Arrays.asList("abc","","bcd","","defg","jk");
		  long count = strList.stream() .filter(x -> x.length()> 3) .count();
		  System.out.println("Count:" +count);
		 
		  List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		  List<Integer> distinct = numbers.stream()
		  .map( i -> i*i)
		  .distinct()
		  .collect(Collectors.toList());
		  System.out.println(distinct);

	}

}
