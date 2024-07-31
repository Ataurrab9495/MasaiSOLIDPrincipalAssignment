
public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setHeight(4);
        rect.setWidth(5);
        rect.getArea();
        System.out.println();
        Square square = new Square();
        square.setSide(4);
        square.getArea();
    }
}


/* 
class Rectangle {
    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(double height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}
 */
/* what i did here is :-
 * 1. Separate Rectangle and Square: A Square is not a special kind of Rectangle but rather a shape with equal sides. Hence, they should not inherit from each other.
   
   2. Define a Common Interface: Both Rectangle and Square can implement a common interface for calculating area.
 */

interface calculateArea {
    void getArea();
}

class Rectangle implements calculateArea {
    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void getArea() {
        double res = this.width * this.height;
        System.out.println("Rectangle Area:- " + res);
    }

}

class Square implements calculateArea {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    public void getArea() {
        double res = this.side * this.side;
        System.out.println("Square Area:- " + res);
    }
}