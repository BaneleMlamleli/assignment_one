package com.assignment_one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author  Banele Mlamleli - 213058552
 * Assignment one
* */
public class App
{
    // static Scanner scn = new Scanner(System.in);
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void addition(){
        char exitAddition;
        try {
            do {
                try {
                    System.out.print("Enter first value: ");
                    double firstValue = Double.parseDouble(br.readLine()); //scn.nextDouble();
                    System.out.print("Enter second value: ");
                    double secondValue = Double.parseDouble(br.readLine()); //scn.nextDouble();
                    double sum = firstValue + secondValue;
                    System.out.println(firstValue + " + " + secondValue + " = " + sum);
                } catch (NumberFormatException nfe) {
                    System.out.println("Error!! " + nfe.getMessage());
                }

                System.out.print("Are you done with addition? Yes/No: ");
                exitAddition = br.readLine().toLowerCase().charAt(0); // scn.next().toLowerCase().charAt(0);

                //checking if the entered option matches the options provided
                while ((exitAddition != 'y') && (exitAddition != 'n')) {
                    System.out.print("Incorrect entry. Expected Yes or No. Exit addition? Yes/No: ");
                    exitAddition = br.readLine().toLowerCase().charAt(0); // scn.next().toLowerCase().charAt(0);
                }
            } while (exitAddition != 'y');
        }catch (IOException ioe){
            System.out.println("Error!! " + ioe.getMessage());
        }
    }

    private void subtraction(){
        char exitSubtraction;
        try {
            do {
                try {
                    System.out.print("Enter first value: ");
                    double firstValue = Double.parseDouble(br.readLine()); //scn.nextDouble();
                    System.out.print("Enter second value: ");
                    double secondValue = Double.parseDouble(br.readLine()); //scn.nextDouble();
                    double subtraction = firstValue - secondValue;
                    System.out.println(firstValue + " - " + secondValue + " = " + subtraction);
                } catch (NumberFormatException nfe) {
                    System.out.println("Error!! " + nfe.getMessage());
                }


                System.out.print("Are you done with subtraction? Yes/No: ");
                exitSubtraction = br.readLine().toLowerCase().charAt(0); // scn.next().toLowerCase().charAt(0);

                //checking if the entered option matches the options provided
                while ((exitSubtraction != 'y') && (exitSubtraction != 'n')) {
                    System.out.print("Incorrect entry. Expected Yes or No. Exit subtraction? Yes/No: ");
                    exitSubtraction = br.readLine().toLowerCase().charAt(0); // scn.next().toLowerCase().charAt(0);
                }
            } while (exitSubtraction != 'y');
        }catch (IOException ioe){
                System.out.println("Error!! " + ioe.getMessage());
        }
    }

    private void multiplication(){
        char exitMultiplicatioin;
        try {
            do {
                try {
                    System.out.print("Enter first value: ");
                    double firstValue = Double.parseDouble(br.readLine()); //scn.nextDouble();
                    System.out.print("Enter second value: ");
                    double secondValue = Double.parseDouble(br.readLine()); //scn.nextDouble();
                    double multiply = firstValue * secondValue;
                    System.out.println(firstValue + " x " + secondValue + " = " + multiply);
                } catch (NumberFormatException nfe) {
                    System.out.println("Error!! " + nfe.getMessage());
                }

                System.out.print("Are you done multiplication? Yes/No: ");
                exitMultiplicatioin = br.readLine().toLowerCase().charAt(0); // scn.next().toLowerCase().charAt(0);

                //checking if the entered option matches the options provided
                while ((exitMultiplicatioin != 'y') && (exitMultiplicatioin != 'n')) {
                    System.out.print("Incorrect entry. Expected Yes or No. Exit Multiplication? Yes/No: ");
                    exitMultiplicatioin = br.readLine().toLowerCase().charAt(0); // scn.next().toLowerCase().charAt(0);
                }
            } while (exitMultiplicatioin != 'y');
        }catch (IOException ioe){
                System.out.println("Error!! " + ioe.getMessage());
        }
    }

    private void division(){
        char exitDivision;
        try {
            do {
                try {
                    System.out.print("Enter first value: ");
                    double firstValue = Double.parseDouble(br.readLine()); //scn.nextDouble();
                    System.out.print("Enter second value: ");
                    double secondValue = Double.parseDouble(br.readLine()); //scn.nextDouble();

                    //check the denominator if it is zero
                    if (secondValue == 0) {
                        System.out.println("Error! You cannot divide by zero");
                    } else {
                        double division = firstValue / secondValue;
                        System.out.println(firstValue + " / " + secondValue + " = " + division);
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("Error!! " + nfe.getMessage());
                }

                System.out.print("Are you done with division? Yes/No: ");
                exitDivision = br.readLine().toLowerCase().charAt(0); //scn.next().toLowerCase().charAt(0);

                //checking if the entered option matches the options provided
                while ((exitDivision != 'y') && (exitDivision != 'n')) {
                    System.out.print("Incorrect entry. Expected Yes or No. Exit division? Yes/No: ");
                    exitDivision = br.readLine().toLowerCase().charAt(0); // scn.next().toLowerCase().charAt(0);
                }
            } while (exitDivision != 'y');
        }catch (IOException ioe){
            System.out.println("Error!! " + ioe.getMessage());
        }
    }

    public static void main( String[] args ) throws IOException
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

            option = br.readLine().toLowerCase().charAt(0); //scn.next().toLowerCase().charAt(0);

            //checking if the entered option matches the options provided
            while((option != 'a')&&(option != 's')&&(option != 'm')&&(option != 'd')){
                System.out.print("\nIncorrect entry!!. Choose option below\n"+
                        "A - Addition\n"+
                        "S - Subtraction\n"+
                        "M - Multiplication\n"+
                        "D - Division\n"+
                        "Enter first letter(A, S, M, D):  ");
                option = br.readLine().toLowerCase().charAt(0); //scn.next().toLowerCase().charAt(0);
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
            System.out.print("\n*************************\nTerminate calculator program? Yes/No: ");
            exit = br.readLine().toLowerCase().charAt(0); //scn.next().toLowerCase().charAt(0);

            //checking if the entered option matches the options provided
            while((exit != 'y')&&(exit != 'n')){
                System.out.print("Incorrect entry. Expected Yes or No. Terminate program? Yes/No: ");
                exit = br.readLine().toLowerCase().charAt(0); //scn.next().toLowerCase().charAt(0);
            }
        }while (exit != 'y');

        System.out.println("\n\t******************************************\n" +
                "\t*  GOOD BYE. I HOPE YOU COME BACK AGAIN! *\n"+
                "\t******************************************");
    }
}