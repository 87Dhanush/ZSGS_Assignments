package com.assignment;
import java.util.Scanner;
public class DayName {
        enum Days {
            SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");

            int dayNumber = scanner.nextInt();
            if (dayNumber >= 1 && dayNumber <= 7) {
                Days day = Days.values()[dayNumber - 1];
                System.out.println("The day is: " + day);
            } else {
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
            }
        }
    }

//4. Write a Java program that gets a number from the user and displays the name of the weekday. Use enum