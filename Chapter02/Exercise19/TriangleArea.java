package com.liang.y.daniel.chapter.two;

/* Write a program that prompts the user to enter three points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then
displays its area. The formula for computing the area of a triangle is:

    s = (side1 + side2 + side3) / 2;
    area = sqrt(s(s - side1)(s - side2)(s - side3)) */

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        System.out.print("Enter the coordinates of three points separated by spaces: ");
        Scanner in = new Scanner(System.in);
        double firstX = in.nextDouble();
        double firstY = in.nextDouble();
        double secondX = in.nextDouble();
        double secondY = in.nextDouble();
        double thirdX = in.nextDouble();
        double thirdY = in.nextDouble();
        // Formula for distance between two points is: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        double sideOne = Math.pow((Math.pow(secondX - firstX, 2) + Math.pow(secondY - firstY, 2)), 0.5);
        double sideTwo = Math.pow((Math.pow(thirdX - secondX, 2) + Math.pow(thirdY - secondY, 2)), 0.5);
        double sideThree = Math.pow((Math.pow(firstX - thirdX, 2) + Math.pow(firstY - thirdY, 2)), 0.5);

        double s = (sideOne + sideTwo + sideThree) / 2;
        double area = Math.pow((s * ((s - sideOne) * (s - sideTwo) * (s - sideThree))), 0.5);
        System.out.println("The area of the triangle is: " + area);
    }
}
