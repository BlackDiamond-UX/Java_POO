package Exercice5;

public class clients {
    private String nom;
    private String adresse;
    private double solde;

    public void setAccount(String nom, String adresse, double solde) {
        this.nom = nom;
        this.adresse = adresse;
        this.solde = solde;
    }

    public void getAccount() {
        System.out.println(nom + " a " + "(" + adresse + ")"
                + " - infos solde " + solde + "dh");
    }

}
