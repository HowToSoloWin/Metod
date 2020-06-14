package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Samsung e60 = new Samsung();
        e60.tankCoffee = 150;
        e60.tankWater = 1800;
        Saeco s30 = new Saeco();
        s30.tankWater = 2500;
        s30.tankCoffee = 400;
        e60.name = "Samsung";
        s30.name = "Saeco";

        Scanner in = new Scanner(System.in);
        System.out.println("Выберите желаемую машину: Samsung or Saeco ");
        String t = in.next();
        if (t.equalsIgnoreCase("Samsung")) {
            e60.menu();
        }
        if (t.equalsIgnoreCase("Saeco")) {
            s30.menu();
        }
    }
}
