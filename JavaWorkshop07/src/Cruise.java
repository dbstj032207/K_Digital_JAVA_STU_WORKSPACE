
public class Cruise extends Ship{
	
	public Cruise() {
		super();
	}

	public Cruise(String shipName, int fuelTank) {
		super(shipName, fuelTank);
	}

	@Override
	public void sail(int dist) {
		setFuelTank(getFuelTank() - (dist*13));
		
	}

	@Override
	public void refuel(int fuel) {
		setFuelTank(getFuelTank() + (fuel*8));
		
	}

	
}
