/*	PredatorPrey by Kyle Madlon (started 03/17/2015)
*	
*	This is the class for the PredatorPrey GUI which is nothing more than
*	a simple JFrame with one JLabel representing the array that the
*	simulation will run in. Hopefully, this will be the easiest step in
*	making the project come to fruition. As this is the first source
*	file I've made for this program, I'd like to say that this entire
*	project is but a stepping stone to making a game tentatively called
*	Balance, which will include AI code from this very project. The game
*	will be focused on keeping balance (there it is) in the ecosystem
*	of an entire planet. Notes on this idea can be found on the desktop
*	hard drive.
*/

import java.awt.FlowLayout;			// Component arrangement
import javax.swing.JFrame;			// GUI framework
import javax.swing.JLabel;			// Displays information inside JFrame

public class WindowFrame extends JFrame
{
	// Will display simulation
	private JLabel worldView;

	// JFrame constructor
	public WindowFrame()
	{
		// Set window title
		super( "PredatorPrey" );

		// Set frame layout (may not be necessary)
		setLayout( new FlowLayout() );

		// Construct worldView, text will be changed as scene is created
		worldView = new JLabel( "Your computer is too slow! ;)" );

		// Set tool tip when mouse hovers over simulation
		worldView.setToolTipText( "World View" );

		// Add worldView to JFrame
		add( worldView );
		
		// Set default window settings
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setSize( 400, 200 );
		setVisible( true );
	}

	// Convert char array to String, display in JLabel
	public void setWorldView( char[][] inScene )
	{
		// HTML formatting necessary for line breaks in JLabel
		String inWorldView = "<html><body>";
		for( int row = 0 ; row < inScene.length ; row++ )
		{
			for( int column = 0 ; column < inScene[0].length ; column++ )
			{
				inWorldView = inWorldView + inScene[row][column];
			}
		inWorldView = inWorldView + "<br>";
		}
		inWorldView = inWorldView + "</body></html>";
		worldView.setText( inWorldView );
	}
}
