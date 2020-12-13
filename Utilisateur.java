
public class Utilisateur {
	
	private String pseudo;
	private String motDePasse;
	private final String adresseMail;
	
	public Utilisateur( String pseudo, String motDePasse, String adresseMail) {
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
		this.adresseMail = adresseMail;
		
	}
	
	public boolean testMotDePasse (String test) {
		if (test.equals(motDePasse)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void  changerMotDePasse (String motDePasse, String nouveauMotDePasse) {
		if (testMotDePasse(motDePasse)) {
			this.motDePasse = nouveauMotDePasse;
		}
		else {
			System.out.println("Erreur ! Mot de passe incorrect !");
		}
	}
	
	public boolean Egaux(Utilisateur p) {
		if (p.pseudo.equals(pseudo) && p.motDePasse.equals(motDePasse) && p.adresseMail.equals(adresseMail)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getPseudo() {
		return pseudo;
	}
	
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
	public String getMdp() {
		return motDePasse;
	}
	



}

