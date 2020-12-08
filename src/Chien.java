import java.util.Scanner;

public class Chien {

    String nom;
    void aboyer() {
        System.out.println(nom+" dit wwaaaarf.  Je mange de la viande");
    }

    void mange() {
        System.out.println(nom+" dit wwaaaarf.  Je mange de la viande");
    }


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String input =scan.next();
        if(input.equals("mange"))
        {
            Chien Rex = new Chien();
            Rex.nom="Rex";
            Rex.mange();
            Chien Max = new Chien();
            Max.nom="Max";
            Max.mange();
        }
        else if(input.equals("aboyer"))
        {
            Chien Rex = new Chien();
            Rex.nom="Rex";
            Rex.aboyer();
            Chien Max = new Chien();
            Max.nom="Max";
            Max.aboyer();
        }
    }

}