/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calculator.util;

public class calc {

    public double add(double x, double y) {
        return x + y;
    }

    public double sub(double x, double y) {
        return x - y;
    }

    public double mul(double x, double y) {
        return x * y;
    }

    public double div(double x, double y) {
        return x / y;
    }

    public double power(double x, double y) {
        double total = 1;
        for(int i = 1;i<=y;i++){
            total = total *x;
        }
        return total;
    }

    public double min(double x, double y) {
        if(x<y){
          return x;  
        } else {
        return y;
    }
        
        
    }

    public double max(double x, double y) {
        if(x>y){
            return x;
        }
        else {
            return y ;
        }
    }

    public double MulTable(double x, double y) {
        double total=1; 
        for (int i=1;i<=y;i++){
        total = x*i;
            System.out.println(x +"*" + i + "=" + total);
    }
        return total;
    }

    public double Calculate(int choice, double x, double y) {

        double total = 0;
        if (choice == 1) {
            total = add(x, y);
        } else if (choice == 2) {
            total = sub(x, y);
        } else if (choice == 3) {
            total = mul(x, y);
        } else if (choice == 4) {
            total = div(x, y);
        } else if (choice == 5) {
            total = power(x, y);
        } else if (choice == 6) {
            total = min(x, y);
        } else if (choice == 7) {
            total = max(x, y);
        } else if (choice == 8) {
            total = MulTable(x, y);
        } else {
            System.exit(0);
        }
        return total;
    }

}
