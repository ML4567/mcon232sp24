package hw8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            method1();
            System.out.print("A ");
        } catch (RuntimeException e) {
            System.out.print("B ");
        }
        System.out.print("C ");
    }

    public static void method1() {
        try {
            method2();
            System.out.print("D ");
        } catch (ArithmeticException e) {
            System.out.print("E ");
        }
        System.out.print("F ");
    }

    public static void method2() {
        try {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.print((7 / x) + " ");
            String[] arr = new String[x];
            System.out.println(arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.print("H ");
        }
        System.out.print("I ");
    }
}

