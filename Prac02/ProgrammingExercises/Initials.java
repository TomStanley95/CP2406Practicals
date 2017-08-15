package ProgrammingExercises;

import javax.swing.*;

public class Initials {
    public static void main(String[] args) {


    String first = JOptionPane.showInputDialog("Enter the initial of your first name");
    String middle = JOptionPane.showInputDialog("Enter the initial of your middle name");
    String last = JOptionPane.showInputDialog("Enter the initial of your Last name");
    String initials = first + "." + middle + "."+ last + ".";
    System.out.print(initials);
    }
}
