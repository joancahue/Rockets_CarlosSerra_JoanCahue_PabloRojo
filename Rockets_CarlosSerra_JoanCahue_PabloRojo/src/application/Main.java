import domini.Circuit;
import domini.Rocket;

public class Main {
	
	public Rocket rocket;
	
	public static void Main(String [] args) {
		
		Circuit c = new Circuit(800, 10);
		int time = 1;
		int maxTime = 10;
				
		
		Rocket rocket = new Rocket();
		
		System.out.println("Starting competition. Circuit length: 800 Max time: 10");
		
		while(time > maxTime && rocket.getLiters() <= 0) {
			
			nextMove(time);
			
		}
	}
	
	public static void nextMove(int time) {
		
		if(time < 3)//1 i 2
			movement(15);
		if(time > 2 && time < 5)//3 i 4
			movement(10);
		if(time > 4)// 5, 6, 7, 8, 9 i 10
			movement(2);
		
	}
	
	public static void movement(int acc) {	
		
		//int speed = this.rocket.
		
		printMove();	
	}
	
	public static void printMove(int time, int acc, int speed, int distance, double fuel) {
		System.out.println("Current time: "+time+" Acceleration: "+acc+" Speed: "+speed+" Distance: "+distance+" Circuit: 800 Fuel: "+fuel+"/1800");
	}
	
}

























