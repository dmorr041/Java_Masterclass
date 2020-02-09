package academy.learnprogramming;

public class Wall {
    private double width;
    private double height;

    public Wall(){}
    public Wall(double height, double width){
        if(width <= 0 && height > 0) {
            this.width = 0;
            this.height = height;
        }
        else if(height <= 0 && width > 0){
            this.height = 0;
            this.width = width;
        }
        else if(height > 0 && width > 0){
            this.width = width;
            this.height = height;
        }
        else if(height <= 0 && width <= 0) {
            this.height = 0;
            this.width = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0){
            this.width = 0;
            return;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 0){
            this.height = 0;
            return;
        }
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }
}