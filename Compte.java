public abstract class Compte implements IAffiche
{
    private static int nombreCompte;
    private final int FORMAT = 4;
    private String numero;
    protected int solde;

    //attribut navigationnel
    private Client client = new Client();

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    private String generateNumero()
    {
        String nombreZero = "";
        String nombreDeCompteString = String.valueOf(++nombreCompte);
        for(int i=1; i<=(FORMAT - nombreDeCompteString.length()); i++)
        {
            nombreZero += "0";
        }
        return nombreZero + nombreDeCompteString;
    }


    public String getNumero() {
        return numero;
    }
    public int getSolde() {
        return solde;
    }
    public void setSolde(int solde) {
        this.solde = solde;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public Compte() {
        numero = generateNumero();
    }
    
    public Compte(int solde) {
        numero = generateNumero();
        this.setSolde(solde);
    }

    @Override
    public String afficher()
    {
        return "\n numero de compte : " + getNumero() 
        + "\n solde : " + getSolde();
    }
    
    public abstract void depot(int montant);
    public abstract void retrait(int montant);
    public abstract void virement(Compte compteVirement, int montant);

}