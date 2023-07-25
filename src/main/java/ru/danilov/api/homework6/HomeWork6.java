package ru.danilov.api.homework6;

import java.util.HashSet;

public class HomeWork6 {

    public static void main(String[] args) {
        homelessCats();

    }
    static void homelessCats(){

       Cat cat2 = new Cat(2, "Белый", "Мурзик", 4);
       Cat cat3 = new Cat(2, "Белый", "Мурзик", 4);
       Cat cat4 = new Cat(1, "Белый", "Мурзик", 4);

        HashSet<Cat> catHashSet = new HashSet<>();
        catHashSet.add(new Cat(2, "Серый", "Мурзик", 2 ));
        catHashSet.add(new Cat(2, "Серый", "Мурзик", 2 ));
        catHashSet.add(new Cat(3, "Черный", "Барсик", 1 ));
        catHashSet.add(new Cat(5, "Черно-белый", "Кузя", 2 ));
        catHashSet.add(new Cat(5, "Черно-белый", "Кузя", 2 ));
        catHashSet.add(new Cat(2, "Серый", "Мурзик", 2 ));


        System.out.println(catHashSet);
        System.out.println(cat2.equals(cat3));
        System.out.println(cat2.equals(cat4));
        System.out.println(catHashSet);

    }

}
