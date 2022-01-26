package com.telusuko;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("Enter a number to scan");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(n * 10);
    }

}
