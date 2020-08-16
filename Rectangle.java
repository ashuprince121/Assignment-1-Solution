// Que 2

import java.util.Scanner;

public class Rectangle {
    int width;
    int height;
    void display(){
        System.out.println(width+" "+height);
    }

}
class RectangleArea extends Rectangle{

    Scanner inp=new Scanner(System.in);
    void read_inputs(){
        width=inp.nextInt();
        height=inp.nextInt();

    }
    void display(){  //override display method of Rectangle class
        System.out.println("Area = "+width*height);

    }


}
class Main {
    public static void main(String args[]) {// Driver Function
       Rectangle r=new Rectangle();
       RectangleArea rr=new RectangleArea();
       rr.read_inputs();
       rr.display();

    }
}