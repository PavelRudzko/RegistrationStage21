package Fundamentals;

import java.util.Scanner;

/**
 * A program that print Hello
 *
 * @ author Pavel Rudzko
 */

public class Hello {
    public static void main(String[] args) {
        String name;
        Scanner scannerH = new Scanner(System.in);
        System.out.println("Введите свое имя ");
        name = scannerH.nextLine();

        System.out.printf("Hello,%s \n", name);


    }
}
