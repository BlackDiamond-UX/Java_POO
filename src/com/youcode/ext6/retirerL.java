package com.youcode.ext6;

public class retirerL {
	public static void main(String[] args) {
		retirer ayoub = new retirer();
		ayoub.setNom("Rouiha Ayoub");
		ayoub.setAdresse("Youssoufia");
		ayoub.setSolde(8000);
		//Output
		System.out.println("Nom: " + ayoub.getNom());
		System.out.println("Adresse: " + ayoub.getAdresse());
		System.out.println("Solde: " + ayoub.getSolde() + "DH");
		ayoub.retirer();
	}

}