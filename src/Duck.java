
// I know this is called "Duck.java" but it is actually the instructions of IntrotoObjects.

public class Duck {

	int numfriend;
	String food;

	Duck(int numfriend, String food) {
		this.numfriend = numfriend;
		this.food = food;
	}

	void Quack() {
		System.out.println("Quack quack");
	}

	void Waddle() {
		System.out.println("Waddle waddle");
	}
}

class Salmon {

	int age;
	String name;

	Salmon(int age, String name) {
		this.age = age;
		this.name = name;
	}

	void Swim() {
		System.out.println("Swim swim");
	}

	void Sleep() {
		System.out.println("ZzZzZ");
	}
}

class Runner {
	public static void main(String[] args) {

		Duck doug = new Duck(40, "pizza");
		Salmon philip = new Salmon(10, "philip");
		doug.Quack();
		philip.Sleep();

	}
}
