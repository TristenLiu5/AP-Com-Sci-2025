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

	// You will need to add many variables!!
	int totalBeepers = 0;
	int pileSize = 0;
	int largestPile = 0;
	int largestPileX = 0;
	int largestPileY = 0;
	int area = 1;
	boolean shutdown = false;
	int pileAmount = 0;



	public int cleanRoom(String worldName, int startX, int startY) {

		// A new Robot should be constructed and assigned to the global (instance) variable named roomba that is declared above.
        // Make sure it starts at startX and startY location.

		World.readWorld(worldName);
		World.setVisible(true);
		World.setDelay(5);


		/** This section will have all the logic that takes the Robot to every location
		 * and cleans up all piles of beepers. Think about ways you can break this
		 * large, complex task into smaller, easier to solve problems.
		 */

		Robot roomba = new Robot(7,6,East,0);



		// the line below causes a null pointer exception
		// what is that and why are we getting it?

		
		while (shutdown == false)
		{
				while (roomba.frontIsClear() == true)
				{
					pileSize = 0;
					if (roomba.nextToABeeper() == true)
					{
						pileAmount++; //amount of beeper piles, not total amount of beepers
					}
					while (roomba.nextToABeeper())
					{
						roomba.pickBeeper();
						totalBeepers++;
						pileSize++;
					}
					if (pileSize > largestPile) //largest pile
					{
						largestPile = pileSize;
						largestPileX = roomba.street();
						largestPileY = roomba.avenue();
					}
				
				roomba.move();
				area++; //area of room
				
				}
				if (roomba.frontIsClear() == false) //thing to make the roomba turn
				{
				
					if (roomba.nextToABeeper() == true) //see if there are beepers against the wall
					{
					pileAmount++;
					}
					while (roomba.nextToABeeper())
					{
					roomba.pickBeeper();
					totalBeepers++;
					pileSize++;
					}

					if (roomba.facingEast() == true) //turn to the left
					{
					roomba.turnLeft();
						if (roomba.frontIsClear() == true)
						{
						roomba.move();
						area++;
						roomba.turnLeft();
						}
						else
						{
						shutdown = true; //stops the while loop if roomba can't turn
						}
					}
					else if (roomba.facingWest() == true) //turn to the right
					{
					for (int turnRight = 1; turnRight <= 3; turnRight++)
					{
					roomba.turnLeft();
					}
						if (roomba.frontIsClear() == true)
						{
						roomba.move();
						area++;
						for (int turnRight = 1; turnRight <= 3; turnRight++)
						{
						roomba.turnLeft();
						}
						}
						else
						{
							shutdown = true; //stops the while loop if roomba can't turn
						}
					}
			}	
		}
		
		//final results and printing
		System.out.println("Total area of room: " + area);
		System.out.println("Total amount of piles: " + pileAmount);
		System.out.println("Largest Pile = " + largestPile);
		System.out.println("Largest pile coordinates: ("+ largestPileX + " , " + largestPileY + ")");
		System.out.println("Pecent dirty: " + ((double) area/pileAmount));
		System.out.println("Pile Average: " + (double) totalBeepers/pileAmount);
		

			

		// Need to move this somewhere else.
        // This method should return the total number of beepers cleaned up.
		return totalBeepers;

	}
}
