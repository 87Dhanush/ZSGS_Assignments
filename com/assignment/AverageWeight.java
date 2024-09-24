package com.assignment;
import java.util.Scanner;
public class AverageWeight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double totalWeight = 0.0;

        for (int personNumber = 1; personNumber <= 10; personNumber++) {
            System.out.print("Enter the weight of person " + personNumber+" ");
            double weight = scanner.nextDouble();
            totalWeight += weight;
        }
        double averageWeight = totalWeight / 10;

        System.out.printf("The average weight of the 10 people is: %.2f kgs", averageWeight);

    }
}
//5. Write a program that calculates the average weight of 10 people. Use descriptive and meaningful variable names following Java naming conventions. Use proper datatypes for the variables.