/*
 * @author Mykal Burris
 * @since 9/5/16
 * @version 1
 * Java class that computes and prints a circle's area and circumference
 */

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args){

        double radius;
        double circumference;
        double area;
        double pi = Math.PI;

        System.out.println("Please enter a radius value: ");
        Scanner stdin = new Scanner(System.in);
        radius = stdin.nextDouble();

        if (radius > 0){
            area = pi * radius * radius;
            circumference = 2.0 * pi * radius;
            System.out.println("Area: " + area);
            System.out.println("Circumference: " + circumference);
        }
        else {
            System.out.println("The entered radius is <= 0...Exiting Program");
        }

    }
}
