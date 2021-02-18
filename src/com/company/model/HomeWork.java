package com.company.model;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {

        String start;
        String exit;
        String enter;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter start interval");
            start = scan.nextLine();
            System.out.println("Enter and interval");
            exit = scan.nextLine();

            for (int i = Integer.parseInt(start); i <= Integer.parseInt(exit); i++) {
                if (i % 5 == 0) {
                    System.out.println("The value of number is = " + i);}
                }
                System.out.println("Enter E or e to exit");
                enter = scan.nextLine();
        }while (!enter.toLowerCase().contains("e")) ;
    }
}
