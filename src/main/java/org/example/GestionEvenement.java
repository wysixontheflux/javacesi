package org.example;

import java.util.HashMap;
import java.util.Map;

public class GestionEvenement {
    private Evenement evenement;
    private Map<String, Double> tarificationEtapes;

    public GestionEvenement(Evenement evenement) {
        this.evenement = evenement;
        tarificationEtapes = new HashMap<>();
        initialiserTarification();
    }

    private void initialiserTarification() {
        tarificationEtapes.put("logistique", 3000.0);
        tarificationEtapes.put("gestion", 5000.0);
    }

    public double calculerRemuneration() {
        double remuneration = this.evenement.getBudget();

        for (double cout : tarificationEtapes.values()) {
            remuneration -= cout;
        }

        return remuneration;
    }

}

