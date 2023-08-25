// Java program to illustrate the
// creating and accessing objects
// using new keyword

// base class
class Dog {

	// the class Dog has two fields
	String dogName;
	int dogAge;

	// the class Dog has one constructor
	Dog(String name, int age)
	{
		this.dogName = name;
		this.dogAge = age;
	}
}

// driver class
public class Test {
	public static void main(String[] args)
	{
		// creating objects of the class Dog
		Dog ob1 = new Dog("Bravo", 4);
		Dog ob2 = new Dog("Oliver", 5);

		// accessing the object data through reference
		System.out.println(ob1.dogName + ", " + ob1.dogAge);
		System.out.println(ob2.dogName + ", " + ob2.dogAge);
	}
}
