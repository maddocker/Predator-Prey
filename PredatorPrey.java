/*	PredatorPrey by Kyle Madlon (started 03/17/2015)
*
*	The meat and potatoes of this operation. Most logic should
*	happen here, but independent logic such as experience rising
*	and bumping up the Creature to a new level have been placed
*	in the generic Creature class. Time will tell how this project
*	turns out; it may never reach true "completion".
*/

import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

public class PredatorPrey {
    public static void main(String args[]) {

//-------------------- Initialization (GUI/ArrayList/Creatures) -----

    // Set size of world
    int ROWS = 10;
    int COLUMNS = 10;

    // Create GUI
    TestFrame testFrame = new TestFrame();

    // Create scene array, populate with "empty" environment
    char[][] scene = new char[ROWS][COLUMNS];
    for(int row = 0; row < scene.length; row++)
    {
        for(int column = 0; column < scene[0].length; column++)
        {
            scene[row][column] = '_';
        }
    }

    // Create new ArrayList for Creatures
    ArrayList<Creature> creatures = new ArrayList<Creature>();
    creatures.add(new Creature(ROWS, COLUMNS, 'M'));
    creatures.add(new Creature(ROWS, COLUMNS, 'L'));

    // Variables for each Creature's position
    int x;
    int y;

    // Collect position information for Creatures, send to scene
    for(int i = 0; i < creatures.size(); i++)
    {
        x = creatures.get(i).getX();
        y = creatures.get(i).getY();
        scene[y][x] = creatures.get(i).getModel();
    }

    // Send scene array to GUI
    testFrame.setScene(scene);

//-------------------- Movement Logic -------------------------------

//-------------------- Interaction Logic ----------------------------

    }
}