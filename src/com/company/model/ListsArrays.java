package com.company.model;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListsArrays {
    public static void main(String[] args) {

        ArrayList listName = new ArrayList();// создание эррей листа

        listName.add("Tom");
        listName.add("Jeff");
        listName.add("Garry");
        listName.add("Jemmy");

        ArrayList listCity = new ArrayList();// создание 2 эррей листа

        listCity.add("Tomsk");
        listCity.add("Omsk");
        listCity.add("Ekat");
        listName.add("Jeff");

        //  listName.addAll(listCity);

        //System.out.println(listName);

        // for (int i = 0 ; i < listName.size(); i++) {

        //     if (listName.size() > listCity.size()) {
        //         listName.addAll(listCity);
        //         break;
        //     }
        // }
        // for (int i = 0; i <listName.size();i++){
        //     System.out.println(listName);
        // }
        // System.out.println(listName.lastIndexOf("Jeff"));
        // System.out.println(listName.remove(4));
        // System.out.println(listName);

        ArrayList list = new ArrayList();

        list.add("SSS");
        list.add("SAS");
        list.add("a");
        list.add(3);
        list.add(4);
        list.add("d");

        //System.out.println(list);
        //System.out.println(list.size());

        ArrayList list2 = new ArrayList();

        list2.add("aCV");
        list2.add("ABS");
        list2.add("ABA");
        list2.add("ABDX");
        list2.add("ABAZ");
        list2.add("ABV");

        // System.out.println(list2);
        //System.out.println(list2.size());

        // list.retainAll(list2);

        //System.out.println(list);
        //System.out.println(list.size());
        // System.out.println(list.subList(0,3));
        //getPlanetAtmosphere(1);
        //  System.out.println(getPlanetAtmosphere(1));
        getPlanetAtmosphere();
        //  System.out.println(getPlanetAtmosphere(8) + "\n" + getPlanetAtmosphere(2));

    }

    public static List<String> getPlanetAtmosphere() {

        String start;

        Scanner scan = new Scanner(System.in);

        start = scan.nextLine();

        int seqNumberForSun;

        seqNumberForSun = Integer.parseInt(start);

        List<String> result = new ArrayList<>();

            switch (seqNumberForSun) {
                case 1:
                    result.add("Нет атмосферы");
                    System.out.println(result.get(0));
                    break;
                case 2:
                case 4:
                    result.add("Углекислый Газ");
                    break;
                case 3:
                    result.add("Углекислый Газ");
                    System.out.println(result.get(1));
                    result.add("Aзот");
                    result.add("Кислород");
                    break;
                case 5:
                case 6:
                    result.add("водород");
                    result.add("Гелий");
                case 7:
                case 8:
                    result.add("Метан");
                    result.add("Водород");
                    result.add("Гелий");
                    break;
                default:
                    break;
            }
            return result;
        }
    }