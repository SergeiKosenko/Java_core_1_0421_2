package ru.kosenko.lesson2;
import java.util.Scanner;
public class WhileFor {
    public static void main (String[] args){
        System.out.println("Lesson2");
        String res;
        String name;
        int i = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Здравствуйе, как вас зовут?");
        name = in.nextLine();
        do {
            System.out.printf(name + ", введите номер задания: 1, 2, 3, 4, 5, 6, или 7: ");
            int num = in.nextInt();
            if ((num >= 1) & (num <= 7)) {
                System.out.printf("Задание №: %d \n", num);
                if (num == 1) {
                    HomeWork1();
                }
                if (num == 2) {
                    HomeWork2();
                }
                if (num == 3) {
                    HomeWork3();
                }
                if (num == 4) {
                    HomeWork4();
                }
                if (num == 5) {
                    HomeWork5();
                }
                if (num == 6)  {
                    HomeWork6(new int[]{1, 2, 3, 9, 4, 2, 3, 7, 1, 2, 3, 2, 1, 4, 2, 7, 9, 2, 3, 8, 5} , new int[]{8, 5, 1, 2, 11, 4, 1, 5, 2, 4, 8, 9, 1, 3});
                }
                if (num == 7) {
                    HomeWork7(new int[]{1, 2, 3, 9, 4, 2, 3, 7, 1, 2, 3, 2, 1, 4, 2, 7, 9, 2, 3, 8, 5});
                }
                System.out.println("\nЗадание №"+ num +" выполнено!\n");
            }
            else {System.out.println("\nЗадания №"+ num +" нет!\n");}
            System.out.println("Продолжить: любая цифра, Выйти: 1\n"); // Надо зделать проверку, если не цифра,
            i = in.nextInt();                                          //  in.close(); иначе будет ошибка.
        } while (i != 1);
        in.close();
    }
    static void HomeWork1(){
        Scanner in = new Scanner(System.in);
        System.out.printf("Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;\n");
        int a, c, i;
        System.out.printf("Введите количество ячеек в массиве: ");
        a = in.nextInt();
        int[] mass = new int[a];
        for (i = 0; i < a; i++) {
            double b = Math.random() * 10/1;
            mass[i] = (b > 5) ? 1 : 0;    // заполним массив в случайном порядке 1 или 0
            System.out.printf(mass[i] + " ");
        }
        System.out.printf("\n");
        for (i = 0; i < a; i++){
            c = mass[i];
            mass[i] = (c > 0) ? 0 : 1;
            System.out.printf(mass[i] + " ");
        }
    }
    static void HomeWork2(){
        System.out.printf("Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21.\n");
        int[] mass = new int[8];
        int i = 0;
        do {
            mass[i] = (i > 0) ? mass[i - 1] + 3 : 0;
            System.out.printf(mass[i] + " ");
            i++;
        }while (i != 8);

    }
    static void HomeWork3(){
        int i;
        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.printf("Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2.\n");
        System.out.printf("Наш массив до выполнения условия:     ");
        for (i = 0; i < 12; i++){
            System.out.printf(mass[i] + " ");
        }
        System.out.printf("\nНаш массив после выполнения условия: ");
        for (i = 0; i < 12; i++){
            mass[i] = (mass[i] < 6) ? mass[i] * 2 : mass[i];
            System.out.printf(mass[i] + " ");
        }
    }
    static void HomeWork4(){
        int x, y,  num;
        Scanner in = new Scanner(System.in);
        System.out.printf("Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) и с помощью цикла(-ов) заполнить его диагональные элементы единицами; \n");
        System.out.printf("Введите размер квадратного массива:  \n");
        num = in.nextInt();
        int[][] mass = new int[num][num];
        for (x = 0; x < num; x++) {
            for (y = 0; y < num; y++) {
                mass[y][x] = 0;          // Можно было использовать в одном цикле с х,
                mass[y][y] = 1;          // но для вывода в консоль сначала заполним все 0
                mass[y][num - y - 1] = 1;// и перезапишем данные по диагоналям
            }
        }
        for (x = 0; x < num; x++) {
            for (y = 0; y < num; y++) {
                if (y == num - 1){
                    System.out.printf(mass[x][y] + " \n");
                }
                else {System.out.printf(mass[x][y] + " "); }
            }
        }
    }
    static void HomeWork5(){
        Scanner in = new Scanner(System.in);
        System.out.printf("Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета); \n");
        int a, i;
        double max = 0;
        System.out.printf("Введите количество ячеек в массиве: ");
        a = in.nextInt();
        double[] mass = new double[a];
        for (i = 0; i < a; i++) {
            double b = Math.random() * 10;
            double res = mass[i];
            mass[i] = b;    // заполним массив в случайном порядке 1 или 0
            System.out.printf(mass[i] + " ");
        }
        System.out.printf("\n");
        for (i = 0; i < a; i++){

            double res = mass[i];
            max = (res > max) ? res : max;
        }
        double min = max;
        for (i = 0; i < a; i++){
            double res = mass[i];
           min = (res < min) ? res : min;
        }
        System.out.printf("Min :  "+ min + " ");
        System.out.printf("Max :  "+ max + " ");
    }
    static void HomeWork6(int[] mass1, int[] mass2) {
        System.out.printf("Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, \n" +
                "в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, \n" +
                "граница показана символами ||, эти символы в массив не входят. ");
        int sum1 = 0;
        int sum2 = 0;
        int result = 0;
        System.out.print("\n ");
        for (int i = 0; i < mass1.length; i++) {
            sum1 = sum1 + mass1[i];
            System.out.print(mass1[i] + " ");
        }
        System.out.print("\n ");
        for (int i = 0; i < mass2.length; i++) {
            sum2 = sum2 + mass2[i];
            System.out.print(mass2[i] + " ");
        }
        System.out.print("\n ");
        for (int i = 0; i < mass1.length; i++) {
            result = result + mass1[i];
            System.out.print(mass1[i]);
            if (result == sum1 - result){
                System.out.print(" || ");
            }
            else {System.out.print(" ");}
        }
        result = 0;
        System.out.print("\n ");
        for (int i = 0; i < mass2.length; i++) {
            result = result + mass2[i];
            System.out.print(mass2[i]);
            if (result == sum2 - result){
                System.out.print(" || ");
            }
            else {System.out.print(" ");}
        }
    }
    static void HomeWork7(int[] mass1){
        Scanner in = new Scanner(System.in);
        System.out.printf("Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), \nпри этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.\nДля усложнения задачи нельзя пользоваться вспомогательными массивами.\nПримеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].\nПри каком n в какую сторону сдвиг можете выбирать сами. ");
        System.out.println("\nЗадайте смещение от - 20 до 20  ");
        int n = in.nextInt();
        System.out.print("\n ");
        for (int i = 0; i < mass1.length; i++) {
            System.out.print(mass1[i] + " ");
        }
        System.out.print("\n ");
       if (n > 0) {
           for (int k = 1; k <= n; k++) {
               int temp = mass1[mass1.length - 1];
               for (int i = mass1.length - 1; i >= 0; i--) {
//            System.out.print(mass1[i] + " ");
                   if (i != 0) {
                       mass1[i] = mass1[i - 1];
                   } else {
                       mass1[i] = temp;
                   }
               }
           }
       }
       else{
           for (int k = 0; k > n; k--) {
               int temp = mass1[0];
               for (int i = 0; i < mass1.length; i++) {
//            System.out.print(mass1[i] + " ");
                   if (i < mass1.length - 1) {
                       mass1[i] = mass1[i + 1];
                   } else {
                       mass1[i] = temp;
                   }
               }
           }
       }
        System.out.print("\n ");
        for (int i = 0; i < mass1.length; i++) {
            System.out.print(mass1[i] + " ");
        }
    }
}
