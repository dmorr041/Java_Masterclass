package academy.learnprogramming;

public class Car {
    private int numDoors;
    private int numWheels;
    private String model;
    private String engine;
    private String color;

    public Car() {

    }
    public Car(int numDoors, int numWheels, String model, String engine, String color) {
        this.numDoors = numDoors;
        this.numWheels = numWheels;
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return this.model;
    }
    public int getNumDoors() {
        return this.numDoors;
    }
    public int getNumWheels() {
        return this.numWheels;
    }
    public String getEngine() {
        return this.engine;
    }
    public String getColor() {
        return this.color;
    }
}
