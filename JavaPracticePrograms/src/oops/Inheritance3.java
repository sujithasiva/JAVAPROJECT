package oops;
 
class Vehicle
{
	public void drive()
	{
		System.out.println("It can drive");
	}
}
class Bike extends Vehicle
{
	public void tier()
	{
		System.out.println("It has 2 wheels");
	}
}
class Car extends Vehicle
{
	public void tier()
	{
		System.out.println("It has 4 wheels");
	}
}
public class Inheritance3 {

	public static void main(String[] args) {
		System.out.println("Heirarchical Inheritance ");
		Car  c = new Car();
		c.drive();
		c.tier();

	}

}

