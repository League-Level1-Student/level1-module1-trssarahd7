package extra;

public class IntrotoObjects {

	public static void main(String[] args) {
		new IntrotoObjects().Duck("bread", 12);
	}

	public void Duck(String food, int friends) {
		System.out.println("Not doing Main :)");
		this.food = "pizza";
		this.friends = 20;
	}

	public void Cat(String name, int sleep) {

	}
}
// Instructions
// Objects have a name, member variables, and methods
// 1. Create a Duck class in your java project. Add its member variables and
// methods to match the CRC card. Now add the code for the constructor of the
// Duck class:

// Duck(String favoriteFood, int numberOfFriends) {
// this.favoriteFood = favoriteFood;
// this.numberOfFriends = numberOfFriends; }

// 2. Now pick your favorite animal and describe it in CRC form with at least 2
// member variables and 2 methods (write it on the whiteboard).

// 3. Create a java class for your animal including:
// member variables
// methods(with sysouts)
// a constructor that sets the member variables

// 4. Create a new java class. This will be a "runner" or "driver" class, so it
// will need a main method.

// 5. In your runner class, create a Duck object (instance) by calling its
// constructor as follows:

// Duck daffy = new Duck("donuts",5);

// Now you have a duck object, you can make it quack:

// daffy.quack();

// 6. Now create an instance of your animal (Hint: see step 5 above) and call
// its methods.

// new IntrotoObjects().duck();
// }
// public void duck() {
