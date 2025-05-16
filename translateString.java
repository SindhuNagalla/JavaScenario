package com.nit.Interfaces;

import java.util.Scanner;

@FunctionalInterface
interface NumberString
{
	void displayString(int x);
}
public class translateString {

	public static void main(String[] args) {
	NumberString ns=(a)->{
		String word[]= {"zero","one","two","three","four","five","Six","seven","eight","nine"};
		if(a>0 && a<=9)
			System.out.println(word[a]);
		else
			System.out.println("Try Again");
	};
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number between 0-9 to display in words:");
	ns.displayString(sc.nextInt());
	}

}

