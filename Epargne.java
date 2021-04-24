public class Epargne extends Compte
{
    private int taux;
    
    public Epargne()
    {

    }
        
    public Epargne(int solde, int taux )
    {
        super(solde);
        this.setTaux(taux);
    }
    public int getTaux() {
        return taux;
    }

    public void setTaux(int taux) {
        this.taux = taux;
    }

    @Override
    public void depot(int montant) {
        solde += montant * (1 + (taux/100));     
    }

    @Override
    public void retrait(int montant) {
        System.out.println("Operation impossible");     
    }

    @Override
    public void virement(Compte compteVirement, int montant) {
        System.out.println("Operation impossible");

    }
    
    @Override
    public String afficher()
    {
        return super.afficher()+ 
        "\n Taux :" + getTaux();
    }

}