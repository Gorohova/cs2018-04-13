package by.it.gorohovairyna.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {
           public static void main(String[] args) {
            Scanner f = new Scanner(System.in);
            int number1 = f.nextInt();//считывает первое число и присваивает значение в number1
            int number2 = f.nextInt();//считывает второе число и присваивает значение в number2
            System.out.println("Sum = "+(number1 + number2));//выводит сумму number1 + number2

        }
    }