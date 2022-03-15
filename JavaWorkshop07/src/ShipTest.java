import java.util.ArrayList;

public class ShipTest {

	public static void main(String[] args) {
		
		ArrayList<Ship> list = new ArrayList<Ship>();
		
		Boat boat = new Boat("Boat01", 500);
		Cruise cruise = new Cruise("Cruise01", 1000);
		
		list.add(boat);
		list.add(cruise);
		
		System.out.println("shipName\tfuelTank");
		System.out.println("--------------------------");
		for (Ship ship : list) {
			System.out.println(ship.getShipName() + "   \t" + ship.getFuelTank());
		}
		
		System.out.println();
		System.out.println("10운항");
		System.out.println("shipName\tfuelTank");
		System.out.println("-------------------------------");
		for (Ship ship : list) {
			if(ship instanceof Boat) {
				ship.sail(10);
			}
			if(ship instanceof Cruise) {
				ship.sail(15);
			}
			System.out.println(ship.getShipName() + "   \t" + ship.getFuelTank());
		}
		
		System.out.println();
		System.out.println("50 주유");
		System.out.println("shipName\tfuelTank");
		System.out.println("-------------------------------");
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) instanceof Boat) {
				list.get(i).refuel(20);
			}
			if(list.get(i) instanceof Cruise) {
				list.get(i).refuel(30);
			}
			System.out.println(list.get(i).getShipName() + "   \t" + list.get(i).getFuelTank());
		}
	}

}
