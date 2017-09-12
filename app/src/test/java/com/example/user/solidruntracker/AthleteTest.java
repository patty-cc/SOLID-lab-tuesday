package com.example.user.solidruntracker;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 12/09/2017.
 */
public class AthleteTest {

    Athlete athlete;
    Run run1;
    Run run2;

    @Before
    public void before(){
        athlete = new Athlete("Jim");
        run1 = new Run( 20, 1.5, 100);
        run2 = new Run( 15, 1.2, 75);
    }

    @Test
    public void atheleteHasName() {
        assertEquals("Jim", athlete.getName());
    }

    @Test
    public void newAthleteStartsWithNoActivities(){
        assertEquals(true, athlete.getActivities().isEmpty());
    }

    @Test
    public void canAddActivity(){
        athlete.addActivity(run1);
        assertEquals( 1, athlete.getActivities().size());
    }

    @Test
    public void testAthleteTotalTime(){
        athlete.addActivity(run1);
        athlete.addActivity(run2);
        assertEquals( 35, athlete.totalTime() );
    }

    @Test
    public void testAthleteTotalDistance(){
        athlete.addActivity(run1);
        athlete.addActivity(run2);
        assertEquals( 2.7, athlete.totalDistance(), 1e-6 );
    }

    @Test
    public void testAthleteTotalAltitude(){
        athlete.addActivity(run1);
        athlete.addActivity(run2);
        assertEquals( 175, athlete.totalAltitude() );
    }

}