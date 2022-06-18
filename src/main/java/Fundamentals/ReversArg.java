package Fundamentals;
/**
 * A program that revers arguments
 *
 * @ author Pavel Rudzko
 */
public class ReversArg {

    public  static void main(String[] args) {
        System.out.println("Пpoгpaммe передано " + args.length + " аргументов командной строки.");
        System.out.println("Cпиcoк аргументов в обратном порядке : ");
        //for (int i = 0; i < args.length; i++) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println("arg[" + i + "]: " + args[i]);
        }
    }

}
