package com.test;

public class Swappingthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2; 
		int b = 1; 
		int c = 3; 

				a = a+b+c;

				b = a-b-c;
				c = a-b-c;
				a = a-b-c;

		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);

	}

}
