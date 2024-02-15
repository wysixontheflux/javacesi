package org.example;

public class ApplicationEvenementiel {
    public static void main(String[] args) {
        Concert concert = new Concert("Concert Rock", 150, 20000);
        concert.planifier();

        GestionEvenement gestionConcert = new GestionEvenement(concert);
        double remunerationConcert = gestionConcert.calculerRemuneration();
        System.out.println("Rémunération pour le concert: " + remunerationConcert + "€");
    }
}
