package org.example;

public abstract class Evenement {
    protected String nom;
    protected int nombreParticipants;
    protected double budget;

    public Evenement(String nom, int nombreParticipants, double budget) {
        this.nom = nom;
        this.nombreParticipants = nombreParticipants;
        this.budget = budget;
    }

    public abstract void planifier();

    public double getBudget() {
        return budget;
    }
}

