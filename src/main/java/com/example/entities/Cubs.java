package com.example.entities;

public class Cubs implements Team {
    @Override
    public String getName() {
        return "Chicago Cubs";
    }

    public String toString() {
        return getName();
    }
}
