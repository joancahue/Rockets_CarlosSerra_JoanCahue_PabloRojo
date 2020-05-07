package domini;

public class Deposit {

	private double liters;
	
	public Deposit(double liters) {
		this.liters = liters;
	}
	
	public double getLiters() {
		return this.liters;
	}
	
	public void setLiters(int vel) {
		this.liters = this.liters - oilConsum(vel);;
	}
	
	public double oilConsum (int vel) {
		return 0.02 * Math.pow(vel,2);
	}
}