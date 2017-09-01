package Chapter05.ProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        int one;
        int two;
        int three;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        one = input.nextInt();
        System.out.print("Enter an integer: ");
        two = input.nextInt();
        System.out.print("Enter an integer: ");
        three = input.nextInt();
        int[] numbers = {one, two, three};
        System.out.println("Ascending order: ");
        int tempNum;
        boolean sorted = false;
        int count = 0;
        for (int j = 3 ;j > 1; j--) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] < numbers[i + 1])
                    numbers[i] = numbers[i];
                else {
                    tempNum = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = tempNum;
                }
            }

        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Descending order: ");
        for (int j = 3 ;j > 1; j--) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1])
                    numbers[i] = numbers[i];
                else {
                    tempNum = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = tempNum;
                }
            }

        }
        System.out.print(Arrays.toString(numbers));
    }
    }
