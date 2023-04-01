package com.academy.sda.app12;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vendos tekstin: ");
        String tekst= scanner.nextLine();
        int count=0;
        for (int i=0; i<tekst.length();i++) {
            if (tekst.charAt(i)==' ' ) {
                count++;
            }
            }
        System.out.println("Teksti ka "+ count + "hapsira");
        double perqindja = ((double) count/tekst.length())*100;
        System.out.println("Perqindja e hapsires ne tekstin e vendosur eshte:"+ perqindja);

    }
}
