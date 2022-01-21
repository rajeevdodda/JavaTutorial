public class ThisKeyWord {
    public static void main(String args[]) {
        Calculator2 calc = new Calculator2(3, 5);
        calc.perform();
    }

}

class Calculator2 {
    int num1;
    int num2;
    int result;

    public Calculator2(int number1, int number2) {
        this.num1 = number1;
        this.num2 = number2;
        System.out.println("In Constructor");
    }

    void perform() {
        this.result = this.num1 + this.num2;
        System.out.println("Result : " + this.result);
    }
}
