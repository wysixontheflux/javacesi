package org.example;

public class Test {
    @org.junit.Test
    public void testCalculRemuneration() {
        System.out.println("Début du test de calcul de rémunération");
        Concert concert = new Concert("Test Concert", 100, 15000);
        GestionEvenement gestionConcert = new GestionEvenement(concert);
        double remunerationConcert = gestionConcert.calculerRemuneration();
        System.out.println("Rémunération pour le concert: " + remunerationConcert + "€");
        System.out.println("Test terminé");
    }
}
