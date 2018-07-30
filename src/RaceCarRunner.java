
public class RaceCarRunner {
	public static void main(String[] args) {

		RaceCar car = new RaceCar("Nike", 5);
		System.out.println(car.getPositionInRace());

		car.crash();

		System.out.println(car.isDamaged());

		car.pit();

		for (int i = 0; i < 7; i++) {

			car.overtake();
		}
	}

	// 1. Create a RaceCar and place it in 5th position

	// 2. Print the RaceCar's position in the race

	// 3. Crash the RaceCar

	// 4. If the car is damaged. Bring it in for a pit stop.

	// 5. Help the car move into first place.

}
