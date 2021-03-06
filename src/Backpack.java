
public class Backpack {
	private Pencil pencil;
	private Ruler ruler;
	private Textbook textbook;
	private Tape tape;

	private void packAndCheck() {
		// Your mission is to go to school.
		// 1. First you need to put all your supplies into your backpack - use the
		// putInBackpack(...) methods
		//DONE
		pencil = new Pencil();
		ruler = new Ruler();
		textbook = new Textbook();
		tape = new Tape();

		putInBackpack(pencil);
		putInBackpack(ruler);
		putInBackpack(textbook);
		putInBackpack(tape);
		

		goToSchool();
	}

	public static void main(String[] args) {
		new Backpack().packAndCheck();
	}

	public void putInBackpack(Pencil supply) {
		this.pencil = supply;
		log(supply);
	}

	public void putInBackpack(Ruler supply) {
		this.ruler = supply;
		log(supply);
	}

	public void putInBackpack(Textbook supply) {
		this.textbook = supply;
		log(supply);
	}
	public void putInBackpack(Tape supply) {
		this.tape = supply;
		log(supply);
	}

	private void log(Supply supply) {
		String description;
		if (supply == null) {
			description = "null";
		} else {
			description = supply.getClass().getSimpleName().toLowerCase();
		}

		System.out.println("You put " + description + " in your Backpack");
	}

	public void goToSchool() {
		if (pencil == null || ruler == null || textbook == null || tape == null) {
			System.out.println("ERROR: You are not ready for School!");
		} else {
			System.out.println("Congratulations! You are ready for school");
		}
	}
}

abstract class Supply {
	protected String name;
}

class Pencil extends Supply {
	Pencil() {
		this.name = "pencil";
		System.out.println("You got your pencil!");
	}

	public void write(String writing) {
		System.out.println(writing);
	}
}

class Ruler extends Supply {
	Ruler() {
		this.name = "ruler";
		System.out.println("You found your ruler!!");
	}

	public void measure() {
		System.out.println("Now you can measure your mouse!");
	}
}

class Tape extends Supply {
	Tape() {
		this.name = "tape";
		System.out.println("Tape together your broken heart!");
	}

	public void write(String taping) {
		System.out.println(taping);
	}
}


class Textbook extends Supply {
	Textbook() {
		this.name = "textbook";
		System.out.println("You got your boring textbook");
	}

	public void read() {
		System.out.println("The history of Iceland is long and interesting");
	}
}
