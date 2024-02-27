package Knorex.Entity;

public class Vehicle {

	private String registrationNumber;
	private String colour;
    private static VehicleType vehicleType;

    public Vehicle(String registrationNumber,String colour, VehicleType vehicleType) {
        this.registrationNumber = registrationNumber;
        this.colour=colour;
        this.vehicleType = vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public static VehicleType getVehicleType() {
        return vehicleType;
    }
   
}
