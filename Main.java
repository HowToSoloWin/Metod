package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // 1
        int arr[] = {10, 7, 2, 98};
        float r = average(arr);
        System.out.println(r);
        // 2
        double arr1[] = {7, -5, 520, -987, -1000.454978, 1000};
        double v = min(arr1);
        System.out.println(v);
        // 3
        int first = firstEven(6, 8, 6, 7, 6, 5, 89);
        System.out.println(first);
        // 4
        double h = byteConverter(3, "b");
        System.out.println(h);
        // 5
        int arr3[] = {1, 4, 7, 8, 9, 10};
        boolean j = isSorted(arr3);
        System.out.println(j);
        // 6

        boolean o = isPrime(152);
        System.out.println(o);
        // 7
        int a = sumDigits(157);
        System.out.println(a);
        // 8
        showTime(765);
        // 9
        int mass[][] = {{4,-7},{7,5},{5,-3},{-7,4},{-8,-89},{4,9}};
        replaceNegatives(mass);
        System.out.println(Arrays.deepToString(mass)); //метод вывода массива (быстрый)
        // 10


    }  /*   Написать функцию average, которая в качестве входного параметра принимает
    массив целых чисел и возвращает их среднеее значение */

    public static float average(int arr[]) {
        float ave = 0.0f;
        if (arr.length > 0) {
            float sum = 0.0f;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            ave = sum / arr.length;
        }
        return (ave);
    }

    /* 2. Написать функцию min, которая принимает на вход массив вещественных чисел
    и возвращает минимальный элемент массива. */
    public static double min(double[] arr) {
        double min1 = arr[0];
        for (double ind : arr) {
            if (ind < min1) {
                min1 = ind;
            }
        }
        return (min1);
    }

    /* Написать функцию firstEven, которая на вход принимает переменное число
параметров целого типа и возвращает первый найденный элемент из заданной
последовательности, который является четным числом */
    public static int firstEven(int... v) {
        int tmp = 0;
        for (int i = 0; i <= v.length; i++) { // проход по диапазону
            if (v[i] % 2 == 0) {
                tmp = v[i];
                break;
            }
        }
        return (tmp);
    }

    /* 4. Написать функцию byteConverter, принимающую на вход 2 аргумента.
Назначение функции – перевести мегабайты в байты или килобайты. Первый
аргумент – целое число в диапазоне от 0 до 106
, представляющее количество
мегабайт. Второй аргумент – строка, в которую может быть записано одно из 2-х
значений: “b” b” или “b” kb”. В зависимости от значения второго аргумента, функция
должна возвращать количествово байт, либо килобайт, согласно значению первого
аргумента.
*/

    public static double byteConverter(int p, String tip) {
        String kb = "kb";
        String b = new String("b");
        double v = 0;
        if (kb.equalsIgnoreCase(tip)) {
            double n = Math.pow(2, 10);
            v = n * p;
        } else {
            double n1 = Math.pow(2, 20);
            v = n1 * p;
        }
        return (v);
    }
    /* 5. Написать функцию isSorted, которая принимает на вход массив элементов
    целого типа. Функция должна возвратить значение true, если заданный массив
    является отсортированным по возрастанию, либо false – в противном случае. */

    public static boolean isSorted(int arr3[]) {
        for (int i = 0; i < arr3.length; i++) { // проход
            for (int j = 0; j < i; j++) { // индекс
                if (arr3[i] < arr3[j]) {
                    return (false);
                }
            }
        }
        return (true);
    }
    /* 6. Написать функцию isPrime, принимающую на вход целое число и
    возвращающую true, если заданное значение является простым числом, либо false,
    если число составное. */

    public static boolean isPrime(int n){
    if (n == 1){
        return (false);
    } else {
        if (n == 0)
                return (false);
        }
            for ( int i = 2;i < n ; i++){
            if (n / i * i == n) {
                return (false);
            }
        }
        return (true);
    }
    /* 7. Написать функцию sumDigits, которая на вход принимает целое положительное
    число и возвращает сумму цифр этого числа. */

    public static int sumDigits(int w){
        w = Math.abs(w);
        int sum = 0;
        while (w != 0){
            sum += w % 10;
            w /= 10;
        }
        return (sum);
    }

    /*8. Написать функцию showTime, которая принимает на вход количество секунд
(целое положительное число). Функция должна перевести время из секунд в часы,
минуты и секунды, и вывести значение в формате “HH:MM:SS” на экран.HH:MM:SS” на экран.
Например, при вызове функции showTime(765), на экран должна вывестить
надпись “HH:MM:SS” на экран.00:12:45”, т.к. аргумент 765 соответствует 12 минутам и 45 секундам.
Обратитите внимание, что если один из параметров времени меньше 10, то перед
ним необходимо вывести лидирующий 0, чтобы в каждой позиции было записано
минимум 2 цифры. Функция не должна возвращать значения, а лишь выводить
полученный результат на экран. */

    public static void showTime(int sec){
        int hour = sec / 3600;
        int min = sec / 60 % 60;
        int secS = sec / 1 % 60;
        System.out.println(String.format("%02d:%02d:%02d", hour, min, secS)); // %s - строка, %d - число
    }

   /* 9. Написать функцию replaceNegatives, которая принимает в качестве аргумента
    двумерный массив(матрицу) размером nxm, состоящий из целых чисел. Функция
    должна заменить все отрицательные значения в этой матрице на 0 и вернуть
    измененную матрицу. Примечание: кол-во строк и столбцов в матрице может быть
    любым и варьироваться в диапазоне от 1 до 20. */

    public static int[][] replaceNegatives(int[][] mass){
        int neg = 0;
        for (int i = 0; i < mass.length; i++){
           for (int j = 0; j < mass[i].length; j++){
               if (mass[i][j] < 0){
                   mass[i][j] = neg;
               }
           }
        }
        return (mass);
    }

    /* 10. Написать функцию sqRoots, которая должна вывести на экран корни
квадратного уравнения. В качестве входных аргументов функция должна
принимать 3 вещественных значения a, b и c, которые являются коэффициентами
квадратного трехчлена вида
Если корни для заданных аргументов определить невозможно, то вывести на экран
сообщение “HH:MM:SS” на экран.корней нет”. */

    public static float sqRoots(float a, float b, float c){

    }
}