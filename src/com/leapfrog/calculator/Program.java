/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calculator;

import java.util.Scanner;
import com.leapfrog.calculator.util.calc;

public class Program {

    public static void menu() {
        System.out.println("1.Add");
        System.out.println("2.Sub");
        System.out.println("3.Mul");
        System.out.println("4.Div");
        System.out.println("5.Power");
        System.out.println("6.Min");
        System.out.println("7.Max");
        System.out.println("8.Mul-Table");
        System.out.println("9.Exit");
        System.out.println("Select number from[1-9]");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first number :");
            double x = input.nextDouble();

            System.out.println("Enter Second N=number :");
            double y = input.nextDouble();

            menu();

            int choice = input.nextInt();

                    
            
            calc c = new calc();
            double total =c.Calculate(choice, x, y);
            
                    
            
            
            
            System.out.println("Total =" + total);
            System.out.println("Do you want to continue[Y/N]"); 
            String ch = input.next();
            if (ch.equalsIgnoreCase("n")) {
                System.exit(0);
            }

        }
    }
}
