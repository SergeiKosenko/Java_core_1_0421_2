package ru.kosenko.lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bowl bowl = new Bowl();
        Cat[] cats = {
                new Cat("Мурзик", 15),
                new Cat("Рыжик", 25),
                new Cat("Барсик", 10),
                new Cat("Матроскин", 5),
                new Cat("Мур", 15),
                new Cat("Рыжок", 20),
                new Cat("Тигр", 40),
                new Cat("Мурка", 5)
        };

        int i;
        do {
            do {
                System.out.printf("Добавить еды : 1, выйти 0: ---> ");
                i = scanner.nextInt();
            }while (i > 1);
            if (i == 1) {
                System.out.printf("Добавьте еды : ---> ");
                int runamount = scanner.nextInt();
                bowl.putFoodInto(runamount);
            }
            else if (i == 0){break;}
            for (Cat cat : cats) {
                cat.eat(bowl);
            }
        } while (i != 0);

//        1. Расширить задачу про котов и тарелки с едой.
//        2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
//        3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
//        4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
//        5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
//        6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.


    }

}
