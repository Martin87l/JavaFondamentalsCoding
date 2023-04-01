package com.academy.sda.app10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vendos nje numer pozitiv: ");
        int numri= scanner.nextInt();

        int shuma=0;
        while (numri>0){
            int shifra =numri%10;
            shuma += shifra;
            numri /=10;
        }
        System.out.println("Shuma e shifrave te vendosura eshte:"+ shuma);
    }
}
