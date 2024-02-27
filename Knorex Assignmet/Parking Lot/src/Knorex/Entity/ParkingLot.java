package Knorex.Entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;



public class ParkingLot {
	
	 private int totalFloors;
	    private int spacesPerFloor;
	    private Map<Integer, Floor> floors;

	    public ParkingLot(int totalFloors, int spacesPerFloor, Map<VehicleType, Integer> capacityPerType) 
	    {
	        this.totalFloors = totalFloors;
	        this.spacesPerFloor = spacesPerFloor;
	        this.floors = new HashMap<>();
	        initializeFloors(capacityPerType);
	    }

	    private void initializeFloors(Map<VehicleType, Integer> capacityPerType) 
	    {
	        for (int i=1;i<=totalFloors;i++) 
	        {
	            floors.put(i, new Floor(i, capacityPerType));
	        }
	    }

	    public boolean addVehicle(Vehicle vehicle)
	    {
	        for (Floor floor : floors.values())
	        {
	            for (VehicleSpace space:floor.getVehicleSpaces().values()) 
	            {
	                if (space.isAvailable() && space.getVehicleType() == vehicle.getVehicleType())
	                {
	                    space.occupy();
	                    System.out.println("Vehicle added to floor " + floor.getFloorNumber() +space.getSpaceNumber());
	                    return true;
	                }
	            }
	        }
	        System.out.println("No available space for vehicle type.");
	        return false;
	    }

	    public boolean removeVehicle(String registrationNumber) {
	        for (Floor floor : floors.values())
	        {
	            for (VehicleSpace space : floor.getVehicleSpaces().values()) 
	            {
	                if (!space.isAvailable() && space.getVehicleType() == Vehicle.getVehicleType()) 
	                {
	                    space.isAvailable();
	                    System.out.println("Vehicle removed from floor " + floor.getFloorNumber() +
	                            ", space " + space.getSpaceNumber());
	                    return true;
	                }
	            }
	        }
	        System.out.println("Vehicle not found.");
	        return false;
	    }

	    public boolean checkAvailability(int floorNumber, VehicleType vehicleType)
	    {
	        Floor floor = floors.get(floorNumber);
	        if (floor != null)
	        {
	            for (VehicleSpace space : floor.getVehicleSpaces().values())
	            {
	                if (space.isAvailable() && space.getVehicleType() == vehicleType)
	                {
	                    System.out.println("Space available on floor " + floorNumber +" for " + vehicleType);
	                    return true;
	                }
	            }
	            System.out.println("No available space on floor " + floorNumber +" for " + vehicleType);
	        } 
	        else
	        {
	            System.out.println("Invalid floor number.");
	        }
	        return false;
	    }

}
