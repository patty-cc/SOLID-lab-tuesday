package com.example.user.solidruntracker;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 12/09/2017.
 */
public class DistanceCompTest {

    DistanceComp distanceComp;
    Athlete athlete1;
    Athlete athlete2;
    Run run1;
    Run run2;

    @Before
    public void before(){
        distanceComp = new DistanceComp( "Marathon");
        athlete1 = new Athlete("Jim");
        athlete2 = new Athlete("Bobby");
        run1 = new Run( 20, 1.5, 100);
        run2 = new Run( 15, 1.2, 75);
        athlete1.addActivity(run1);
        athlete2.addActivity(run2);
    }

    @Test
    public void testCompetitionName(){
        assertEquals( "Marathon", distanceComp.getName());
    }

    @Test
    public void testArrayIsEmpty(){
        assertEquals( true, distanceComp.getAthletes().isEmpty());
    }

    @Test
    public void testAddAthlete(){
        distanceComp.addToComp(athlete1);
        assertEquals( 1 , distanceComp.getAthletes().size());
    }

    @Test
    public void testDecideWinner(){
        assertEquals( athlete1, distanceComp.decideWinner());
    }

}