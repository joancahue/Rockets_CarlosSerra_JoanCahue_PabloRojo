package domini;

public class Circuit {

	public double maxDistance;
	public int maxTime;
	
	public Circuit(double maxDistance, int maxTime) {
		this.maxDistance = maxDistance;
		this.maxTime = maxTime;
	}
	
	
	public static void Main(String [] args) {
		
		Circuit c = new Circuit(800, 10);
		int time = 1;
		int maxTime = 10;
				
		
		Rocket rocket = new Rocket();
		
		System.out.print("Starting competition. Circuit length: 800 Max time: 10");
		
		while(time > maxTime) {
			
			nextMove(time);
			
		}
	}
	
	public static void nextMove(int time) {
		
		if(time < 3)
			movement(15);
		if(time > 2 && time < 5)
			movement(10);
		if(time > 4)
			movement(2);
		
	}
	
	public static void movement(int acceleration) {
		
		
		
		printMove();
		
	}
	
	public static void printMove() {
		
	}
	
}
