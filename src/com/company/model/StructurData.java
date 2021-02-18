package com.company.model;

import java.util.Scanner;

public class StructurData {
    public static void main(String[] args) {

        //int[] massiv = new int[5];// длина 5 элементов , цулочисленный //
        //int[] mass = new int[]{2, 5};// второй вариант создания
        //System.out.println(mass.length + " "+ massiv.length);//вывод массива через метод length

        //massiv[3] = 4; // номерация в массиве начинает с нуля  0 1 2 3
        //System.out.println(massiv[3]);// вывод значения по идексом 3

       // for(int i = 0;i < massiv.length;i++) {
       //     System.out.println(massiv[i]);
       // }
      // int b = 3;
      // int a = 1;
      // int c = 24;

       // massiv[2] = b;
       // massiv[0] = a;
       // massiv[1] = //b//;
       // //if(b < massiv.length){
       // //    System.out.println(massiv[b]);//проверем есть ли место  массиве
        //}
       // int db = 500;
//
       // for (int i = 0; i < massiv.length; i++) {
       //     if (massiv[i] == 0) {
       //         massiv[i] = db;
       //         break;
       //     }
       // }
       // for (int i = 0;i < massiv.length;i++){
       //     System.out.println(massiv[i]);
       // }
        //for (int i = 0; i < massiv.length; i++)
        //    System.out.println(massiv[i]);

        int[] mass = new int[10] ;

        Scanner scan = new Scanner(System.in);

        mass[0] = 40;

        for (int i = 0; i < mass.length;i++){
            System.out.println(mass[i]);
        }

    }
}
