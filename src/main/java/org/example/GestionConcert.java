package org.example;

import java.util.ArrayList;
import java.util.List;

public class GestionConcert {
    private List<Concert> concerts = new ArrayList<>();

    public void ajouterConcert(Concert concert) {
        concerts.add(concert);
    }

    public void afficherConcerts() {
        if (concerts.isEmpty()) {
            System.out.println("Aucun concert n'a été ajouté.");
        } else {
            for (Concert concert : concerts) {
                System.out.println(concert);
            }
        }
    }
}
