package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for (int i = 1; i<=num2; i++) {
            for (int j = 1; j<=num1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}