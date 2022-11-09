package com.javacourse;

import java.util.Scanner;

public class Pension {
        public static void main(String a[]) {
        Scanner myscanner=new Scanner(System.in);
        int years;
        double savings;
        System.out.println(" Number of years the user has until retirement");
        years=myscanner.nextInt();
        while(years<=0)
        {

            System.out.println(" Please enter a valid number");
            years=myscanner.nextInt();
        }
        System.out.println(" Enter amount of money you can save annually");
        savings=myscanner.nextDouble();
        while(savings<=0)
        {

            System.out.println(" Please enter a valid number");
            savings=myscanner.nextDouble();
        }
        System.out.println("Total savings after "+years + "years = "+savings*years);
    }
}
