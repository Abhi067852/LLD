package org.example;

import org.example.Vehicle.Vehicle;

import java.util.UUID;

public class EntryPanel {
    String entryPanelId;
    ParkingTicket parkingTicket;

    public EntryPanel() {
        this.entryPanelId = UUID.randomUUID().toString();
    }

    public String getEntryPanelId() {
        return entryPanelId;
    }
    ParkingTicket getParkingTicket(Vehicle vehicle) {
      return parkingTicket;
    }

    void generateParkingTicket(Vehicle vehicle,String parkingFloorId,String parkingSpotId) {
        this.parkingTicket = new ParkingTicket(vehicle,parkingSpotId,parkingFloorId);
    }


}
