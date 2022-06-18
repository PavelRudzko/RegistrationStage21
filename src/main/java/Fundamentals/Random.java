package Fundamentals;
/**
 * A program with random input
 *
 * @ author Pavel Rudzko
 */

public class Random {
    public static void main(String[] args) {
        int firstFigure = 0;
        int lastFigure = 100;

        int random_number1 = firstFigure + (int) (Math.random() * lastFigure);
        System.out.println("1-ое случайное число: " + random_number1);

        int random_number2 = firstFigure + (int) (Math.random() * lastFigure);
        System.out.println("2-ое случайное число: " + random_number2);

        int random_number3 = firstFigure + (int) (Math.random() * lastFigure);
        System.out.println("3-е случайное число:" + random_number3);


        int random_number4 = firstFigure + (int) (Math.random() * lastFigure);
        System.out.println("4-е случайное число: " + random_number4);


        System.out.println("1: " + random_number1 + ", 2: " + random_number2 + ", 3: " + random_number3 + ",4: " + random_number4);

    }
}
