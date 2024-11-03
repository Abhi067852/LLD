package org.example;

import org.example.ParkingSpot.ParkingSpot;
import org.example.enums.ParkingSpotType;

import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

public class ParkingFloor {
    Map<ParkingSpotType, ArrayList<ParkingSpot>> parkingSpots;
    String parkingFloorId;
    DisplayBoard displayBoard;

    public ParkingFloor(Map<ParkingSpotType, ArrayList<ParkingSpot>> parkingSpot) {
        this.parkingSpots = parkingSpot;
        this.parkingFloorId = UUID.randomUUID().toString();
        this.displayBoard = new DisplayBoard();
    }
}
