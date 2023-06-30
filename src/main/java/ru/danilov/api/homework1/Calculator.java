package ru.danilov.api.homework1;

import java.util.Scanner;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    /*
   Реализовать простой калькулятор
    */
    static void calcOperation() {
        boolean flag = true;
        while (flag) {
            System.out.print("Ведите превое число: ");
            int firstNumber = scanner.nextInt();
            System.out.print("Ведите операцию (+, -, *, /): ");
            char operation = scanner.next().charAt(0);
            System.out.print("Ведите второе число: ");
            int secondNumber = scanner.nextInt();
            int sum = 0, difference = 0, product = 0, dividend = 0;
            if (operation == '+') {
                sum = firstNumber + secondNumber;
                System.out.println(sum);
            } else if (operation == '-') {
                difference = firstNumber - secondNumber;
                System.out.println(difference);
            } else if (operation == '*') {
                product = firstNumber * secondNumber;
                System.out.println(product);
            } else if (operation == '/') {
                product = firstNumber / secondNumber;
                System.out.println(product);
            }
            System.out.print("Для продолжения работы введите - 1, для выхода - 0: ");
            int i = scanner.nextInt();
            if(i == 1){
                flag = true;
            } else if(i == 0) {
                flag = false;
                System.out.println("Работа калькулятора завершена!");
            }
        }
    }

}
