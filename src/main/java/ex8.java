/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many people? ");
        int people = input.nextInt();   //stores amount of people
        System.out.print("How many pizzas do you have? ");
        int pizzas= input.nextInt();    //stores amount of pizza
        System.out.print("How many slices per pizza? ");
        int slices = input.nextInt();   //stores slices of pizzas per pizza
        int total=slices*pizzas;

        System.out.println(people+ " people with "+pizzas+" pizzas ("+total+" slices)");

        System.out.println("Each person gets "+total/people+" piece of pizza.");
        System.out.println("There are "+(total%people)+" leftover pieces.");
    }
}
