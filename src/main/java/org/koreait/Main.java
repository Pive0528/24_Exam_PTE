package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();        // 5

        for (int i = num1; i > 0; i--) {       // 5...4...3...2...1
            for (int j = num1-i; j > 0; j--) {    // 0...1...2...3...4
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {    // 5...4...3...2...1
                System.out.print(k+" ");
            }

            System.out.println();
        }
    }
}