package org.koreait;

public class Main {
    public static void main(String[] args) {
        int num1 = 0;   // 처음 시작 값 0
        int num2 = 1;   // 보조용? 두번째 값 1
        int num3 = 0;   // 출력되는 값, 합쳐지는 최종값
        for (int i = num1; i < 10; i++) {
            System.out.print(num3 + " ");
            num1 = num2;    // 0->1...
            num2 = num3;    // 1->0...
            num3 = num1 + num2; // 합쳐지는 값?
        }
    }
}

