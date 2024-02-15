package org.example;
import java.util.Scanner;

public class ApplicationEvenementiel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez un type d'événement:");
        System.out.println("1. Concert");
        System.out.println("2. Salon Commercial");
        System.out.print("Votre choix: ");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                System.out.println("Vous avez choisi un Concert.");
                break;
            case 2:
                System.out.println("Vous avez choisi un Salon Commercial.");
                break;
            default:
                System.out.println("Choix non valide.");
                break;
        }

        System.out.print("Entrez le nom du concert: ");
        String nom = scanner.next();

        System.out.print("Entrez le nombre de participants: ");
        int participants = scanner.nextInt();

        System.out.print("Entrez le budget: ");
        double budget = scanner.nextDouble();

        Concert concert = new Concert("Concert Rock", 150, 20000);
        concert.planifier();

        GestionEvenement gestionConcert = new GestionEvenement(concert);
        double remunerationConcert = gestionConcert.calculerRemuneration();
        System.out.println("Rémunération pour le concert: " + remunerationConcert + "€");
    }
}
