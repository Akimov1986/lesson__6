package ru.gb.homework6;

public class Animal {
    static int counter;
    private String type;
    private String name;
    private int maxRun;
    private int maxSwim;

    public Animal(String type, String name, int maxRun, int maxSwim) {
        this.type = type;
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        counter++;
    }

    public void run(int distance) {
        if(distance <= maxRun) {
            System.out.printf("%s %s пробежал %d метров\r\n", type, name, distance);
        } else {
            System.out.printf("%s %s не может пробежать %d метров\r\n", type, name, distance);
        }
    }

    public void swim(int distance) {
        if(distance <= maxSwim) {
            System.out.printf("%s %s проплывает %d метров\r\n", type, name, distance);
        } else {
            System.out.printf("%s %s не может проплыть %d метров\r\n", type, name, distance);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
