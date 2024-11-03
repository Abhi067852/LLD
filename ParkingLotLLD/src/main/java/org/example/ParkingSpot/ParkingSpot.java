package org.example.ParkingSpot;

import org.example.Vehicle.Vehicle;
import org.example.enums.ParkingSpotType;

import java.util.UUID;

public class ParkingSpot {

    String parkingSpotID;
    boolean isSpotAvailable;
    Vehicle vehicle;
    ParkingSpotType parkingSpotType;

    public ParkingSpot(ParkingSpotType parkingSpotType) {
        this.parkingSpotID = UUID.randomUUID().toString();
        this.isSpotAvailable = true;
        this.vehicle = null;
        this.parkingSpotType = parkingSpotType;
    }
    boolean isSpotFree(){
        return isSpotAvailable;
    }
    ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }
    String getParkingSpotId() {
        return parkingSpotID;
    }
    Vehicle getVehicleDetails() {
        return vehicle;
    }
    void assignVehicleToSpot(Vehicle vehicle) {
        this.vehicle = vehicle;
        isSpotAvailable = false;
    }
    void leaveVehicleFromSpot() {
        this.vehicle = null;
        isSpotAvailable = true;
    }

}
