package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Witaj, jak masz na imię?");
        String imie = scan.nextLine();
        System.out.println("Cześć " + imie + ". :) Jeśli trenujesz bądź jesteś osobą powyżej 60 roku życia, wynik BMI może być zakłamany. :)");
        System.out.println("W celu obliczenia Twojego BMi, podaj swoją wagę.");
        double waga = scan.nextDouble();
        System.out.println("A teraz podaj swój wzrost w metrach(używając przecinka;)).");
        double wzrost = scan.nextDouble();

        double BMI = waga/(wzrost * wzrost);
        BMI = Math.round(BMI);
        System.out.println("Twoje BMI to: " + BMI);

        if (BMI<=18)
        {
            System.out.println("Masz niedowagę, zgłoś się do lekarza w celu uzyskania pomocy.");
        }
        else if (BMI >= 19 && BMI <= 25)
        {
            System.out.println("Masz prawidłową masę ciała. :) ");
        }

        else if  (BMI >26 && BMI <=30)
        {
            System.out.println("Masz nadwagę.");
        }
        else if (BMI > 30 && BMI <= 35)
        {
            System.out.println("Masz otyłość I stopnia, zwróc się do lekarza.");
        }
        else if (BMI >35 && BMI <= 40)
        {
            System.out.println("Masz otyłośc II stopnia, zgłoś się do lekarza.");
        }
        else if (BMI >40)
        {
            System.out.println("Występuje u Ciebie skrajna otyłość. Koniecznie zgłoś się do lekarza.");
        }

    }
}
