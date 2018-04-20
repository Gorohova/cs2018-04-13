package by.it.gorohovairyna.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой:
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int number1 = f.nextInt();//считывает первое число и присваивает значение в number1
        int number2 = f.nextInt();//считывает второе число и присваивает значение в number2
        int r;
        r = number1 + number2;
        System.out.println("DEC"+":"+number1+"+"+number2+"="+Integer.toString(r)); // результат в двоичной системе
        System.out.println("BIN"+":"+Integer.toBinaryString(number1)+"+"+Integer.toBinaryString(number2)+"="+Integer.toBinaryString(r)); // результат в 10-тичной системе
        System.out.println("HEX"+":"+Integer.toHexString(number1)+"+"+Integer.toHexString(number2)+"="+Integer.toHexString(r)); // результат в 16-ричной системе
        System.out.println("OCT"+":"+Integer.toOctalString(number1)+"+"+Integer.toOctalString(number2)+"="+Integer.toOctalString(r)); // результат в 16-ричной системе


    }

}
