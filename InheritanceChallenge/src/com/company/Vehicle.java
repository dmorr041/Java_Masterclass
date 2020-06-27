package com.company;

public class Vehicle {
    private String name;
    private String size;
    private String color;
    private int currentSpeed;
    private int currentDirection;
    private final int topSpeed;

    public Vehicle(String name, String size, String color, int topSpeed) {
        this.name = name;
        this.size = size;
        this.color = color;

        this.currentSpeed = 0;
        this.currentDirection = 0;
        this.topSpeed = topSpeed;
    }

    public void steer(int direction) {
        this.currentDirection = direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees");
    }

    public void move(int speed, int direction) {
        currentSpeed = speed;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentSpeed + " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void stop() {
        this.currentSpeed = 0;
    }

    //    public void speedUp(float increaseInSpeed) {
//        if (this.currentSpeed - increaseInSpeed <= 0) {
//            System.out.println("Cannot speed up by " + increaseInSpeed + " mph. Top speed reached. Slow down!");
//            this.currentSpeed = this.topSpeed;
//        } else {
//            System.out.println("Speeding up to " + (this.currentSpeed + increaseInSpeed) + " mph" );
//            this.currentSpeed += increaseInSpeed;
//        }
//    }
//
//    public void slowDown(float decreaseInSpeed) {
//        if (this.currentSpeed - decreaseInSpeed <= 0) {
//            System.out.println("Cannot slow down by " + decreaseInSpeed + " mph. Slowing down to a halt");
//            this.currentSpeed = 0;
//        } else {
//            System.out.println("Slowing down to " + (this.currentSpeed - decreaseInSpeed) + " mph");
//            this.currentSpeed -= decreaseInSpeed;
//        }
//    }
}
