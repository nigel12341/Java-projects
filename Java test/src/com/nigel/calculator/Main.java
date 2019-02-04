package com.nigel.calculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        calc();
    }
    public static void calc()
    {
        int num1;
        int num2;
        int result;
        String op;
        Scanner in = new Scanner(System.in);
        System.out.print("Welcome to the most awesome java calculator ever \n");
        System.out.print("enter your operator \n");
        op = in.next();
        if (op.equals("+"))
        {
            System.out.print("enter your first number \n");
            num1 = in.nextInt();
            System.out.print("enter your second number \n");
            num2 = in.nextInt();
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
            num1 = in.nextInt();
            System.out.print("enter your second number \n");
            num2 = in.nextInt();
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
            num1 = in.nextInt();
            System.out.print("enter your second number \n");
            num2 = in.nextInt();
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
            num1 = in.nextInt();
            System.out.print("enter your second number \n");
            num2 = in.nextInt();
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
            num1 = in.nextInt();
            System.out.print("enter your second number \n");
            num2 = in.nextInt();
            double result_;
            result_ = Math.pow(num1, num2);
            System.out.print("Result:" + result_ + "\n");
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
            num1 = in.nextInt();
            double result_;
            result_ = Math.sqrt(num1);
            System.out.print(result_);
        }
    }
}