package domini;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import domini.Deposit;

public class Rocket {
	
	private List<Propeller> propellers = new LinkedList<Propeller>();
	private int acceleration;
	private Deposit deposit;
	private String nom;

	
	public Rocket() {
		this.propellers.add(new Propeller(18));
		this.propellers.add(new Propeller(24));
		this.propellers.add(new Propeller(38));
		this.acceleration = sumaAcc();
		this.deposit = new Deposit(1800);
		this.nom = "Star V";
	}
	
	private int sumaAcc() {
		
		Iterator it = propellers.iterator();
		int total = ((Propeller) it.next()).getMaxAcceleration();
		
		while(it.hasNext())
			total += ((Propeller) it.next()).getMaxAcceleration();
		
		return total;
	}

	public String getNom() {
		return nom;
	}
	
}
