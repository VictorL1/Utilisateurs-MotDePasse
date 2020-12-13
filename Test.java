
public class Test {
	
	public static void main(String[] args) {
		
		Utilisateur Martin = new Utilisateur("Marty", "Marty123", "martin@mail.com");
		Utilisateur Tinmar = new Utilisateur("Tymar", "Marty123", "martin@mail.com");
		Utilisateur Martinmar = new Utilisateur("sqewfxdg", "qzeswzfxdgh", "martin@mail.com");

		System.out.println(Martin.testMotDePasse("Marty1234"));
		System.out.println(Martin.testMotDePasse("Marty123"));
		Martin.changerMotDePasse("Marty123", "Marty1234");
		System.out.println(Martin.getMdp());
		Martin.changerMotDePasse("Marty123", "Cacahuetes");
		Salon Confortable = new Salon ();
		Confortable.ajouterUtilisateur(Martin);
		Confortable.ajouterUtilisateur(Tinmar);
		System.out.println(Confortable.estPresent(Martin));
		System.out.println(Confortable.estPresent(Tinmar));
		Message msg = new Message ("Coucou Tinmar", "Coucou", Martin);
		Message msg2 = new Message ("Coucou Martin", "Coucou", Tinmar);
		Message msg3 = new Message ("Coucou les gars", "Coucou", Martinmar);
		Confortable.ajouterMessage(msg);
		Confortable.ajouterMessage(msg2);
		Confortable.ajouterMessage(msg3);
		Confortable.afficher();
		
	}
}