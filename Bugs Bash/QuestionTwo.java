/* class Shape {
    public String type;
    public double length;
    public double width;
    public double radius;

    public Shape(String type, double length, double width, double radius) {
        this.type = type;
        this.length = length;
        this.width = width;
        this.radius = radius;
    }
}

class AreaCalculator {
    public double calculateArea(Shape shape) {
        if ("rectangle".equalsIgnoreCase(shape.type)) {
            return shape.length * shape.width;
        } else if ("circle".equalsIgnoreCase(shape.type)) {
            return Math.PI * shape.radius * shape.radius;
        }
        return 0;
    }
} */

abstract class Shape{
    public abstract double calculateArea();
}

class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return this.length * this.width;
    }
}

class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}


/* 1. rectangle class is representation of single responsibility principal.
 * 2. and class AreaCalculator is following the open-closed principal.
 */

