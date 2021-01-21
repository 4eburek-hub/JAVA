package ru.geekbrains.lesson1.git;

import java.util.Random;
import java.util.Scanner;

public class Dz4 {
    public static char[][] map;
    public static int SIZE;
    public static int DOTS_TO_WIN = 4;
    public static char DOT_EMPTY = '.';
    public static char DOT_X = 'X';
    public static char DOT_O = 'O';
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Задайте поле любой цифрой....");
        SIZE = scanner.nextInt();
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек!!!!!!!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Поедил Компьютер(((((");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;

            }
            System.out.println("Игра закончена");

        }

    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (isCellValid(x, y));
        System.out.println("Компьютер походил в точку" + " " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }


    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("ВВедите кординаты в формате Х Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return true;
        if (map[y][x] == DOT_EMPTY) return false;
        return true;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static boolean checkWin(char symb) {
        int conter = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (SIZE - 1 - i == j && map[i][j] == symb) {
                    conter++;
                }
            }
        }
        if (conter == SIZE) {
            return true;
        } else {
            conter = 0;
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == j && map[i][j] == symb) {
                    conter++;
                }
            }
        }
        if (conter == SIZE) {
            return true;
        } else {
            conter = 0;
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    conter++;
                }
            }
            if (conter == SIZE) {
                return true;
            } else {
                conter = 0;
            }
        }
        conter = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == symb) {
                    conter++;
                }
            }
            if (conter ==SIZE){
                return true;
            }
            else {
                conter = 0;
            }
        }
        return false;

    }


}
