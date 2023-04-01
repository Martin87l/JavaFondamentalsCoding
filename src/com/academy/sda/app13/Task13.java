package com.academy.sda.app13;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vendos tekstin: ");
        String tekst= scanner.nextLine();

        String[] fjalet = tekst.split(" ");
        String textModifikuar="";
        for (String el:fjalet){
            textModifikuar += el + " "+ el + " ";

        }
        System.out.println("Teksti i modifikuar eshte: " +textModifikuar);
    }
}
