package Fundamentals;

import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {

        Scanner fig = new Scanner(System.in);
        System.out.print("Input Figure1: ");
        double figure1 = fig.nextDouble();
        System.out.print("Input Figure2: ");
        double figure2 = fig.nextDouble();
        System.out.print("Input Figure3: ");
        double figure3 = fig.nextDouble();
        System.out.print("Input Figure4: ");
        double figure4 = fig.nextDouble();
        System.out.print("Input Figure5: ");
        double figure5 = fig.nextDouble();


        System.out.println("Сумма = " + (figure1 + figure2 + figure3 + figure4 + figure5));


    }


}
