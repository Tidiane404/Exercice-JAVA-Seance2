public class Courant extends Compte
{
    private int interet;

    public int getInteret() {
        return interet;
    }

    public void setInteret(int interet) {
        this.interet = interet;
    }

    public Courant()
    {

    }

    public Courant(int solde, int interet)
    {
        super(solde);
        this.setInteret(interet);  
    }

    @Override
    public void depot(int montant) {
        if (montant > 0)
        {
            solde += montant - interet;
        }
        else 
        {
            System.out.println("Montant insuffisant");
        }
    }



    @Override
    public void retrait(int montant) {
        if (solde > montant + interet)
        {
            solde -= montant + interet;
        }
        else 
        {
            System.out.println("Solde insuffisant");
        }
        
    }

    @Override
    public void virement(Compte compteVirement, int montant) {
        this.retrait(montant);
        compteVirement.depot(montant);
    }

    @Override
    public String afficher()
    {
        return super.afficher() 
        + "\n interet : " + getInteret();
    }
    
}