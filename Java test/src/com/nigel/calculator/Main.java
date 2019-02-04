package com.nigel.calculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("What program do you want to run today? \n");
        String prog = scn.nextLine();
        if (prog.equals("calc"))
        {
            calc();
        } else if (prog.equals("salary"))
        {
            salary();
        }
    }
    public static void calc()
    {
        double num1;
        double num2;
        double result;
        String op;
        Scanner in = new Scanner(System.in);
        System.out.print("Welcome to the most awesome java calculator ever \n");
        System.out.print("enter your operator \n");
        op = in.next();
        if (op.equals("+"))
        {
            System.out.print("enter your first number \n");
            num1 = in.nextDouble();
            System.out.print("enter your second number \n");
            num2 = in.nextDouble();
            result = num1 + num2;
            System.out.print("Result:" + result + "\n");
            try {
                // thread to sleep for 1000 milliseconds
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }
            calc();
        }
        else if (op.equals("-")){
            System.out.print("enter your first number \n");
            num1 = in.nextDouble();
            System.out.print("enter your second number \n");
            num2 = in.nextDouble();
            result = num1 - num2;
            System.out.print("Result:" + result + "\n");
            try {
                // thread to sleep for 1000 milliseconds
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }
            calc();
        } else if (op.equals("*"))
        {
            System.out.print("enter your first number \n");
            num1 = in.nextDouble();
            System.out.print("enter your second number \n");
            num2 = in.nextDouble();
            result = num1 * num2;
            System.out.print("Result:" + result + "\n");
            try {
                // thread to sleep for 1000 milliseconds
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }
            calc();
        } else if (op.equals("/"))
        {
            System.out.print("enter your first number \n");
            num1 = in.nextDouble();
            System.out.print("enter your second number \n");
            num2 = in.nextDouble();
            result = num1 / num2;
            System.out.print("Result:" + result + "\n");
            try {
                // thread to sleep for 1000 milliseconds
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }
            calc();
        } else if (op.equals("pi"))
        {
            System.out.print(Math.PI);
            try {
                // thread to sleep for 1000 milliseconds
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }
            calc();
        } else if (op.equals("pow"))
        {
            System.out.print("enter your first number \n");
            num1 = in.nextDouble();
            System.out.print("enter your second number \n");
            num2 = in.nextDouble();
            result = Math.pow(num1, num2);
            System.out.print("Result:" + result + "\n");
            try {
                // thread to sleep for 1000 milliseconds
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }
            calc();
        } else if (op.equals("sqrt"))
        {
            System.out.print("enter your number \n");
            num1 = in.nextDouble();
            result = Math.sqrt(num1);
            System.out.print(result);
            try {
                // thread to sleep for 1000 milliseconds
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }
            calc();
        } else if (op.equals("aoc"))
        {
            System.out.print("enter radius of circle \n");
            num1 = in.nextDouble();
            result = Math.PI * num1 * num1;
            System.out.print("Result:" + result + "\n");
            try {
                // thread to sleep for 1000 milliseconds
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }
            calc();
        } else if (op.equals("aor"))
        {
            System.out.print("enter length of rectangle \n");
            num1 = in.nextDouble();
            System.out.print("enter width of rectangle \n");
            num2 = in.nextDouble();
            result = num1 * num2;
            System.out.print("Result:" + result + "\n");
            try {
                // thread to sleep for 1000 milliseconds
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }
            calc();
        }
    }
    public static void salary() {
        double salary;
        double hr;
        double result;
        System.out.print("Welcome at the salary calculator \n");
        Scanner salscn = new Scanner(System.in);
        System.out.print("Enter your salary \n");
        salary = salscn.nextDouble();
        System.out.print("Enter your hours \n");
        hr = salscn.nextDouble();
        result = salary * hr;
        System.out.print(result);
        try {
            // thread to sleep for 1000 milliseconds
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
        salary();
    }
    public static void converter() {
        
    }
}