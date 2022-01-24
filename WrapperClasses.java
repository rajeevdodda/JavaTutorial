public class WrapperClasses {

    public static void main(String[] args) {
        int i = 5; // primitive data type

        Integer ii = new Integer(i); // Boxing - Wrapping

        int j = ii.intValue(); // Un boxing - Un wrapping

        Integer value = i; // Auto boxing

        int k = value; // auto unoboxing

        String str = "123";

        int n = Integer.parseInt(str);
        System.out.println(n);
    }

}
