
public class GameLoop implements Runnable{

	private boolean running;
	private final double UPDATERATE = 1.0d/60.0d;	//This is setting the rate of the game loop
	
	private long nextStatTime;
	private int fps, ups;
	
	@Override
	public void run() {
		running = true;
		double accumulator = 0;
		long currentTime, lastUpdate = System.currentTimeMillis();
		
		//This is the game loop
		while(running) {
			currentTime = System.currentTimeMillis();
			double lastRenderTimeInSeconds = (currentTime - lastUpdate) / 1000d;
			accumulator += lastRenderTimeInSeconds;
			lastUpdate = currentTime;
			
			//This while loop is called 60 times
			while(accumulator > UPDATERATE) {
				update();	//Calls the update method
				accumulator -= UPDATERATE;
			}
			render();	//Calls the render method
			printStats();	//Prints the stats to the console
		}
	}

	private void printStats() {
		if(System.currentTimeMillis() > nextStatTime) {
			System.out.println(String.format("FPS: %d, UPS: %d", fps, ups));
			fps = 0;
			ups = 0;
			nextStatTime = System.currentTimeMillis() + 1000;
		}
	}

	private void render() {
		++fps;
	}

	private void update() {
		++ups;
	}

}
