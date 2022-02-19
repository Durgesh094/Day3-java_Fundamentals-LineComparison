package com.bridge.linecomparison;

import java.util.Scanner;

public class EqualLines {
    public static void main(String[] args) {
        String a1, a2, b1, b2;
        double p1, p2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a1: ");
        a1 = sc.next();
        System.out.println("Enter b1: ");
        b1 = sc.next();
        System.out.println("Enter a2: ");
        a2 = sc.next();
        System.out.println("Enter b2: ");
        b2 = sc.next();

        System.out.println("Result 1: " + a1.equals(a2));
        System.out.println("Result 2: " + b1.equals(b2));

        if (a1.equals(a2) && b1.equals(b2)) {
            System.out.println("Two lines are equal");
        } else {
            System.out.println("Two lines are not equal");
        }
    }
}
