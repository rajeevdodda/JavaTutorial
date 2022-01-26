package com.telusuko;

public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            int a[] = new int[6];
            a[9] = 10;
            int i = 9 / 0;

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Bye");
        }
    }
}
