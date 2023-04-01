package com.academy.sda.prova;

import java.util.Scanner;

public class Stutter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        for (String word : words) {
            System.out.print(word + " " + word + " ");
        }
    }
}