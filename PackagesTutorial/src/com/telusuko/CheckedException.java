package com.telusuko;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckedException {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter a number");
        BufferedReader br = null;
        int i = 0;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            i = Integer.parseInt(br.readLine());

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            br.close();
        }

        try (BufferedReader brr = new BufferedReader(new InputStreamReader(System.in))) {
            i = Integer.parseInt(br.readLine());
        }
        System.out.println(i);
    }

}
