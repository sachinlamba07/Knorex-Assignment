package Kornex.Main;

import java.util.HashMap;
import java.util.Map;

import Knorex.Entity.ParkingLot;
import Knorex.Entity.Vehicle;
import Knorex.Entity.VehicleType;


public class ParkingLotMain {

	public static void main(String[] args) {
		
		Map<VehicleType, Integer> capacityPerType = new HashMap<>();
        capacityPerType.put(VehicleType.CAR, 2);
        ParkingLot parkingLot = new ParkingLot(1, 2, capacityPerType);

        // Adding vehicles
        Vehicle car1 = new Vehicle("BMW", "red",VehicleType.CAR);
        parkingLot.addVehicle(car1);

        Vehicle car2 = new Vehicle("TATA","White", VehicleType.CAR);
        parkingLot.addVehicle(car2);

        // Checking availability
        parkingLot.checkAvailability(1, VehicleType.CAR);

        // Removing vehicle
        parkingLot.removeVehicle("BMW");
        parkingLot.removeVehicle("TATA");

        // Checking availability after removal
        parkingLot.checkAvailability(1, VehicleType.CAR);

	}

}
