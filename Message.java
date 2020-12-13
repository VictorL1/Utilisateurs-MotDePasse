
public class Message {

		private final String Msg;
		private String Objet;
		public Utilisateur utilisateur;
		
		public Message (String Msg, String Objet, Utilisateur utilisateur) {
			this.Msg = Msg;
			this.Objet = Objet;
			this.utilisateur = utilisateur;
		}
		
		public void AfficherMessage() {
			System.out.println("User :" + utilisateur.getPseudo());
			System.out.println("Objet :" + Objet);
			System.out.println("Message :" + Msg);
		}
		
}
