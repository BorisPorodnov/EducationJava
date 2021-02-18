package com.company;

import java.util.ArrayList;

public class ListArray {

    public static void main(String[] args) {

       // Human human = new Human();//  создаю обьект класса Хьюман:  Тип имя = new Ссылка();

        ArrayList<String> people = new ArrayList<>();// Создаю Лист типа Стринг
        people.add("Tom");//добавляю в лист Имена
        people.add(0, "James");// добавляю в лист Имя по индексу

        int  j = 20;

        for(int i = j; i > 9 ; i--){
            for (int k = 0; k < 12;k++) {
                System.out.println(i);
                System.out.println(k);
            }
        }
    }
}
