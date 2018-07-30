import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	public String getHatColor() {
		if (name.equals("Papa Smurf")){
			
		return "My hat is red"; 
		}
		
		else {
			return "My hat is white";
		}
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
		if (name.equals("Smurfette")){
			
			return "I am a girl"; 
			}
			
			else {
				return "I am a boy";
			}
		}
	}





