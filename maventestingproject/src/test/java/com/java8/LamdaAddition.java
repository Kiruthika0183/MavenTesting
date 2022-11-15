package com.java8;
interface Addable
{
	int add(int a,int b);
}
interface Multi
{
	int mul(int c,int d);
}

public class LamdaAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addable ad1=(a,b)->(a+b);
			System.out.println(ad1.add(4, 5));
			Multi ad2=(c,d)->(c*d);
			System.out.println(ad2.mul(4, 5));
			
			
		}
		
	}


