package com.company;

public class Car extends Vehicle {
    private int numWheels;
    private int numDoors;
    private int numGears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, String color, int topSpeed, int numWheels, int numDoors, int numGears, boolean isManual, int currentGear) {
        super(name, size, color, topSpeed);
        this.numWheels = numWheels;
        this.numDoors = numDoors;
        this.numGears = numGears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + currentGear);
    }

    public void changeSpeed(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeSpeed(): Speed " + speed + " direction " + direction);
    }

//    @Override
//    public void stop() {
//        super.stop();
//    }
}
