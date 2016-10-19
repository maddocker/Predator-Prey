/*	PredatorPrey by Kyle Madlon (started 03/17/2015)
*
*	This class represents the basic structure of all Creature objects. As of
*	right now, the logic of this class has not been completely figured out,
*	and it is in a testing stage. Stand by for improvements.
*/

import java.util.Random;

public class Creature
{

//-------------------- Initialization -------------------------------

	// 2D coordinates for scene
	private int x;
	private int y;

	// Scene model (initialization to be moved to child classes)
	private char model;

	public Creature( int inRows, int inColumns, char inModel )
	{
		// Random number generator
		Random random = new Random();

		x = random.nextInt( inColumns );
		y = random.nextInt( inRows );
		model = inModel;
	}

//-------------------- Standard Gets/Sets (To Be Deprecated) --------

	public void setX( int inX )
	{
		x = inX;
	}

	public void setY( int inY )
	{
		y = inY;
	}

	public void setModel( char inModel )
	{
		model = inModel;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public char getModel()
	{
		return model;
	}

//-------------------- Stat Modifiers (Internal) --------------------


//-------------------- Refresh --------------------------------------

//-------------------- Stat Modifiers (External) --------------------
}
