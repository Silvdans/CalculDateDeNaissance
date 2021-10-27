package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez votre jour de naissance");
        int jour = scanner.nextInt();
        System.out.println("Entrez votre mois de naissance");
        int mois = scanner.nextInt();
        System.out.println("Entrez votre année de naissance");
        int année = scanner.nextInt();

        DateDeNaissance DDN = new DateDeNaissance();;

        System.out.println(DDN.calculAge(jour,mois,année));

    }
}
