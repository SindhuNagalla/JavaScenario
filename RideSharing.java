package com.nit.Interfaces;

class User
{
	private String name;
	private String phoneNumber;
	private String email;
	User()
	{
	}
	User(String name,String phoneNumber,String email)
	{
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.email=email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.isEmpty())
		{
			System.out.println("Invalid name provided");
			this.name="UnKnown";
		}
		else
		{
			this.name=name;
		}
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber == null)
		{
			System.out.println("Invalid phone number");
			this.phoneNumber="Unknown";
		}
		else
		{
		this.phoneNumber = phoneNumber;
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	void displayUserInfo()
	{
		System.out.println("Name:"+name);
		System.out.println("Phone Number:"+phoneNumber);
		System.out.println("Email:"+email);
	}
}
class Driver1 extends User
{
	String vehicleNumber;
	double rating;
	
	Driver1(String name,String phoneNumber,String email,String vehicleNumber,double rating)
	{
		super(name,phoneNumber,email);
		this.vehicleNumber=vehicleNumber;
		this.rating=rating;
	}
	public Driver1() {
		// TODO Auto-generated constructor stub
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		if(rating < 0.0 || rating > 5.0)
		{
			System.out.println("Invalid rating,must be between 0.0 and 5.0");
			this.rating=0.0;
		}
		else
		{
			this.rating=rating;
		}
	}
	void displayDriverInfo()
	{
		super.displayUserInfo();
		System.out.println("Vehicle Number:"+vehicleNumber);
		System.out.println("Rating:"+rating);
		System.out.println();
	}
	
}
class Rider extends User
{
	String paymentMethod;
	String rideType;
	
	Rider(String name,String phoneNumber,String email,String paymentMethod,String rideType)
	{
		super(name,phoneNumber,email);
		this.paymentMethod=paymentMethod;
		this.rideType=rideType;
	}
	public Rider() {
		
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getRideType() {
		return rideType;
	}
	public void setRideType(String rideType) {
		this.rideType = rideType;
	}
	
	void displayRiderInfo()
	{
		super.displayUserInfo();
		System.out.println("Payment Method:"+paymentMethod);
		System.out.println("rideType:"+rideType);
		System.out.println();
	}
}
public class RideSharing {

	public static void main(String[] args) {
		Driver1 d1=new Driver1("Sindhu","65897412s","nagalla@gmail.com","AP05TS5032",4.5);
		d1.displayDriverInfo();
		
		Rider r1=new Rider();
		r1.setName("Priya");
		r1.setPhoneNumber("6597412357");
		r1.setEmail("nagalla1@gmail.com");
		r1.setPaymentMethod("Credit card");
		r1.setRideType("Luxury");
		r1.displayRiderInfo();
		
		Driver1 d2=new Driver1();
		d2.setName("");
		d2.setPhoneNumber(null);
		d2.setEmail("nagalla1@gmail.com");
		d2.setVehicleNumber("AP05TS5032");
		d2.setRating(7.0);
		d2.displayDriverInfo();
		
		Rider r2=new Rider("Rohit","65897412365","nagalla1@gmail.com","UPI","Standard");
		r2.setRideType("Premium");
		r2.displayRiderInfo();
	}

}
