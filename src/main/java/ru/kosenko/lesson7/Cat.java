package ru.kosenko.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private int foodAmount;
    int satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }


    public void eat(Bowl bowl) {
        bowl.deckreaseFood(name, appetite);
        if (bowl.getSatiety() == true) {
            System.out.printf("Кот %s поел из тарелки.\n", this.name);
        } else {
            System.out.printf("Кот %s не поел из тарелки, для него мало еды.\n", this.name);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

}
