package ru.kosenko.lesson6;

import ru.kosenko.lesson6.animal.Animal;

public class Cat extends Animal {
    public Cat(String name, int distance) {
        super(name, distance);
        this.name = name;
        this.distance = distance;
    }

    @Override
    public void run() {
        if (distance >= 150) {
            System.out.printf("%s не может бежать %d метров. Он бегает не больше 150 метров\n", name, distance);
        }
        else {System.out.printf("%s пробежал %d метров\n", name, distance);}
    }
    @Override
    public void floats() {
      System.out.printf("%s не умеет плавать.\n", name, " %d", distance);

  }

}
