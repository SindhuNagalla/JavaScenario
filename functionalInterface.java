package com.nit.Interfaces;

/*
 -WAP for the following requirement
 -create a functional interface which has a functionality to display the number as taken as a input
 -perform functional programming with support of lambda expressions to provide implementation to the SAM.
 */

@FunctionalInterface
interface Sample
{
	void sayNumber(int x);
}
public class functionalInterface {
	public static void main(String[] args)
	{
	Sample s1=(a)->{System.out.println(a);};
	s1.sayNumber(10);

}
}
