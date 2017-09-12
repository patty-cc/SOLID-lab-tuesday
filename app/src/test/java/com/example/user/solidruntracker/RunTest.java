package com.example.user.solidruntracker;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 12/09/2017.
 */
public class RunTest {

    Run run;

    @Before
    public void before(){
        run = new Run( 20, 1.5, 100);
    }

    @Test
    public void runHasDetails(){
        assertEquals( 20, run.getTime());
        assertEquals( 1.5, run.getDistance(), 0.01);
        assertEquals( 100, run.getAltitude());
    }

}