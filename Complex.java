//Que 5
public class Complex {

    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static Complex sum(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return(temp);
    }

    public static Complex difference (Complex n1, Complex n2)
    {
        Complex temp = new Complex(0.0, 0.0);

        temp.real = n1.real - n2.real;
        temp.imag = n1.imag - n2.imag;

        return(temp);
    }
    public static Complex product (Complex n1, Complex n2)
    {
        Complex temp = new Complex(0.0, 0.0);

        temp.real = n1.real * n2.real;
        temp.imag = n1.imag * n2.imag;

        return(temp);
    }

    public static void main(String[] args) {
        Complex n1 = new Complex(4.5, 2.5),
                n2 = new Complex(2.2, 2.0),
                temp,temp1,temp2;

        temp = sum(n1, n2);
        temp1=difference(n1,n2);
        temp2=product(n1,n2);

        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
        System.out.printf("\nDifference = %.1f - %.1fi", temp1.real, temp1.imag);
        System.out.printf("\nProduct = %.1f * %.1fi", temp2.real, temp2.imag);


    }


}