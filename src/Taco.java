
public class Taco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DONE
		Taco taco = new Taco ("chocolate", "crisp");
		taco.setSauce("cheese");
		taco.setShell("soft");
	}

	String sauce;
	String shell;

	Taco(String sauce, String shell) {
		this.sauce = sauce;
		this.shell = shell;
	}

	String getSauce() {
	return sauce;
	}

	String getShell() {
	return shell;
	}

	void setSauce(String sauce) {
		this.sauce = sauce;
	}
	
	void setShell(String shell) {
		this.shell = shell;
	}

		
}
