package com.company.model;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListArray {
    public static void main(String[] args) {

        ArrayList<String>  list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();

        list.add(0,"Jemmy");
        list.add(1,"Helen");
        list.add(2,"Steve");
        list.add(3,"Marry");
        list.add(4,"Tony");
        list.add(5,"James");
        list.add(6,"Sally");
        list1.add("Max");
        list.addAll(0,list1);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.clone());

        LinkedList<String> linkedList = new LinkedList<>();
    }
}
