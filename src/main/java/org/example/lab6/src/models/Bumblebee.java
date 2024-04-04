package org.example.lab6.src.models;

import org.example.lab6.src.marker.Transformable;

public class Bumblebee implements Transformable {

    public String color;

    public boolean friendly;

    public Bumblebee(String color, boolean friendly) {
        this.color = color;
        this.friendly = friendly;
    }

    public String getColor() {
        return color;
    }

    public boolean isFriendly() {
        return friendly;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFriendly(boolean friendly) {
        this.friendly = friendly;
    }
}
