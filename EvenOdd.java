package com.nit.Interfaces;

@FunctionalInterface
interface EO
{
	void Number(int x);
}
public class EvenOdd {

	public static void main(String[] args) {
		EO e1=(a)->{if(a%2==0) {
			System.out.println("even");
			}
		else
		{
			System.out.println("Odd");
			}
		};
		e1.Number(7);

	}

}
