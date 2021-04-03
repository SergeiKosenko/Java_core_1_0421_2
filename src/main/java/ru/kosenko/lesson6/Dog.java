package ru.kosenko.lesson6;

import ru.kosenko.lesson6.animal.Animal;

public class Dog extends Animal {
    public Dog(String name, int distance) {
    super(name, distance);
    this.name = name;
    this.distance = distance;
    }
    @Override
    public void run() {
        if (distance >= 500) {
            System.out.printf("%s не может бежать %d метров. Он бегает не больше 500 метров\n", name, distance);
        }
        else {System.out.printf("%s пробежал %d метров\n", name, distance);}
    }
    @Override
    public void floats() {
        if (distance >= 10) {
            System.out.printf("%s не может плыть %d метров. Он плавает не больше 10 метров \n", name, distance);
        }
        else {System.out.printf("%s проплыл %d метров \n", name, distance);}
    }
}
