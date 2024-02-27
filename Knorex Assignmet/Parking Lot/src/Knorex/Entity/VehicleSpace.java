package Knorex.Entity;

public class VehicleSpace {

	private int spaceNumber;
    private boolean isAvailable;
    private VehicleType vehicleType;

    public VehicleSpace(int spaceNumber, VehicleType vehicleType) {
        this.spaceNumber = spaceNumber;
        this.isAvailable = true;
        this.vehicleType = vehicleType;
    }

    public int getSpaceNumber() {
        return spaceNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void occupy() {
        isAvailable = false;
    }

   
}
