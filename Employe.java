public class Employe{
	//Proprietes
	private String nomEmploye;
	public String prenomEmploye;
	
	//Constructeur
	
	public Employe(){
		
	}
	
	public Employe(String nom, String prenom){
		this.nomEmploye=nom;
		
		this.prenomEmploye=prenom;
	}
	
	//Getter et Setters
	public String getPrenomEmploye(){
		return this.prenomEmploye;
	}
	
	public String getNomEmploye(){
		return this.NomEmploye;
	}
	
	public String setPrenomEmploye(String prenom){
		this.prenomEmployet=prenom;
	}
	
	public String setNomEmploye(String nom){
		this.NomEmploye=nom;
	}
}