package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Kalendermonat eingeben: ");
	String monat = input.next();
	switch(monat) {
        case "Dezember":
        case "Januar":
        case "Februar":
            System.out.print("Winter");
            break;
        case "März":
        case "April":
        case "Mai":
            System.out.print("Frühjahr");
            break;
        case "Juni":
        case "Juli":
        case "August":
            System.out.print("Sommer");
            break;
        case "September":
        case "Oktober":
        case "November":
            System.out.print("Herbst");
            break;
        default: System.out.print("Unerlaubte Eingabe!");
    }

    }
}
