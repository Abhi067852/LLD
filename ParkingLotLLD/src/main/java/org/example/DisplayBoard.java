package org.example;

import org.example.enums.ParkingSpotType;

public class DisplayBoard {
    void displayMessage(ParkingSpotType parkingSpotType, int freeSpots) {
        System.out.println(parkingSpotType);
        System.out.println("Available Spots" + freeSpots);
    }
}
