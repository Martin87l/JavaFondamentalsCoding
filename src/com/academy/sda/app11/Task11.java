package com.academy.sda.app11;
import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vendos tekstin");
        String inputTekst = scanner.next();
        String maxInputLengthText=inputTekst;
        while (!inputTekst.equals("Enough!"));{
        inputTekst= scanner.next();
        if (inputTekst.length()>maxInputLengthText.length()) {
            maxInputLengthText = inputTekst;
        }
        }
        System.out.println("Teksti me i gjate eshte: "+ maxInputLengthText);


    }
}
