package ru.kosenko.lesson7;

public class Bowl {
    private int foodAmount;
    private String name;
    private int appetite;
    private boolean satiety;

    public void putFoodInto(int amount) {
        this.foodAmount += amount;
        System.out.printf("В тарелке было %d еды, теперь осталось %d.\n", amount, foodAmount);
    }

    public void deckreaseFood(String name, int appetite) {
        if ((foodAmount - appetite) < 0) {
            System.out.printf("В тарелке не хватает %d еды для сытости %d кота %s. ", foodAmount, appetite, name);
            satiety = false;
        } else {
            this.foodAmount -= appetite;
            System.out.printf("В тарелке стало %d еды, уменьшилось на %d. ", foodAmount, appetite);
            satiety = true;
        }
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}
