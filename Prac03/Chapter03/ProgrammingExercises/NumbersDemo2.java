package Chapter03.ProgrammingExercises;

import java.util.Scanner;

public class NumbersDemo2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the first number");
            int numberOne = input.nextInt();
            System.out.println("Enter the second number");
            int numberTwo = input.nextInt();
            displayTwiceTheNumber(numberOne, numberTwo);
            displayNumberPlusFive(numberOne, numberTwo);
            displayNumberSquared(numberOne, numberTwo);
        }

        public static void displayTwiceTheNumber( int numberOne, int numberTwo) {
            String outputString = String.format("Double %s is %s \nDouble %s is %s", numberOne, numberOne * 2, numberTwo, numberTwo *2);
            System.out.println(outputString);
        }
        public static void  displayNumberPlusFive(int numberOne, int numberTwo){
            String outputString = String.format("%s + 5 is %s \n%s + 5 is %s", numberOne, numberOne + 5, numberTwo, numberTwo + 5);
            System.out.println(outputString);
        }
        public static void displayNumberSquared(int numberOne, int numberTwo){
            String outputString = String.format("%s  squared is %s \n%s squared is %s", numberOne, numberOne * numberOne, numberTwo, numberTwo * numberTwo);
            System.out.println(outputString);
        }
}
