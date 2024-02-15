package org.example;

public class Concert extends Evenement {
    public Concert(String nom, int nombreParticipants, double budget) {
        super(nom, nombreParticipants, budget);
    }

    @Override
    public void planifier() {

    }

    @Override // je sais que c'est pas de la persistance mais c est le seul moyen que j'ai trouver pour lister mes concerts
    public String toString() {
        return "Concert{" +
                "nom='" + nom + '\'' +
                ", nombreParticipants=" + nombreParticipants +
                ", budget=" + budget +
                '}';
    }
}


