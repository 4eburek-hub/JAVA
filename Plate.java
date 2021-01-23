package ru.geekbrains.lesson1.git;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;

        food -= n;
        return true;
    }

  
    public void info() {
        System.out.println("plate: " + food);
    }
}

class Cat2 {
    private String name;
    private int appetite;
    private boolean hungry;

    public Cat2(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    void info() {
        String isHungry = !hungry ? "Сыт" : "Голоден";
        System.out.println(name + ": " + isHungry);

    }

    public void eat(Plate p) {
        if (hungry && p.decreaseFood(appetite)) ;
        hungry = false;
    }
}

abstract class MainClass {
    public static void main(String[] args) {
        Cat2[] cats = {new Cat2("Barsik", 80), new Cat2("Vaska", 45), new Cat2("Pushok", 20)};
        Plate plate = new Plate(100);
        for (Cat2 cat : cats) {
            plate.info();
            cat.eat(plate);
            cat.info();


        }
    }
}
