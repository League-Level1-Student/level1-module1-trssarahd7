
public class Person {
	
	
	
	String name;
	String superpower;
	
	Person(String name, String superpower) {
		this.name = name;
		this.superpower = superpower;
	}
	
	public String toString() {
		return name + " has mad " + superpower + " skills";
	}

	String getName() {
		return name;
		}

		String getSuperpower() {
		return superpower;
		}

		void setName(String name) {
			this.name = name;
		}
		
		void setSuperpower(String superpower) {
			this.superpower = superpower;
		}
	
		// TODO Auto-generated method stub

		
	//	4. Create a Person class, with 2 member variables - name and superpower.

	//	5. Using the pattern in Part 1, add getter and setter methods for the member variables of the Person class.

	//	6. Now, make a Runner class that creates 3 different people, sets their superpowers, and prints the value returned by the default toString() method. 

	//	7. Override the default toString() method by implementing a toString() method on the Person class that returns "<name> has mad <superpower> skills". 

	}

