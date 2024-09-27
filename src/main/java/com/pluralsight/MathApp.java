package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {

        // Question 1:
        // declare variables here
        int bobSalary = 50000; // Bob's salary
        int garySalary = 60000; // Gary's salary
        // then code solution
        int highestSalary = Math.max(bobSalary, garySalary);
        // then use System.out.println() to display results
        System.out.println("The highest salary is " + highestSalary + ".");

        // Question 2:
        // declare variables here
        int carPrice = 20000; // Car price
        int truckPrice = 30000; // Truck price
        // then code solution
        int smallestPrice = Math.min(carPrice, truckPrice);
        // then use System.out.println() to display results
        System.out.println("The smallest price is " + smallestPrice + ".");

        // Question 3:
        // declare variables here
        double radius = 7.25;
        // then code solution
        double areaOfCircle = Math.PI * radius * radius;
        // then use System.out.println() to display results
        System.out.println("The area of a circle whos radius is " + radius + " is " + (radius * radius * Math.PI));

        // Question 4:
        // declare variables here
        double number = 5.0;
        // then code solution
        double squareRoot = Math.sqrt(number);
        // then use System.out.println() to display results
        System.out.println("The square root of " + number + " is " + squareRoot + ".");

        // Question 5:
        // declare variables here
        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;
        // then code solution
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
                // then use System.out.println() to display results
        System.out.println("The distance between the points is " + distance + ".");

        // Question 6:
        // declare variables here
        double negativeNumber = -3.8;
        // then code solution
        double absoluteValue = Math.abs(negativeNumber);
        // then use System.out.println() to display results
        System.out.println("The absolute value is " + absoluteValue + ".");

        // Question 7:
        // declare variables here
        double randomNumber = Math.random();
        // then code solution
        System.out.println("The random number is " + randomNumber + ".");


    }

}