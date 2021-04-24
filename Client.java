public class Client implements IAffiche
{
    private int nci;
    private String nomComplet;

    // Attribut navigationnel 
    private Compte[] tableCompte = new Compte[5];

    
    private int nombreDeComptes;

    public int getNombreDeCompte()
    {
        return nombreDeComptes;
    }

    
    public Compte[] getTableCompte() {
        return tableCompte;
    }

    public void addCompte( Compte compte) {
        tableCompte[nombreDeComptes] = compte;
        nombreDeComptes++;
    }
    public String getNomComplet() {
        return nomComplet;
    }
    

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    
    public int getNci() {
        return nci;
    }
    
    public void setNci(int nci) {
        this.nci = nci;
    }
    
    @Override
    public String afficher() {
        return "\n Nci : " + getNci() 
        + "\n Nom Complet : " + getNomComplet() ;
    }
}