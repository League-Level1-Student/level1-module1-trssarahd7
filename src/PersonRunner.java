
public class PersonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
//	6. Now, make a Runner class that creates 3 different people, sets their superpowers, and prints the value returned by the default toString() method. 

//	7. Override the default toString() method by implementing a toString() method on the Person class that returns "<name> has mad <superpower> skills". 
	Person bob = new Person ("Bob", "kindness");
	Person roger = new Person ("Roger", "levitating wholegrain bread" );
	Person mike = new Person ("Mike", "programming");
	System.out.println(bob.toString());
	System.out.println(roger.toString());
	System.out.println(mike.toString());
		
	}

}
