interface Shape{
    public double calcArea();
    public String ShapeName();
}

class Point implements Shape{
    private int x;
    private int y;

    public Point(){}

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "x = " + x + ", y = " + y;
    }

    @Override
    public double calcArea() {
        return 0.0;
    }

    @Override
    public String ShapeName(){
        return "Point";
    }
}

class Circle extends Point{
    private Point origin;
    private int radius;

    public Circle(Point p, int radius){
        this.origin = p;
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "Circle" + origin.toString() + ", radius = " + this.radius;
    }

    @Override
    public double calcArea(){
        return Math.PI*this.radius * this.radius;
    }

    @Override
    public String ShapeName(){
        return "Circle";
    }
}

public class TestProblem2{
    public static String determineShapeName(Shape s){
        return s.ShapeName();
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        Point p = new Point(2,3);
        System.out.println(p);

        Circle c = new Circle(p,4);
        System.out.println(c.calcArea());
        System.out.println("Shape:" + determineShapeName(c));
        System.out.println("Shape:" + determineShapeName(p));
    }
}