package org.example.model;

public class Lamp {
    private LampType style;
    private boolean battery;
    private int globRating;

    public Lamp(LampType style, boolean isBattery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }

    public LampType getStyle() {
        return style;
    }

    public int getGlobRating() {
        return globRating;
    }

    public boolean isBattery() {
        return battery;
    }
}
