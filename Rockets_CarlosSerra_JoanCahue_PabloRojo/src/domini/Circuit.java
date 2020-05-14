package domini;

public class Circuit {

	public double maxDistance;
	public int maxTime;
	
	public Circuit(double maxDistance, int maxTime) {
		this.maxDistance = maxDistance;
		this.maxTime = maxTime;
	}
	
	public double getMaxDistance() {
		return this.maxDistance;
	}
	
	public int getMaxTime() {
		return this.maxTime;
	}
	
}

