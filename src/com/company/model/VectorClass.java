package com.company.model;

import javax.naming.BinaryRefAddr;
import java.beans.PropertyEditorManager;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorClass {

    public static void main(String[] args) {

        int select = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("What do you want to do");

        while (sc.hasNext()) {
            int select1 = 0;
            if (sc.hasNext()) {
                select1 = sc.nextInt();
            }
            switch (select1) {
                case 1:
                    System.out.println("HELLO");
                    break;
                case 2:
                    System.out.println("By");
                    break;
                default:
                    System.out.println(" hz");
            }
        }
    }
}
