package robot;
import kareltherobot.*;


public class Diamond implements Directions{

    public static void main(String[] args) {

        World.setVisible(true);// allows us to see the run output
        // the bigger the street, the farther north
        World.setSize(20,20);
        World.setDelay(10);


        // The line below creates a Robot that we will refer to as rob
        // Find out what the numbers and direction do!
        // Put rob in a better location for your initials.
        Robot rob = new Robot(15,2,South,900);

        // Want a second robot?  No prob.  They are cheap :)
        //Robot dude = new Robot(7,5,West,9);
        // examples of commands you can invoke on a Robot
        // move one step in the direction it is facing


        // starting the letter R

            rob.move();
            rob.move();
            rob.turnLeft();
            rob.turnLeft();

            for (int k = 1; k <= 4; k++)
            {
                for (int i = 1; i <= 5; i++)
                {
                    rob.move();
                    for (int j = 1; j < 4; j++)
                    {
                        rob.turnLeft();
                    }
                    rob.move();
                    rob.putBeeper();
                    rob.turnLeft();
                }
                for (int l = 1; l <= 3; l++)
                {
                rob.turnLeft();
                }
            }
            


            

        

            

        
            
            

        // done with the line, now on the curve
        // rob.turnLeft();

    }
}
