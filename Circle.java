//Que 4
public class Circle{

    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }
    public Circle(double radius){

        this.radius  = radius;
    }
    public double getRadius(){

        return this.radius;
    }
    public double getArea(){

        return (3.1428*this.radius*this.radius);
    }
}