package com.company;

public class Mustang extends Car {
    private int roadService;

    public Mustang(String color, int currentGear, int roadService) {
        super("Mustang", "RWD", color, 180, 4, 5, 6, false, 1);
        this.roadService = roadService;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentSpeed() + rate;

        if(newVelocity == 0) {
            stop();
        } else if(newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if(newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if(newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        }  else {
            changeGear(4);
        }

        if(newVelocity > 0) {
            changeSpeed(newVelocity, getCurrentDirection());
        }
    }
}
