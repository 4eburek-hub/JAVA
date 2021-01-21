package ru.geekbrains.lesson1.git;

class Animal {
    public String name;
    public int run;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public static int count = 0;

    public void setCountAnimal() {
        System.out.println("Колличество животных " + Animal.count);

    }

    public void animalInfo() {
        System.out.println();
    }

}

class Cat extends Animal {
    protected String swim;

    public Cat(String name, int run, String swim) {
        this.swim = swim;
        this.name = name;
        this.run = run;
    }

    public static int count = 1;

    public void catInfo() {
        System.out.println("Имя: " + name + "/ пробежал: " + run + "/ Swim: " + swim);
    }

    public void setCountCat() {
        System.out.println("Колличество Котов " + Cat.count);
    }
}

class Dog extends Animal {
    public int swim;

    public Dog(String name, int run, int swim) {
        this.name = name;
        this.swim = swim;
        this.run = run;

    }

    public static int count = 1;

    public void dogInfo() {
        System.out.println("Имя: " + name + "/ пробежал: " + run + "/ Проплыл: " + swim);
    }

    public void setCountDog() {

        System.out.println("Колличество Собак " + Dog.count);

    }
}


class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("CatsCategory");
        animal.count = Animal.count ++;
        Animal.count = Dog.count + Cat.count;
        animal.setCountAnimal();
        Cat cat = new Cat("Барсик", 200, "Кот не умеет плавать");
        cat.count = Cat.count ++;
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();
        cat.setCountCat();


        Animal animalD = new Animal("Dogs");
        Dog dog = new Dog("Бобик", 500, 10);
        dog.count = Dog.count ++;

        animalD.animalInfo();
        dog.animalInfo();
        dog.dogInfo();
        dog.setCountDog();


    }
}