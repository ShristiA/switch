package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner sc = new Scanner(System.in);
    // creating sc object from Scanner class.
    int monthDays;

    System.out.println("Enter number of days in a month");
    monthDays = sc.nextInt();
    // asking and inputting the month's day
    switch(monthDays){
        // creating cases where monthDays could just be the following numbers
        case 30:
        System.out.println( "April, June, September, November");
        break;
        // to break the statement so that the cases can move down,
        case 31:
            System.out.println(" January, March, May, July, August, October, December");
        break;
        case 28:
            System.out.println( "February");
        break;
        default:
        System.out.println("the days of month is invalid");
        break;
        // final default and break value to terminate the program.

    }
    }
}
