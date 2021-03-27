package ru.kosenko.lesson4;
import java.util.Random;
import java.util.Scanner;


public class TicTacToe {

            final char USER = 'X';
            final char BOT = 'O';
            final char EMPTY = '.';
            char[][] array;
//            char[] arr;
            Random random;
            Scanner scanner;
            int x_user, y_user;

            public static void main(String[] args) {
                new TicTacToe().game();
            }


            TicTacToe() {
                random = new Random();
                scanner = new Scanner(System.in);
                array = new char[5][5];
            }


            void game() {
                initArray();
                while (true) {
                    User();
                    if (checkWin(USER)) {
                        System.out.println("Поздавляю!!! Вы выиграли!");
                        break;
                    }
                    if (isArrayFull()) {
                        System.out.println("Извините, Победила дружба!!!");
                        break;
                    }
                    Robot();
                    printTable();
                    if (checkWin(BOT)) {
                        System.out.println("Победа робота!");
                        break;
                    }
                    if (isArrayFull()) {
                        System.out.println("Извините, Победила дружба!!!");
                        break;
                    }
                }
                System.out.println("ИГРА ОКОНЧЕНА!");
                printTable();
            }


            void initArray() {
                for (int i = 0; i < 5; i++)
                for (int k = 0; k < 5; k++)
                    array[i][k] = EMPTY;
            }
//    void initArr() {
//        int a = 0;
//        for (int i = 0; i < 5; i++) {
//            for (int k = 0; k < 5; k++)
//                arr [a] = array [i][k];
//
//        }
//    }

            void printTable() {
                 for (int i = 0; i < 5; i++) {
                     for (int k = 0; k < 5; k++)
                     System.out.print(array[i][k] + " ");
                     System.out.println();
                 }
            }

    void User() {
        int x, y;
        do {
            System.out.println("Введите X и Y от 1 до 5:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        array[y][x] = USER;

    }



    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= 5|| y >= 5)
            return false;
        return array[y][x] == EMPTY;
    }


    void Robot() {
        int x, y;
//        Intellect();
        do {
            x = random.nextInt(5);
            y = random.nextInt(5);
        } while (!isCellValid(x_user, y_user)) ;
              array[y][x] = BOT;
    }
//    void Intellect(){               С работой не успеваю реализовать код с данным алгоритмом:
//                                 Здесь функция будет проверять ве возможные ситуации выигрыша пользователя и компа,
//        initArr();                по принципу двоичного числа т.е. пять строк, пять столбцов и две диагонали заносим в массив.
//        int n;                    Из массива в цикле проверяем по пять ячеек и переводим в двоичное число для компа и для юзера,
//                                  т.е. для компа: если стоит крестик - 1 иначе 0. так же и для юзера.
//                                  Переводим в десятичное число оба варианта юзер и комп, если в сумме 31, то строка заполнена проверяем следующие 5, всего 12 массив 60 ячеек,
//                                   1 1 1 0 0 , 1 0 1 1 0, 0 1 1 1 0, 0 1 0 1 1, 1 1 0 1 0, 0 1 1 0 1, 0 0 1 1 1 - все предвыир. ситуации
//                                  переводим в DEC  7, 14, 28, 11, 22, 13, 26. Ели одно из этих чисел у компа складываем с пользовательским и если не 31, высчитываем
//                                  пустую ячейку и выирываем. Ну если пользователя, то занимаем пустую ячейку в зависимости от числа. Ну  если проверять
//    }                             где два крестика, то пользователь никогда не выиграет, только ничья.

//  пока только по центральным диагоналям выигрываем
    boolean checkWin(char c) {
        for (int i = 0; i < 5; i++)
            if ((array[i][0] == c && array[i][1] == c && array[i][2] == c && array[i][3] == c) ||
                    ( array[i][1] == c && array[i][2] == c && array[i][3] == c&& array[i][4] == c) ||
                    (array[0][i] == c && array[1][i] == c && array[2][i] == c && array[3][i] == c) ||
                    (array[1][i] == c && array[2][i] == c && array[3][i] == c && array[4][i] == c))
                return true;
        if ((array[0][0] == c && array[1][1] == c && array[2][2] == c && array[3][3] == c) ||
                (array[1][1] == c && array[2][2] == c && array[3][3] == c && array[4][4] == c) ||
                (array[4][0] == c && array[3][1] == c && array[2][2] == c && array[1][3] == c) ||
                (array[3][1] == c && array[2][2] == c && array[1][3] == c && array[0][4] == c))
            return true;
        return false;
    }


    boolean isArrayFull() {
        for (int i = 0; i < 5; i++)
            for (int k = 0; k < 5; k++)
                if (array[i][k] == EMPTY)
                    return false;
        return true;
    }


}
