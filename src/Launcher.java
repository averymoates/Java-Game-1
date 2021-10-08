
public class Launcher {

	public static void main(String[] args) {
		Display display = new Display(800, 600, "New Game Title" );	//Creating a new window/JFrame using the Display class constructor
		new Thread(new GameLoop()).start();
	}
}
