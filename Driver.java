package com.nit.Interfaces;

interface Vehicle
{
	void start();
	void stop();
}
class Driver implements Vehicle{
	
	public void start()
	{
		System.out.println("Driver started vehicle");
	}
	
	public void stop()
	{
		System.out.println("Driver stopped vehicle");
	}
	
	public static void main(String[] args) {
		Driver d=new Driver();
		d.start();
		d.stop();

	}


}
