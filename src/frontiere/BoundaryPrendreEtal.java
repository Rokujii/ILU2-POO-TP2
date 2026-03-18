package frontiere;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		boolean nomVendeurConnu = controlPrendreEtal.verifierIdentite(nomVendeur);

		if (!nomVendeurConnu) {
			System.out.println("Je suis désolée " + nomVendeur
					+ "mais il faut être un habitant de notre village pour commercer ici.");
		} else {
			System.out.println("Bonjour " + nomVendeur + ", je vais regarder si je peux vous trouver un étal.");
			boolean etalDisponible = controlPrendreEtal.resteEtals();
			if (!etalDisponible) {
				installerVendeur(nomVendeur);
			}
		}
	}

	private void installerVendeur(String nomVendeur) {
		StringBuilder chaine = new StringBuilder();
		chaine.append("C'est parfait, il me reste un étal pour vous !\n");
		chaine.append("Il me faudrait quelques renseignements :\n");
		chaine.append("Quel produit souhaitez-vous vendre ");
	}
}
