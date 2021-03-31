package ru.kosenko.lesson6;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distanse ;
        System.out.printf("Ввеите значение дистанции: ----> ");
        distanse = scanner.nextInt();

        Cat cat = new Cat("Мурзик",distanse);
        Dog dog = new Dog("Тузик", distanse);

        cat.run();
        cat.floats();
        dog.run();
        dog.floats();

        }

}
