package ru.kosenko.lesson6.animal;

import java.util.Scanner;

public class Animal {
    public Animal(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    protected String name;
    public int distance;


    public void run(){ System.out.printf("%s Пробежал "+ "%d метров\n", name , distance);}
    public void floats(){System.out.printf(" %s Проплыл "+ "%d метров\n", name , distance);}
}
