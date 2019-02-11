package com.assignment_one;

import javax.swing.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("\n\t********************************************\n" +
                "\t*  WELCOME TO MY SIMPLE CALCULATOR PROGRAM *\n"+
                "\t********************************************\n");

        char exit, option;
        do {
            System.out.print("Choose option below\n"+
                    "A - Addition\n"+
                    "S - Subtraction\n"+
                    "M - Multiplication\n"+
                    "D - Division\n"+
                    "Option:  ");

            option = scn.next().toLowerCase().charAt(0);

            //checking if the entered option matches the options provided
            while((option != 'a')&&(option != 's')&&(option != 'm')&&(option != 'd')){
                JOptionPane.showMessageDialog(null, "Incorrect entry. re-try", "Error!", JOptionPane.ERROR_MESSAGE);
                System.out.print("Choose option below\n"+
                        "A - Addition\n"+
                        "S - Subtraction\n"+
                        "M - Multiplication\n"+
                        "D - Division\n"+
                        "Option:  ");
                option = scn.next().toLowerCase().charAt(0);
            }

            switch (option){
                case 'a': System.out.println("\n\tAddition\n\t********\n");break;
                case 's': ;break;
                case 'm': ;break;
                case 'd': ;break;
            }
            System.out.print("\n**********************\nExit calculator Yes/No: ");
            exit = scn.next().toLowerCase().charAt(0);

            //checking if the entered option matches the options provided
            while((exit != 'y')&&(exit != 'n')){
                JOptionPane.showMessageDialog(null, "Incorrect entry. re-try", "Error!", JOptionPane.ERROR_MESSAGE);
                System.out.println("Enter Yes/No: ");
                exit = scn.next().toLowerCase().charAt(0);
            }
        }while (exit != 'y');

        System.out.println("\n\t******************************************\n" +
                "\t*  GOOD BYE. I HOPE YOU COME BACK AGAIN! *\n"+
                "\t******************************************");
    }
}
