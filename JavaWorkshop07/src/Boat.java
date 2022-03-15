
public class Boat extends Ship{
	
	public Boat() {
		super();
	}

	public Boat(String shipName, int fuelTank) {
		super(shipName, fuelTank);
	}

	@Override
	public void sail(int dist) {
		setFuelTank(getFuelTank() - (dist*10));
		
	}

	@Override
	public void refuel(int fuel) {
		setFuelTank(getFuelTank() + (fuel*10));
		
	}

	
}