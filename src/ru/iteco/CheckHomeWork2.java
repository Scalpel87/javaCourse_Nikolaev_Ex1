package ru.iteco;

/**
 * Перебор всех комбинаций HomeWork2
 *
 * @author     Sergey Nikolaev
 */

public class CheckHomeWork2 {
    public static void main(String[] args) {
        HomeWork2 homeWork2 = new HomeWork2();
        for (int i = 1; i < 11; i++) {
            homeWork2.main(new String[] {Integer.toString(i)});
        }
    }
}
