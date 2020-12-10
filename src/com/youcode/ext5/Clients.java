package com.youcode.ext5;

public class Clients {
    private String nom;
    private String adresse;
    private double solde;

    //getters
    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public double getSolde() {
        return solde;
    }
    //setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void afficherInfo() {
        System.out.println(nom + " a " + "(" + adresse + ")"
                + " - infos solde " + solde + "dh");
    }

}
