class Objects{
    public static void main(String argsp[]){

        Calculator calc; //reference
        calc = new Calculator(); // creating object
        System.out.println(calc);

        calc.num1 = 10;
        calc.num2 = 20;
        System.out.println(calc.result);  // result = 0
        calc.perform();
        System.out.println(calc.result);
    }
}

class Calculator{
    int num1;
    int num2;
    int result;
    
    public void perform(){
        result = num1 + num2;
        System.out.println(result);
    }

}