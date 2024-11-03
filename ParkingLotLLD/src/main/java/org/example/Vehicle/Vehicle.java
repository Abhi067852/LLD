package org.example.Vehicle;

import org.example.enums.VehicleType;

import java.util.UUID;

public class Vehicle {

    VehicleType vehicleType;
    String license_plate_number;

    public Vehicle(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
        this.license_plate_number = UUID.randomUUID().toString();
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public String getLicensePlateNumber() {
        return license_plate_number;
    }

}
