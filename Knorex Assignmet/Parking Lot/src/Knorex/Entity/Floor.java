package Knorex.Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Floor {
	private int floorNumber;
    private Map<VehicleType, Integer> capacityPerType;
    private Map<Integer, VehicleSpace> vehicleSpaces;

    public Floor(int floorNumber, Map<VehicleType, Integer> capacityPerType) {
        this.floorNumber = floorNumber;
        this.capacityPerType = capacityPerType;
        this.vehicleSpaces = new HashMap<>();
        initializeSpaces();
    }

    private void initializeSpaces() {
        for (Map.Entry<VehicleType, Integer> entry : capacityPerType.entrySet()) {
            VehicleType vehicleType = entry.getKey();
            int capacity = entry.getValue();
            for (int i = 1; i <= capacity; i++) {
                vehicleSpaces.put(i, new VehicleSpace(i, vehicleType));
            }
        }
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Map<Integer, VehicleSpace> getVehicleSpaces() {
        return vehicleSpaces;
    }   
}
