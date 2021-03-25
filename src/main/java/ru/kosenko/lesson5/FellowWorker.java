package ru.kosenko.lesson5;

public class FellowWorker {
    String name, last_name, middle_name, function, email, phone;
    int years, pay;



        public int getYears () {
            return years;
        }

        public FellowWorker(String last_name, String name, String middle_name, String function, String phone, String email, int pay, int years) {
            this.last_name = last_name;
            this.name = name;
            this.middle_name = middle_name;
            this.function = function;
            this.phone = phone;
            this.pay = pay;
            this.email = email;
            this.years = years;
        }

        public void printList(){
            System.out.println("Фамилия: " + last_name + " Имя: " + name + " Отчество: " + middle_name + " Должность: " + function + " Почта: " + email + " Телефон: " + phone + " Зарплата: " + pay + " Возраст: " + years);
        }
    }

