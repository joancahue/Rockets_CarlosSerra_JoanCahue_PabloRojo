package domini;

public class Propeller {
	
	
	private final int maxAcceleration;
	private int currentAcceleration;
	
	public Propeller(int maxAcceleration) {
		this.maxAcceleration = maxAcceleration;
		this.currentAcceleration = 0;
	}
	
	public int getMaxAcceleration() {
		return this.maxAcceleration;
	}
	
	public int getCurrentAcceleration() {
		return this.currentAcceleration;
	}
	
	public void setCurrentAcceleration(int acc) {
		
		if(acc > this.maxAcceleration) {
			this.currentAcceleration = this.maxAcceleration;
		}
		else {
			this.currentAcceleration = acc;
		}
		
		this.currentAcceleration += acc;
	}
	
}
