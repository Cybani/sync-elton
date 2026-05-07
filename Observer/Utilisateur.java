package Observer;

public class Utilisateur implements Observer{

    private String nom;
    private String prenom;
    private int age;

    public Utilisateur(String nom, String prenom, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    @Override
    public void recapMensuel() {
        System.out.println("Récapitulatif mensuel : [TODO]");
    }


}
