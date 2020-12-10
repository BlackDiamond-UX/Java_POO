package com.youcode.ext5;

public class infoAccount {

    public static void main(String[] args) {
        Clients ayoub = new Clients();
        ayoub.setNom("Rouiha Ayoub");
        ayoub.setAdresse("Youssoufia");
        ayoub.setSolde(8000);
        //Output
        System.out.println("Nom: " + ayoub.getNom());
        System.out.println("Adresse: " + ayoub.getAdresse());
        System.out.println("Solde: " + ayoub.getSolde());
    }
}
