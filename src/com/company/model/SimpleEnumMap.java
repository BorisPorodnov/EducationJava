package com.company.model;
import javax.swing.*;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedTransferQueue;

public class SimpleEnumMap {
    public static void main(String[] args) {

        Map<Animal,String> enumMap = new EnumMap<Animal,String>(Animal.class); // типизируем ключ типом Animal а значение будет строки название ссыл enumMap
        // и создаим обьект и какой тип энум будет использоватьсяя

        enumMap.put(Animal.CAT,"C");//
        enumMap.put(Animal.DOG,"D");
        enumMap.put(Animal.BIRD,"B");

        ///////////////////////////////////
        //тут мы не можем просто воспользоваться иттераторм, потому что в енумМэп нет МапЭнтри  интерфейса
        // по этому мы создадим Сет в Сет передади ЭнтриСет и дальше иттератором пробежимся по Сету

        Set set = enumMap.entrySet(); // Мы передали ему ЭнтриСет , теперь необходимо иттератором пробежаться

        for (Object o : set) { // set.iter tab ,  У нас создался иттератор типа обджект,
            // после этого обратимся к интерфейсу мапэнтри , можно его даже не типизировать дженериком
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey() + " " + m.getValue() );
        }
        Map<House, String> houseMap = new EnumMap<House, String>(House.class);

        houseMap.put(House.oneRoom,"Однокомнатная квартира");
        houseMap.put(House.twoRoom,"Двухкомнатная квартира");
        houseMap.put(House.threeRoom,"Трехкомнатная квартира");

        Set set1 = houseMap.entrySet();
        for (Object o : set1) { // тип данных, переменная , карта или массив черезкоторый нужно пробежаться
            Map.Entry h  = (Map.Entry)o;// приведение к другому типу
            System.out.println(h.getKey() + " " + h.getValue());
        }
    }
}
    enum Animal{
        CAT, DOG, BIRD;
    }
    // Итон EnumMap стоит применять только тогда когда у нас испульзуются перечисления
    // По этому перечисления мы передаем в качестве ключа в Мапу и в кажестве значения другой тип
    // что это позволяет ? Это позволяет реализовать enumMap в качестве массивов поэтому все методы будут выполняться за константное время
    // Так же качестве ключа мы не не можем поместить null, а в value можем.
    // енумМап у нас не является синхронизированной картой
    // если мы хоти сделать синхронизированной то мы обращаемся к классу Collections и вызываем метод synchronizedMap(и пердам сюда обьект еnumMap)
    enum House {
            oneRoom, twoRoom, threeRoom;
        }