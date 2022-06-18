package Fundamentals;
/**
 * A program that revers
 *
 * @ author Pavel Rudzko
 */
import java.util.Scanner;
public class Revers {
    public static void main(String[] args) {

        String figString;

        Scanner scannerR = new Scanner(System.in);

        System.out.println("INPUT YOUR STRING:");

        figString = scannerR.nextLine();

        String[] temp = figString.split("");


        for (int x = temp.length - 1; x >= 0; x--)

            System.out.print(temp[x] + "");




    }
}
