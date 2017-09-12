package com.example.user.solidruntracker;

/**
 * Created by user on 12/09/2017.
 */

public class Run implements Activity {

    private int time;
    private Double distance;
    private int altitude;

    public Run( int time, double distance, int altitude){
        this.time = time;
        this.distance = distance;
        this.altitude = altitude;
    }

    public int getTime() {
        return time;
    }

    public Double getDistance() {
        return distance;
    }

    public int getAltitude() {
        return altitude;
    }
}
