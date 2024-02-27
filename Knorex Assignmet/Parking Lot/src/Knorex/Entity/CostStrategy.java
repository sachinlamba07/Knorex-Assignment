package Knorex.Entity;

import java.util.HashMap;
import java.util.Map;

public class CostStrategy {
	 private static final Map<VehicleType, Integer> costPerHour = new HashMap<>();

	    public CostStrategy() {
	        costPerHour.put(VehicleType.BIKE, 10);
	        costPerHour.put(VehicleType.CAR, 20);
	        costPerHour.put(VehicleType.TRUCK, 30);
	        costPerHour.put(VehicleType.BUS, 30);
	    
	    }
	    public static int getCostPerHour(VehicleType vehicleType) {
	        return costPerHour.get(vehicleType);
	    }
}
