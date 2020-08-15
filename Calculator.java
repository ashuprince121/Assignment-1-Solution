public class Calculator {

    @FunctionalInterface
    interface calC {
        int solve(int number1, int number2);
    }

     int sol(int a, int b, calC c) {
        return c.solve(a, b);
    }

     void add(int i, int i1) {   // Overrides method operate in class Calculator
        calC add = (number1, number2) -> number1 + number2;
        System.out.println(sol(i, i1, add));
    }

    void difference(int i, int i1) { // Overrides method operate in class Calculator
        calC subs = (number1, number2) -> number1 - number2;
        System.out.println(sol(i, i1, subs));
    }

     void product(int i, int i1) {   // Overrides method operate in class Calculator
        calC mul = (number1, number2) -> number1 * number2;
        System.out.println(sol(i, i1, mul));
    }

    private void safeDivision(int i, int i1) {    // Overrides method operate in class Calculator
        calC div = (number1, number2) -> number1 / number2;
        System.out.println(sol(i, i1, div));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(20,10);
        calculator.difference(20,10);
        calculator.product(10,10);
        calculator.safeDivision(20,10);
    }
}