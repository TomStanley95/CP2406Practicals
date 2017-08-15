package ProgrammingExercises;

import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        int numberEggs;
        double cost;
        final double DOZEN = 3.25;
        final double SINGLE = 0.45;
        Scanner input = new Scanner(System.in);
        System.out.print("How many eggs would you like to buy?");
        numberEggs = input.nextInt();
//        System.out.print(numberEggs);
        int numberDozen = numberEggs/12;
//        System.out.println(numberDozen);
        int numberSingle = numberEggs % 12;
//        System.out.println(numberSingle);
        cost = (numberDozen * DOZEN) + (numberSingle * SINGLE);
//        System.out.println(cost);
//        System.out.println("You ordered " +numberEggs + " eggs. That's " + numberDozen + " dozen at $" + DOZEN +
//                " per dozen and " + numberSingle + " loose eggs at " + SINGLE + " cents each for a total of $" + cost);
        String outputString = String.format("You ordered %s eggs. That's %s dozen at %s per dozen and %s loose eggs at" +
                " %s cents each for a total of $%s",numberEggs, numberDozen, DOZEN, numberSingle, SINGLE, cost);
        System.out.println(outputString);
    }
}
