package com.assignment_one;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App 
{
    static Scanner scn = new Scanner(System.in);

    public void addition(){
        char exitAddition;
        do {
            try{
                System.out.print("Enter first value: ");
                double firstValue = scn.nextDouble();
                System.out.print("Enter second value: ");
                double secondValue = scn.nextDouble();
                double sum = firstValue + secondValue;
                System.out.println(firstValue + " + " + secondValue + " = " + sum);
            }catch (NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, nfe.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            catch (InputMismatchException im){
                JOptionPane.showMessageDialog(null, im.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

            System.out.print("Exit addition Yes/No: ");
            exitAddition = scn.next().toLowerCase().charAt(0);

            //checking if the entered option matches the options provided
            while((exitAddition != 'y')&&(exitAddition != 'n')){
                JOptionPane.showMessageDialog(null, "Incorrect entry. re-try", "Error!", JOptionPane.ERROR_MESSAGE);
                System.out.print("Exit addition? Yes/No: ");
                exitAddition = scn.next().toLowerCase().charAt(0);
            }
        }while (exitAddition != 'y');
    }

    public void subtraction(){
    }

    public void multiplication(){
    }

    public void division(){
    }

    public static void main( String[] args )
    {
        App app = new App();
        System.out.println("\n\t********************************************\n" +
                "\t*  WELCOME TO MY SIMPLE CALCULATOR PROGRAM *\n"+
                "\t********************************************\n");

        char exit, option;
        do {
            System.out.print("\nChoose option below\n"+
                    "A - Addition\n"+
                    "S - Subtraction\n"+
                    "M - Multiplication\n"+
                    "D - Division\n"+
                    "Enter first letter(A, S, M, D):  ");

            option = scn.next().toLowerCase().charAt(0);

            //checking if the entered option matches the options provided
            while((option != 'a')&&(option != 's')&&(option != 'm')&&(option != 'd')){
                JOptionPane.showMessageDialog(null, "Incorrect entry. re-try", "Error!", JOptionPane.ERROR_MESSAGE);
                System.out.print("Choose option below\n"+
                        "A - Addition\n"+
                        "S - Subtraction\n"+
                        "M - Multiplication\n"+
                        "D - Division\n"+
                        "Enter first letter(A, S, M, D):  ");
                option = scn.next().toLowerCase().charAt(0);
            }

            switch (option){
                case 'a':
                    System.out.println("\n\tAddition\n\t********\n");
                    app.addition();
                    break;
                case 's':
                    System.out.println("\n\tSubtraction\n\t************\n");
                    app.subtraction();
                    break;
                case 'm':
                    System.out.println("\n\tMultiplication\n\t**************\n");
                    app.multiplication();
                    break;
                case 'd':
                    System.out.println("\n\tDivision\n\t********\n");
                    app.division();
                    break;
            }
            System.out.print("\n**********************\nExit calculator Yes/No: ");
            exit = scn.next().toLowerCase().charAt(0);

            //checking if the entered option matches the options provided
            while((exit != 'y')&&(exit != 'n')){
                JOptionPane.showMessageDialog(null, "Incorrect entry. re-try", "Error!", JOptionPane.ERROR_MESSAGE);
                System.out.print("Enter Yes/No: ");
                exit = scn.next().toLowerCase().charAt(0);
            }
        }while (exit != 'y');

        System.out.println("\n\t******************************************\n" +
                "\t*  GOOD BYE. I HOPE YOU COME BACK AGAIN! *\n"+
                "\t******************************************");
    }
}
