package com.java8;

import java.util.ArrayList;
import java.util.List;

public class LamdaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		//Traversing using forEach
		System.out.println("Traversing using forEach");
		for(Integer element:list) {
			System.out.println(element);
		
	}
		//lamda expression
		System.out.println("Traversing using lamda expression");
		list.forEach(element->System.out.println(element));
		

}
}