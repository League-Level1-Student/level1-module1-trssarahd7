public class SmurfRunner {

	public static void main(String[] args) {

		Smurf handy = new Smurf("Handy");
		handy.eat();
		System.out.println(handy.getName());
		System.out.println(handy.getHatColor());
		System.out.println(handy.isGirlOrBoy());
		
		Smurf papa = new Smurf("Papa Smurf");
		papa.eat();
		System.out.println(papa.getName());
		System.out.println(papa.getHatColor());
		System.out.println(papa.isGirlOrBoy());
		
		Smurf et = new Smurf("Smurfette");
		et.eat();
		System.out.println(et.getName());
		System.out.println(et.getHatColor());
		System.out.println(et.isGirlOrBoy());
		
		// * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him
		// eat, and print his name.
		// * 3&4 see comments in code below
		// * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
		// * 6. Make a Smurfette and print her name, hat color and girl or boy.

	}

}
