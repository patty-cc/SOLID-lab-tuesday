package com.example.user.solidruntracker;

import java.util.ArrayList;

/**
 * Created by user on 12/09/2017.
 */

public class Athlete {

    private String name;
    private ArrayList<Activity> activities;

    public Athlete( String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }

    public void addActivity(Activity activity) {
        this.activities.add(activity);
    }


    public int totalTime() {
        int total = 0;
        for (Activity activity : this.getActivities()){
            total += activity.getTime();
        }
        return total;

    }

    public double totalDistance() {
        Double total = 0.0;
        for (Activity activity : this.getActivities()){
            total += activity.getDistance();
        }
        return total;
    }

    public int totalAltitude() {
        int total = 0;
        for (Activity activity : this.getActivities()){
            total += activity.getAltitude();
        }
        return total;
    }
}
