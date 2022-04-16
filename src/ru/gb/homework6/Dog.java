package ru.gb.homework6;

public class Dog extends Animal{
    static int counter;

    Dog(String name) {
        super("Пёс", name, 500, 10);
        counter++;
    }
}
