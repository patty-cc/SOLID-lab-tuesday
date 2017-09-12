package com.example.user.solidruntracker;

import java.util.ArrayList;

/**
 * Created by user on 12/09/2017.
 */

public class DistanceComp extends Competition {

    private ArrayList<Athlete> athletes;

    public DistanceComp(String name) {
        super(name);
        this.athletes = new ArrayList<>();
    }

    public ArrayList<Athlete> getAthletes() {
        return athletes;
    }

    public void addToComp(Athlete athlete) {
        this.athletes.add(athlete);
    }

    public Athlete decideWinner() {
        Athlete winner = null;
        Double currentWinningDistance = 0.0;

        for (Athlete athlete : this.athletes){
            if (athlete.totalDistance() > currentWinningDistance ){
                currentWinningDistance = athlete.totalDistance();
                        winner = athlete;
            }
        }
        return winner;

    }
}
