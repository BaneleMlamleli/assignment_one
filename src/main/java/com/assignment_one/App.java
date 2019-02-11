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
                "\t********************************************");

        char exit;
        do {
            System.out.print("Choose option below\n"+
                    "A - Addition\n"+
                    "S - Subtraction\n"+
                    "M - Multiplication\n"+
                    "D - Division\n\n"+
                    "Option:  ");

            char option = scn.next().toLowerCase().charAt(0);

            switch (option){
                case 'a': ;break;
                case 's': ;break;
                case 'm': ;break;
                case 'd': ;break;
            }
            System.out.print("Exit calculator Yes/No: ");
            exit = scn.next().toLowerCase().charAt(0);
        }while (exit != 'y');

        System.out.println("\n\t******************************************\n" +
                "\t*  GOOD BYE. I HOPE YOU COME BACK AGAIN! *\n"+
                "\t******************************************");
    }
}
