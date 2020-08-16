//Que 7

import java.util.Scanner;

class Triangle{
    public float getArea(float a, float b, float c){
        float s = (a+b+c)/2f;


        double area = Math.sqrt((s*(s-a)*(s-b)*(s-c))); // formula to calculate Area
        return (float)area;
    }
}
public class Triange {

    Triange(){
        Triangle t = new Triangle();
        Scanner scan = new Scanner(System.in);
        float  a = scan.nextFloat();
        float b =  scan.nextFloat();
        float c = scan.nextFloat();
        System.out.println(t.getArea(a,b,c));
    }

    public static void main(String[] args) {
        Triange tri = new Triange();
    }

}