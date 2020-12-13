
public class Salon {
	private Utilisateur[] participants;
	private Message[] ordre;
	public int nbparticipants;
	public int nbmessage;;
	
	public Salon () {
		this.participants = new Utilisateur[100];
		this.ordre = new Message[10000];
		this.nbparticipants = 0;
		this.nbmessage = 0;
	}
	
	public void ajouterUtilisateur(Utilisateur p) {
		participants[nbparticipants] = p;
		nbparticipants++;
	}
	
	public boolean estPresent(Utilisateur p) {
		for (int i=0; i<nbparticipants; i++) {
			if (p.Egaux(participants[i])){
				return true;
			}
			
		}
		return false;
	}
	
	public void ajouterMessage(Message msg) {
		if (this.estPresent(msg.utilisateur)) {
			ordre[nbmessage] = msg;
			nbmessage++;
		}
	}
	
	public void afficher() {
		for(int i=0; i<nbmessage; i++) {
			ordre[i].AfficherMessage();
		}
	}
	
}
