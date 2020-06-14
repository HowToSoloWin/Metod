package com.company;
import java.util.Scanner;

public class Samsung extends Machine implements Machineui {

    @Override
    public int cookCoffeeA() {
        for (int i = tankCoffee; i >= 30; ) {
            for (int j = tankWater; j >= 200; ) {
                System.out.println("Кофе готов");
                i = i - 30;
                j = j - 200;
                return i;
            }
            System.out.println("Заполните бак с кофе");

        }
        System.out.println("Заполните бак с водой");

        return tankCoffee & tankWater;
    }

    @Override
    public int cookCoffeeEsp() {
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

        return tankCoffee & tankWater;
    }


    @Override
    public int cookCoffeeDoubleEsp() {
        for (int i = tankCoffee; i >= 60; ) {
            for (int j = tankWater; j >= 300; ) {
                System.out.println("Кофе готов");
                i = i - 60;
                j = j - 300;
                return (i);
            }
            System.out.println("Заполните бак с кофе");

        }
        System.out.println("Заполните бак с водой");

        return tankWater & tankCoffee;
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
        if (tankWater == 1800) {
            System.out.println("Бак уже заполнен");
        }else {
            System.out.println("Пополнение бака...");
        }return tankWater;
    }
    @Override
    public int tillCoffee(){
        if (tankCoffee == 150) {
            System.out.println("Бак уже заполнен");
        }else {
            System.out.println("Пополнение бака...");
        }return tankCoffee;
    }
    @Override
    public String offMachine(){
        return "Выключение";
    }


    public void menu() {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        System.out.println("Добро пожаловать, Samsung");
        while (choice != 8) {
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
            count++;
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
