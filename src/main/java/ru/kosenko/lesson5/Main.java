package ru.kosenko.lesson5;

import ru.kosenko.lesson4.TicTacToe;

public class Main {
    public static void main(String[] args) {

        FellowWorker[] fellowworker = new FellowWorker[5];
        fellowworker[0] = new FellowWorker("Петров ","Василий","Иванович", "Инженер", "8-999-22-33", "petrov@mail.ru", 130000, 45);
        fellowworker[1] = new FellowWorker("Иванов ","Игорь","Александрович", "Менеджер", "8-999-42-13", "ivanov@mail.ru", 90000, 24);
        fellowworker[2] = new FellowWorker("Сидоров ","Петр","Андреевич", "Старший Менеджер", "8-999-54-35", "sidorov@mail.ru", 125000, 42);
        fellowworker[3] = new FellowWorker("Пупкин ","Василий","Васильевич", "Начальник Отдела", "8-999-23-32", "pupkin@mail.ru", 180000, 36);
        fellowworker[4] = new FellowWorker("Васечкин ","Федр","Петрович", "Зам. Начальника", "8-999-12-31", "vaskin@mail.ru", 144000, 47);
        for (int i = 0; i < fellowworker.length; i++) {
            if(fellowworker[i].getYears() > 40){
                fellowworker[i].printList();
            }
        }

    }

}
