package ru.danilov.api.homework5;

import java.util.*;

public class HomeWork5 {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Задание
     * Написать простой класс Телефонный Справочник (с помощью HashMap), который хранит в себе список фамилий и телфонных номеров.
     * В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
     * Следует учесть, что под одной фамилией может быть несколько телефонов(в случае однофамильцев),
     * тогда при запросе такой фамилии должны выводиться все телефоны.
     * ***Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
     * взаимодействие с пользователем через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника.
     */
    public static void main(String[] args) {
        //getMap(addNum());
        //System.out.println(getMap(addNum()));
        //getNum(addNum());
        boolean flag = true;
        while(flag) {
            System.out.print("Введите номер команды (1 - Вывести телефонный справочник ; 2 - Поиск контакта ; 0 - Выход из программы): ");
            int taskNumber = scanner.nextInt();
            switch (taskNumber) {
                case 1:
                    System.out.println("Телефонный справочник: ");
                    System.out.println(getMap(addNum()));
                    break;
                case 2:
                    System.out.println("Поиск контакат ");
                    getNum(addNum());

                    break;
                case 0:
                    System.out.println("Работа завершена");
                    flag = false;
                    break;
                default:
                    System.out.println("Ошибка ввода. Такого приложения нет. Повторите ввод!");
            }
        }
    }
    public static HashMap<Integer, String> addNum(){

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(865652, "Иванов");
        hashMap.put(984651, "Петров");
        hashMap.put(238656, "Сидоров");
        hashMap.put(328656,"Васильев");
        hashMap.put(148656, "Николаев");
        hashMap.put(785639, "Сидоров");
        hashMap.put(7888656, "Иванов");

        return hashMap;

    }



    public static void getNum(HashMap<Integer, String> hashMap) {
        for (Map.Entry<Integer, String> element : hashMap.entrySet()) {
            if (element.getValue().equals("Иванов")) {
                System.out.println(element.getKey());
            }
        }
    }
    public static  String getMap(Map<Integer, String> names) {
        StringBuilder where = new StringBuilder();
        for (Map.Entry<Integer, String> entry : names.entrySet()) {
            if (entry.getValue() != null) {
                where.append(entry.getValue() + " " + entry.getKey() + "\n");
            }
        }
        return where.toString();
    }
}

