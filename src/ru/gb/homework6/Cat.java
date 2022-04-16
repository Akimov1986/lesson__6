package ru.gb.homework6;

public class Cat extends Animal{
    static int counter;

    Cat(String name) {
        super("Кот", name, 200, 0);
        counter++;
    }
    @Override
    public void swim(int distance) {
        System.out.println(getName() + " не может плавать.");
    }
}
