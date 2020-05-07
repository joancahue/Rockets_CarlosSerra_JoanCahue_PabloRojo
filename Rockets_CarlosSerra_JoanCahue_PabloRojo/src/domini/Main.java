
public class Main {
	
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
