# Knorex-Assignment

# Car Parking System

## Overview

This is a simple car parking system implemented in Java. The system supports the parking of different types of vehicles and includes a configurable cost strategy. It provides functionalities such as initializing the parking lot, adding vehicles, removing vehicles, and checking availability on specific floors for a given vehicle type.

## Project Structure

The project is organized into the following classes:

- `Main`: The main class demonstrating the usage of the parking lot and its methods.
- `ParkingLot`: Represents the parking lot and manages vehicle spaces.
- `Vehicle`: Represents a vehicle with attributes such as vehicle type and registration number.
- `VehicleSpace`: Represents a vehicle space with attributes like space number, availability, and vehicle type.
- `Floor`: Represents a floor in the parking lot with attributes like floor number, capacity for each vehicle type, and vehicle spaces.
- `CostStrategy`: Represents the cost strategy for parking, allowing for varying costs based on the vehicle type.

## Usage

1. **Initialization**: Use the `ParkingLot` constructor to initialize the parking lot with the desired number of floors and vehicle spaces per floor for each vehicle type.

2. **Adding Vehicles**: Call the `addVehicle` method to add a vehicle to the parking lot. Provide the vehicle type, registration number, and any other necessary attributes.

3. **Removing Vehicles**: Call the `removeVehicle` method to remove a vehicle from the parking lot based on the registration number.

4. **Checking Availability**: Call the `checkAvailability` method to check the availability of vehicle spaces on a specific floor for a given vehicle type.

## Example

```java
public class Main {
    public static void main(String[] args) {
        // Initialization
        Map<VehicleType, Integer> capacityPerType = new HashMap<>();
        capacityPerType.put(VehicleType.CAR, 2);
        ParkingLot parkingLot = new ParkingLot(1, 2, capacityPerType);

        // Adding vehicles
        Vehicle car1 = new Vehicle("BMW1", VehicleType.CAR);
        parkingLot.addVehicle(car1);

        Vehicle car2 = new Vehicle("KIA1", VehicleType.CAR);
        parkingLot.addVehicle(car2);

        // Checking availability
        parkingLot.checkAvailability(1, VehicleType.CAR);

        // Removing vehicle
        parkingLot.removeVehicle("KIA1");

        // Checking availability after removal
        parkingLot.checkAvailability(1, VehicleType.CAR);
    }
}
