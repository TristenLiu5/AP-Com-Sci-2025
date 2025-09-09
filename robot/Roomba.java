package robot;

import kareltherobot.*;

public class Roomba implements Directions {

	// Main method to make this self-contained
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		String worldName = "robot/basicRoom.wld";

		Roomba cleaner = new Roomba();
		int totalBeepers = cleaner.cleanRoom(worldName, 7, 6);
		System.out.println("You cleaned a total of " + totalBeepers + " Beepers!");


	}

	// declared here so it is visible in all the methods!
	private Robot roomba;

	// You will need to add many variables!!
	int totalBeepers = 0;
	int totalSteps = 0;
	int pileTotal = 0;
	int pileMax = 0;
	boolean shutdown = false;



	public int cleanRoom(String worldName, int startX, int startY) {

		// A new Robot should be constructed and assigned to the global (instance) variable named roomba that is declared above.
        // Make sure it starts at startX and startY location.

		World.readWorld(worldName);
		World.setVisible(true);
		World.setDelay(15);


		/** This section will have all the logic that takes the Robot to every location
		 * and cleans up all piles of beepers. Think about ways you can break this
		 * large, complex task into smaller, easier to solve problems.
		 */

		Robot roomba = new Robot(7,6,East,0);



		// the line below causes a null pointer exception
		// what is that and why are we getting it?

		
		while (shutdown == false)
		{
			{
				while (roomba.frontIsClear() == true)
				{
					pileTotal = 0;
					while (roomba.nextToABeeper())
					{
						roomba.pickBeeper();
						totalBeepers++;
						pileTotal++;
					}
					if (pileTotal > pileMax)
					{
						pileMax = pileTotal;
						System.out.println("Current Max = " + pileMax);
					}
				
				roomba.move();
				totalSteps++;
				
				}
				if (roomba.frontIsClear() == false)
				{
					if (roomba.facingEast() == true)
					{
					roomba.turnLeft();
						if (roomba.frontIsClear() == true)
						{
						roomba.move();
						totalSteps++;
						roomba.turnLeft();
						}
						else
						{
							shutdown = true;
						}
					}
					else
					{
					roomba.turnLeft();
					roomba.turnLeft();
					roomba.turnLeft();
						if (roomba.frontIsClear() == true)
						{
						roomba.move();
						roomba.turnLeft();
						roomba.turnLeft();
						roomba.turnLeft();
						}
						else
						{
							shutdown = true;
						}
					}
				}	
			}
		}
		System.out.println("Roomba took " + totalSteps + " steps!");
			

		// Need to move this somewhere else.
        // This method should return the total number of beepers cleaned up.
		return totalBeepers;

	}
}
