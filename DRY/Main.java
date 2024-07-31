package DRY;

public class Main {
    public static void main(String[] args){
        printArea(new Square(4));
        printArea(new Circle(7));
    }

    public static void printArea(CalculateArea area){
        System.out.println(area.calculateArea());
    }
}

interface CalculateArea{
    double calculateArea();
}

class Square implements CalculateArea{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double res = side * side;
        return Math.round((res*100.0)/100.0);
    }
}

class Circle implements CalculateArea {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double res = Math.PI * radius * radius;
        return Math.round((res*100.0)/100.0);
    }
}

