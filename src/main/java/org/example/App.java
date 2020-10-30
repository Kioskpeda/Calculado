package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mainscreen(scanner);
    }
    private static void Mainscreen(Scanner scanner)
    {
        System.out.println("Calculator ");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        switch (scanner.nextInt())
        {
            case 1:
                System.out.println("Type in two separate numbers.");
                System.out.println(Addition(scanner.nextDouble(), scanner.nextDouble()));
                Replay(scanner);
                break;
            case 2:
                System.out.println("Type in two separate numbers.");
                System.out.println(Subtraction(scanner.nextDouble(), scanner.nextDouble()));
                Replay(scanner);
                break;

            case 3:
                System.out.println("Type in two separate numbers.");
                System.out.println(Multiplication(scanner.nextDouble(), scanner.nextDouble()));
                Replay(scanner);
                break;
            case 4:
                System.out.println("Type in two separate numbers.");
                System.out.println(Division(scanner.nextDouble(), scanner.nextDouble()));
                Replay(scanner);
                break;
            default:
                System.out.println("Don't ever do that again.");
        }
    }
    private static void Replay(Scanner scanner)
    {
        System.out.println("Would you like to continue?");
        System.out.println("1.Yes 2.No");
        if (scanner.nextInt()==2){
            //Quit?
        } else
            {
            Mainscreen(scanner);
        }
    }
    public static double Addition(double number1, double number2)
    {
        return number1 + number2;
    }
    public static double Subtraction(double number1, double number2)
    {
        return number1 - number2;
    }
    public static double Multiplication(double number1, double number2)
    {
        return number1 * number2;
    }
    public static double Division(double number1, double number2)
    {
        return number1 / number2;
    }



}
