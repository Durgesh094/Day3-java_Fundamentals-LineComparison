package com.bridge.linecomparison;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        int a1, a2, b1, b2;
        double distance;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a1: ");
        a1 = sc.nextInt();
        System.out.println("Enter b1: ");
        b1 = sc.nextInt();
        System.out.println("Enter a2: ");
        a2 = sc.nextInt();
        System.out.println("Enter b2: ");
        b2 = sc.nextInt();

        distance = Math.sqrt((a2-a1) * (a2-a1) + (b2-b1) * (b2-b1));
        System.out.println("Distance Between Two Points: " + "(" + a1 + "," + b1 + ")," + "(" + a2 + "," + b2 + ") = " + distance);
    }
}
