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
	
	public void increaseAcc(int acc) {
		if (!(currentAcceleration == maxAcceleration)) {
			if (currentAcceleration + acc > maxAcceleration) {
				this.currentAcceleration = this.maxAcceleration;
			}
			else {
				this.currentAcceleration = this.currentAcceleration + acc;
			}
		}
	}
	public void decreaseAcc(int acc) {
		if (!(currentAcceleration == 0)) {
			if (currentAcceleration - acc < 0) {
				this.currentAcceleration = 0;
			}
			else {
				this.currentAcceleration = this.currentAcceleration - acc;
			}
		}
	}
	
}
