package ru.danilov.api.homework1;

import java.net.Socket;
import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        while(flag) {
            System.out.println("Укажите номер задачи: ");
            System.out.println("1 - Задача 1");
            System.out.println("2 - Задача 2");
            System.out.println("3 - Задача 3");
            System.out.println("4 - Задача 4");
            System.out.println("0 - Завершение работы приложения");
            int i = scanner.nextInt();
            switch (i){
                case 1:
                    numberTraingulars();
                    break;
                case 2:
                    primeNumbers();
                    break;
                case 3:
                    Calculator.calcOperation();
                    break;
                case 4:
                    System.out.println("Задача 4 не решена :(");
                    break;
                case 0:
                    System.out.println("Завершение работы приложения.");
                    flag = false;
                    break;
                default:
                    System.out.println("Задача под таким именем не существует, \nповторите попытку ввода. ");
            }

            //numberTraingulars();
            //primeNumbers();
            //Calculator.calcOperation();
        }

    }
    /*
     *Вычислить n-ое треугольное число (сумма чисел от 1 до n), n!(произведение чисел от 1 до n)
     */
    static void numberTraingulars(){
        boolean flag = true;
        while(flag) {
            System.out.print("Введите число n: ");
            int number = scanner.nextInt();
            int numberTraingular = (number * (number + 1)) / 2;
            System.out.printf("Треугольное число равно: %d\n", numberTraingular);
            System.out.print("Для продолжения работы введите - 1, для выхода - 0: ");
            int i = scanner.nextInt();
            if(i == 1){
                flag = true;
            } else if(i == 0) {
                flag = false;
                System.out.println("Работа подпрограммы завершена!");
            }
        }
    }

    /*
    Вывести все простые числа от 1 до 1000
     */
    static void primeNumbers(){
        System.out.print("Введите число до которго хотите вывести простые числа: ");
        int number = scanner.nextInt();
        int count = 0 ;
        System.out.println(number);
        for (int i = 2; i <= number; i++) {
            for (int j = 1; j <= i ; j++) {
                if (i % j == 0) count++;
                }
            if (count == 2) {
                System.out.printf(" %d",i);
                count = 0;
            }else{
                count = 0;
            }
        }
    }
}

