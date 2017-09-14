package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Armstrong {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,arm=0,n=0,temp;
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number");
try {
	n = Integer.parseInt(in.readLine());
} catch (NumberFormatException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
temp=n;
while(n!=0)
{
	a=n%10;
	arm=arm+(a*a*a);
	n=n/10;
}
if(arm==temp)
System.out.println(temp+" is a armstrong number ");
else
System.out.println(temp+" is not a armstrong number ");
}
	}


