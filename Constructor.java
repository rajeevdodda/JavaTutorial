public class Constructor {
    public static void main(String args[]) {
        Calculator calc = new Calculator();

        System.out.println(calc.num1);

        Calculator calc2 = new Calculator(10);
        System.out.println(calc2.num1);

        Calculator calc3 = new Calculator(3.5);
        System.out.println(calc3.num1);
    }

}

class Calculator {
    int num1;
    int num2;
    int result;

    public Calculator() {
        num1 = 5;
        num2 = 10;
        System.out.println("In Constructor");
    }

    public Calculator(int n) {
        num1 = n;
        num2 = n;
        System.out.println("In Constructor");
    }

    public Calculator(double n) {
        num1 = (int) n;
        num2 = (int) n;
        System.out.println("In Constructor double");
    }

}
