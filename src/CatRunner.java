
public class CatRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat azrael = new Cat("azrael");
		azrael.meow();
		azrael.printName();
		for (int i = 0; i < 9; i++) {
			azrael.kill();
		}

		// 1. Make the Cat meow
		// 2. Get the Cat to print it's name
		// 3. Kill the Cat!
	}

}
