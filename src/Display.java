import javax.swing.JFrame;
import java.awt.*;

public class Display extends JFrame{

	private Canvas canvas;
	
	//Display constructor
	public Display(int width, int height, String title) {
		setTitle(title);	//Setting the title of the window/JFrame
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//Making sure that the window/JFrame terminates correctly
		setResizable(false);
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));	//Setting the size of the canvas object
		canvas.setFocusable(false);
		add(canvas);	//Adding the canvas object to the window/JFrame
		pack();
		
		setLocationRelativeTo(null);	//Making the window/JFrame appear in the center of the screen
		setVisible(true);	//Making the window/JFrame viewable
	}
	
}
