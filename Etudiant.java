public class Etudiant{
	//Proprietes
	private String nomEtudiant;
	public String prenomEtudiant;
	private String emailEtudiant;
	private int telephone;
	
	//Constructeur
	
	public Etudiant(){
		
	}
	
	public Etudiant(String nom, String prenom){
		this.nomEtudiant=nom;
		
		this.prenomEtudiant=prenom;
	}
	
	//Getter et Setters
	public String getPrenomEtudiant(){
		return this.prenomEtudiant
	}
	
	public String getNomEtudiant(){
		return this.NomEtudiant
	}
	
	public String setPrenomEtudiant(String prenom){
		this.prenomEtudiant=prenom;
	}
	
	public String setNomEtudiant(String nom){
		this.NomEtudiant=nom;
	}
	
	//Methode 
	public void afficher(){
		System.out.println(this.nomEtudiant+" "+this.prenomEtudiant);
		System.out.println(this.nomEtudiant+" "+this.prenomEtudiant);
	}
}