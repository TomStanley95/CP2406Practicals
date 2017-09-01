package Chapter05.ProgrammingExercises;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        number = input.nextInt();
        if (number % 2 == 0)
            System.out.println("The integer " + number + " is even");
        else
            System.out.println("The integer " + number + " is odd");
    }
}
