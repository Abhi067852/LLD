package org.example;

import org.example.Vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.UUID;

public class ParkingTicket {
    String parkingTicketId;
    Vehicle vehicle;
    String parkingSpotId;
    String parkingFloorId;
    LocalDateTime startTime;
    LocalDateTime endTime;
    int amount;

    public ParkingTicket(Vehicle vehicle, String parkingSpotId, String parkingFloorId) {
        this.parkingTicketId = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.parkingSpotId = parkingSpotId;
        this.parkingFloorId = parkingFloorId;
    }

    public String getLicence_plate_number() {
        return vehicle.getLicensePlateNumber();
    }



    public String getParkingSpotId() {
        return parkingSpotId;
    }



    public String getParkingFloorId() {
        return parkingFloorId;
    }


    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }




}
