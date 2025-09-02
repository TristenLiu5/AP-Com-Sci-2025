package robot;

import kareltherobot.*;

public class Roomba implements Directions {

	// Main method to make this self-contained
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		String worldName = "robot/basicRoom.wld";

		Roomba cleaner = new Roomba();
		int totalBeepers = cleaner.cleanRoom(worldName, 7, 6);
		System.out.println("Roomba cleaned up a total of " + totalBeepers + " beepers.");


	}

	// declared here so it is visible in all the methods!
	private Robot roomba;

	// You will need to add many variables!!
	int mygoat = 0;


	public int cleanRoom(String worldName, int startX, int startY) {

		// A new Robot should be constructed and assigned to the global (instance) variable named roomba that is declared above.
        // Make sure it starts at startX and startY location.

		World.readWorld(worldName);
		World.setVisible(true);
		World.setDelay(20);


		/** This section will have all the logic that takes the Robot to every location
		 * and cleans up all piles of beepers. Think about ways you can break this
		 * large, complex task into smaller, easier to solve problems.
		 */

		Robot roomba = new Robot(7,6,East,0);



		// the line below causes a null pointer exception
		// what is that and why are we getting it?
		for (int l = 1; l <= 3; l++)
			for (int j = 1; j <= 2; j++)
			{
				for(int i = 1; i <= 7; i++)
				{
					roomba.move();
				}
				roomba.turnLeft();

				for(int i = 1; i <= 4; i++)
				{
					roomba.move();
				}
				roomba.turnLeft();
			}
			roomba.move();
			roomba.turnLeft();
			roomba.move();
			for (int helpME = 1; helpME <= 3; helpME++)
			{
				roomba.turnLeft();
			}	

		
			

		int totalBeepers = 0; // Need to move this somewhere else.
        // This method should return the total number of beepers cleaned up.
		return totalBeepers;
	}
}
