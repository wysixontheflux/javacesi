package org.example;
import java.util.Scanner;

public class ApplicationEvenementiel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionConcert gestionConcert = new GestionConcert();

        boolean continuer = true;
        while (continuer) {
            System.out.println("Choisissez un type d'événement:");
            System.out.println("1. Concert");
            System.out.println("2. Salon Commercial");
            System.out.println("3. Voir la liste des concerts");
            System.out.println("4. Quitter");
            System.out.print("Votre choix: ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Vous avez choisi un Concert.");
                    scanner.nextLine();

                    System.out.print("Entrez le nom du concert: ");
                    String nom = scanner.nextLine();

                    System.out.print("Entrez le nombre de participants: ");
                    int participants = scanner.nextInt();

                    System.out.print("Entrez le budget: ");
                    double budget = scanner.nextDouble();

                    Concert concert = new Concert(nom, participants, budget);
                    gestionConcert.ajouterConcert(concert);
                    break;
                case 2:
                    System.out.println("Vous avez choisi un Salon Commercial.");
                    break;
                case 3:
                    gestionConcert.afficherConcerts();
                    break;
                case 4:
                    continuer = false;
                    break;
                default:
                    System.out.println("Choix non valide.");
                    break;
            }
        }
    }
}
