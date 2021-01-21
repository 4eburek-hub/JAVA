package ru.geekbrains.lesson1.git;

import java.util.Random;
import java.util.Scanner;

public class Practical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int try3 = 0;
        int random = rand.nextInt(9);
        System.out.println("Угадай число с трёх раз");

        while (try3 < 3){
        System.out.println("Введите чесло от 0 до 9");
        int namber = input.nextInt();
        if (namber > random) {
            System.out.println("Ваше число больше!: ");
        } else if (namber < random) {
            System.out.println("Ваше чило меньше!: ");
        }
        else if (namber == random) {
            System.out.println("Ура! Вы отгадали");
        }
        try3++;
        }
        System.out.println("Ваши попытки закончились. Повторить игру еще раз? 1 – да / 0 – нет");
        String userData = input.next();
        if (userData.equals("1")) {
            main(null);
        }
}
    public static void Str(String[] args) {
        String [] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

}
}
