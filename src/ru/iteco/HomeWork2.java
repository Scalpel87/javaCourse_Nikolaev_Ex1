package ru.iteco;

import java.util.Scanner;

/**
 * Необходимо вывести форматированную информацию с
 * переменными в зависимости от варианта (должны
 * присутствовать типы: String/char, byte/short/int/long,
 * float/double)
 *
 * Вариант можно выбрать вводом с клавиатуры или
 * задать в качестве аргумента
 *
 * @author     Sergey Nikolaev
 */

public class HomeWork2 {
    public static void main(String[] args) {
        int age;
        if (args.length == 0) {
            Scanner scr = new Scanner(System.in);
            System.out.println("Введите число от 1 до 10");
            age = scr.nextInt();
            if (age < 1 || age > 10) {
                System.out.println("Ошибка! Число должно быть от 1 до 10");
                main(new String[0]);
            }
            scr.close();
        }
        else age = Integer.parseInt(args[0]);
        if (age == 1) {
            String city = "Сакраменто";
            int cityc = 495234;
            short cityp = 55;
            System.out.printf("%s - город, %d - население, %d - процент безработных\n", city, cityc, cityp);
        }
            else
                if (age == 2) {
                    char c = 'A';
                    int s = 545;
                    int cost = 550;
                    System.out.printf("%c - секция на трибуне, %d - место, %d - стоимость билета\n", c, s, cost);
                }
                    else
                    if (age == 3) {
                        String name = "Инна";
                        byte a = 30;
                        int h = 175;
                        System.out.printf("%s - имя, %d - возраст, %d - рост\n", name, a, h);
                    }
                        else
                        if (age == 4) {
                            char c = 'A';
                            int n = 777;
                            int w = 1450;
                            System.out.printf("%c%d%c%c, %d - вес автомобиля\n", c, n, c, c, w);
                        }
                            else
                            if (age == 5) {
                                String name = "Apple";
                                long a = 19727000000000L;
                                int h = 41;
                                System.out.printf("%s - название компании, %d - годовой доход, %d - доля на рынке\n", name, a, h);
                            }
                                else
                                if (age == 6) {
                                    char c = '+';
                                    int n = 2;
                                    short w = 20;
                                    System.out.printf("%c - резус фактор, %d - группа крови, %d - доля людей с этой группой крови\n", c, n, w);
                                }
                                    else
                                    if (age == 7) {
                                        String name = "МГУ";
                                        double a = 38150;
                                        int h = 30;
                                        System.out.printf("%s - название универа, %.0f - число студентов, %d - доля отчисленных\n", name, a, h);
                                    }
                                        else
                                        if (age == 8) {
                                            char c = 'G';
                                            int s = 5450000;
                                            int cost = 9;
                                            System.out.printf("%c - рейтинг фильма, %d - копий продано, %d - рейтинг\n", c, s, cost);
                                        }
                                            else
                                            if (age == 9) {
                                                String name = "BMW";
                                                double a = 202478900;
                                                float h = 2.64f;
                                                System.out.printf("%s - название бренда, %.0f - произведено товара, %.2f - процент продаж\n", name, a, h);
                                            }
                                                else
                                                if (age == 10) {
                                                    char c = 'E';
                                                    char d = 'д';
                                                    char a = 'а';
                                                    int s = 23462458;
                                                    int cost = 9;
                                                    System.out.printf("%c%c%c - категория товара, %d - штрих код, %d - процент покупателей старше 30\n", c, d, a, s, cost);
                                                }
    }
}
