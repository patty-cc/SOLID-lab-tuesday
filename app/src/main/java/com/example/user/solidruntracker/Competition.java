package com.example.user.solidruntracker;

import java.util.ArrayList;

/**
 * Created by user on 12/09/2017.
 */

public abstract class Competition {

    private String name;


    public Competition(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
