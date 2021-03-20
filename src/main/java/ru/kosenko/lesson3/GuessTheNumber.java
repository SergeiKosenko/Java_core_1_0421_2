package ru.kosenko.lesson3;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main (String[] args){
        int i = 0;
        System.out.println("Lesson2");
        Scanner in = new Scanner(System.in);
        do {
            System.out.printf("Введите номер задания: 1 или 2: ");
            int num = in.nextInt();
            if ((num >= 1) & (num <= 2)) {
                System.out.printf("Задание №: %d \n", num);
                if (num == 1) {
                    HomeWork1();
                }
                if (num == 2) {
                    HomeWork2();
                }
                System.out.println("\nЗадание №"+ num +" выполнено!\n");
            }
            else {System.out.println("\nЗадания №"+ num +" нет!\n");}
            System.out.println("Продолжить: 1, Выйти: 0\n");
            i = in.nextInt();
        } while (i != 0);
        in.close();
    }
    static void HomeWork1(){
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(10);
        for (int i =0; i < 3; i++) {
            System.out.print("Угадайте число от 0 до 9: ");
            int res = in.nextInt();
            if (res > number) { System.out.println("Значение числа " + res + " больше загаданного"); }
            else if (res < number) { System.out.println("Значение числа " + res + " меньше загаданного"); }
            else if (res == number){
           System.out.println("Поздравляю! " + res + " вы угадали!");
           break;
       }
       else {
           System.out.println("Н огорчайтесь, число " + number + " вы не угадали!");
       }
        }
    }
    static void HomeWork2(){
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        String arr;
        String[] array = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int number = random.nextInt(array.length - 1);
        String result = array[number];
       do {
           System.out.println("Угадайте слово:  " + Arrays.toString(array));
           arr = in.nextLine();
           if (arr.equals( array[number])) {
               System.out.println("Поздравляю!!! " + arr + " вы угадали!");
           } else {
               char a = result.charAt(0);
               System.out.println("Поздравляю??? " + a + result.charAt(1) + "############## вы не угадали!");
           }
       }
        while ((arr.equals( array[number])) != true);
    }

}