package ru.danilov.api.homework3;

import java.util.*;

/**
 * Задание
 *
 * Пусть дан произвольный список целых чисел.
 *
 * 1) Нужно удалить из него чётные числа
 * 2) Найти минимальное значение
 * 3) Найти максимальное значение
 * 4) Найти среднее значение
 */


public class Program3 {
    static Random random = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> mainList = randomNumbersList(10, 50);
        System.out.println(mainList);
        mainList = removEvenNumbers(mainList);
        System.out.println(mainList);
        int minNumber = findMin(mainList);
        System.out.println(minNumber);
        int maxNumber = findMax(mainList);
        System.out.println(maxNumber);
        double avgNumber = averageValue(mainList);
        System.out.println(avgNumber);


    }

   public static ArrayList<Integer> randomNumbersList(int size, int bound) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        size = random.nextInt(5, 15);
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(1, 51));
        }
        return arrayList;

    }

    public static ArrayList<Integer> removEvenNumbers(ArrayList<Integer> list){
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i) %2 ==0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    public static Integer findMin(ArrayList<Integer> list) {
        list.sort(Comparator.naturalOrder());
        return list.get(0);
    }

    public static  Integer findMax(ArrayList<Integer> list) {
        list.sort(Comparator.reverseOrder());
        return list.get(0);
    }

    public static Double averageValue(ArrayList<Integer> list) {
        int sum = 0;
        double avgValue = 0;
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }
        avgValue = sum / list.size();
        return  avgValue;
    }
}
