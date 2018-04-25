package by.it.gorohovairyna.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add ("one1");
        arr.add ("one2");
        arr.add ("one3");
        arr.add ("one4");
        arr.add ("one5");
        System.out.println(arr.size());
        for (String str : arr) {
            System.out.println(str);
        }
    }

}
