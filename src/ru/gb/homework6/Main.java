package ru.gb.homework6;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Рыжий"),
                new Cat("Котя"),
                new Dog("Шарик"),
                new Dog("Бобик"),
                new Dog("Рич")
        };

        for(Animal a : animals) {
            a.run(200);
            a.swim(15);
            a.run(500);
            a.swim(30);
            a.run(700);
            a.swim(10);
        }
        System.out.println("Всего " + Cat.counter + " котов");
        System.out.println("всего " + Dog.counter + " собак");
        System.out.println("Всего " + Animal.counter + " животных");
    }
}
