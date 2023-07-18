package ru.danilov.api.homework4;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class HomeWork4 {
    static Scanner scanner = new Scanner(System.in);
    static LinkedList<String> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        boolean flag = true;
        while(flag) {
            System.out.print("Введите номер задачи (1 - Задача 1; 2 - Задача 2; 0 - Выход из программы): ");
            int taskNumber = scanner.nextInt();
            switch (taskNumber) {
                case 1:
                    System.out.println("Задача 1: ");
                    task1();
                    break;
                case 2:
                    System.out.println("Задача 2: ");
                    task2();
                    break;
                case 0:
                    System.out.println("Работа завершена");
                    flag = false;
                    break;
                default:
                    System.out.println("Ошибка ввода. Такого приложения нет. Повторите ввод!");
            }
        }
        //task1();
        //task2();
    }



    public static void task1() {

        //1. Пусть дан LinkedList с несколькими элементами.
        // Реализуйте метод, который вернет “перевернутый” список.


        linkedList.add("Один");
        linkedList.add("Два");
        linkedList.add("Три");
        System.out.println(linkedList);
        revers(linkedList);
        System.out.println(linkedList);

    }
    static LinkedList<String> revers(LinkedList<String> newList){
        for(int i = 0; i <newList.size()/2; i++){
            String temp = newList.get(i);
            newList.set(i, newList.get(newList.size() - i - 1));
            newList.set(newList.size() - i - 1, temp);
        }
        return newList;
    }

    public static void task2(){
       LinkedList<Integer> linkedList = new LinkedList<>();
       /**
        *  Реализуйте очередь с помощью LinkedList со следующими методами:
        *  enqueue() - помещает элемент в конец очереди,
        *  dequeue() - возвращает первый элемент из очереди и удаляет его,
        *  first() - возвращает первый элемент из очереди, не удаляя.
        */
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        int x =1;

        System.out.println("Исходный список: " + linkedList);
        enqueue(linkedList, 4);
        System.out.println("Добавили элемент в конец очереди: " + linkedList);
        System.out.println("Первый элемент: "+dequeue(linkedList));
        System.out.println("Первый элемент из очереди удален: "+ linkedList);
        System.out.println("Первый элемент: "+ firstElemetn(linkedList));
        System.out.println("Первый элемент не удален: " + linkedList);

    }

    public static void enqueue(LinkedList lsEnqueue, int num){
        lsEnqueue.addLast(num);
    }
    public static int dequeue(LinkedList lsDequeue){
        int num = (int) lsDequeue.get(0);
        lsDequeue.remove(0);
        return num;
    }
    public static int firstElemetn(LinkedList lsFirst){
        int element = (int) lsFirst.get(0);
        return element;
    }
}
