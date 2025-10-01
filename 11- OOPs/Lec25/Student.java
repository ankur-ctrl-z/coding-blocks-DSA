package Lec25;
 
//import java.util.ArrayList;

public class Student {
	String name;
	int age;

	public void Intro_yourSelf() {

		System.out.println("My Name is " + name + " and age is " + age);

	}

	public void SayHey(String name) {
		System.out.println(this.name + " Say hello " + name);

	}

	public static String MentorName() {
		return "Monu Bhaiya";
	}

	// MentorName() is marked as static because it doesn’t need to operate on an
	// instance of the Student class.
	// It simply returns a constant string, "Monu Bhaiya", which is not dependent on
	// any instance-specific data (like the name or age instance variables). So, it
	// makes sense to make it static because it's tied to the class itself, not to
	// any particular object.

	static {
		System.out.println("I am in Static  Block");
	}
	static {
		System.out.println("I am in Static  Block1");
	}
}

// Static methods belong to the class, not to any particular object.
