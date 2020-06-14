package com.company;

import java.util.Scanner;

public class Saeco extends Machine implements Machineui {

    @Override
    public int cookCoffeeA() {
        for (int i = tankCoffee; i >= 30; ) {
            for (int j = tankWater; j >= 150; ) {
                System.out.println("Кофе готов");
                i = i - 30;
                j = j - 150;
                return (i);
            }
            System.out.println("Заполните бак с кофе");

        }
        System.out.println("Заполните бак с водой");

        return tankCoffee;
    }

    @Override
    public int cookCoffeeEsp() {
        for (int i = tankCoffee; i >= 40; ) {
            for (int j = tankWater; j >= 100; ) {
                System.out.println("Кофе готов");
                i = i - 40;
                j = j - 100;
                return (i);
            }
            System.out.println("Заполните бак с кофе");

        }
        System.out.println("Заполните бак с водой");

        return tankCoffee;
    }


    @Override
    public int cookCoffeeDoubleEsp() {
        int i = 0;
        int j = 0;
        for (i = tankCoffee; i >= 80; ) {
            for (j = tankWater; j >= 200; ) {
                System.out.println("Кофе готов");
                i = i - 80;
                j = j - 200;
                return (i & j);
            }
            System.out.println("Заполните бак с кофе");

        }
        System.out.println("Заполните бак с водой");

        return tankWater;
    }

    @Override
    public int showCoffee() {
        return tankCoffee;
    }

    @Override
    public int showWater() {
        return tankWater;
    }

    @Override
    public String toString(){
        return name + "  Бак кофе " + tankCoffee + "  Бак воды " + tankWater;
    }


    @Override
    public int tillWater() {
        if (tankWater == 2500) {
            System.out.println("Бак уже заполнен");
        }else {
            System.out.println("Пополнение бака...");
        }return tankWater;
    }

    @Override
    public int tillCoffee() {
        if (tankCoffee == 400) {
            System.out.println("Бак уже заполнен");
        }else {
            System.out.println("Пополнение бака...");
        }return tankCoffee;
    }

    @Override
    public String offMachine() {
        return "Выключение";
    }

    public void menu() {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        System.out.println("Добро пожаловать, Saeco");
        while (choice != 8) {
            count++;
            System.out.println();
            System.out.println("1. Показать текущее текущий объём воды и кофе");
            System.out.println("2. Приготовить Американо");
            System.out.println("3. Приготовить Эспрессо");
            System.out.println("4. Приготовить Двойной Эспрессо:");
            System.out.println("5. Заполнить бак с водой");
            System.out.println("6. Заполнить бак с кофе");
            System.out.println("7. Информация о кофемашине");
            System.out.println("8. Выключить кофемашину");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(showCoffee() & showWater());
                    break;
                case 2:
                    System.out.println(cookCoffeeA());
                    break;
                case 3:
                    System.out.println(cookCoffeeEsp());
                    break;
                case 4:
                    System.out.println(cookCoffeeDoubleEsp());
                case 5:
                    System.out.println(tillWater());
                    break;
                case 6:
                    System.out.println(tillCoffee());
                    break;
                case 7:
                    System.out.println(toString());
                    break;
                case 8:
                    System.out.println(offMachine());
                    break;
                default:
                    System.out.println("неверный выбор");
            }
        }
    }
}
