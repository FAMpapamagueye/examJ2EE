package sn.lamp.Form;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import sn.lamp.bean.UtilisateurBean;

public class inscriptionForm {
	public static final String VUE = "register";
	public static final String CHAMP_EMAIL = "email";
	public static final String CHAMP_PASS = "password";
	public static final String CHAMP_CONF = "Cpassword";
	public static final String CHAMP_LOGIN = "login";
	public static final String CHAMP_NOM = "nom";
	public static final String CHAMP_PROFIL = "profil";
	public static final String ATT_ERREURS = "erreurs";
	public static final String ATT_RESULTAT = "resultat";
	public static final String SUCCES = "login";
	private String resultat;
	Map<String, String> erreurs = new HashMap<String, String>();

	public UtilisateurBean inscrireUtilisateur(HttpServletRequest request) {
		String email = getValeurChamp(request, CHAMP_EMAIL);
		String motDePasse = getValeurChamp(request, CHAMP_PASS);
		String login = getValeurChamp(request, CHAMP_LOGIN);
		String nom = getValeurChamp(request, CHAMP_NOM);
		String profil = getValeurChamp(request, CHAMP_PROFIL);
		String confirmation = getValeurChamp(request, CHAMP_CONF);

		UtilisateurBean utilisateur = new UtilisateurBean();

		try {
			validationEmail(email);
		} catch (Exception e) {
			setErreurs(CHAMP_EMAIL, e.getMessage());
		}
		utilisateur.setEmail(email);

		try {
			validationMotsDePasse(motDePasse, confirmation);
		} catch (Exception e) {
			setErreurs(CHAMP_PASS, e.getMessage());
			setErreurs(CHAMP_CONF, null);
		}
		utilisateur.setMot_de_pass(motDePasse);;

		try {
			validationNom(nom);
		} catch (Exception e) {
			setErreurs(CHAMP_NOM, e.getMessage());
		}
		utilisateur.setNom(nom);

		try {
			validationLogin(login);
		} catch (Exception e) {
			setErreurs(CHAMP_LOGIN, e.getMessage());
		}
		utilisateur.setLogin(login);
		try {
			ValidationProfil(profil);
		} catch (Exception e) {
			// TODO: handle exception
			setErreurs(CHAMP_PROFIL, e.getMessage());
		}
		utilisateur.setProfil(profil);

		if (erreurs.isEmpty()) {

			resultat = SUCCES;

		} else {
			resultat = VUE;
		}

		return utilisateur;
	}

	private void validationEmail(String email) throws Exception {
		if (email != null) {
			if (!email.matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
				throw new Exception("Merci de saisir une adresse mail valide.");
			}
		} else {
			throw new Exception("l' adresse mail est obligatoire.");
		}
	}

	private void validationMotsDePasse(String motDePasse, String confirmation) throws Exception {
		if (motDePasse != null && confirmation != null) {
			if (!motDePasse.equals(confirmation)) {
				throw new Exception("Les mots de passe entr�s sont diff�rents, merci de les saisir � nouveau.");
			} else if (motDePasse.length() < 3) {
				throw new Exception("Les mots de passe doivent contenir au moins 3 caract�res.");
			}
		} else {
			throw new Exception("Merci de saisir et confirmer votre mot de passe.");
		}
	}

	private void validationNom(String nom) throws Exception {
		if (nom != null) {
			if (nom.length() < 5) {
				throw new Exception("Le nom d'utilisateur doit contenir au moins 5caract�res.");
			}

		} else {
			throw new Exception("Le nom d'utilisateur est obligatoire.");
		}
	}

	private void validationLogin(String login) throws Exception {
		if (login != null) {
			if (login.length() < 5) {
				throw new Exception("Le login d'utilisateur doit contenir au moins 5 caract�res.");
			}

		} else {
			throw new Exception("Le login d'utilisateur est obligatoire.");
		}
	}

	public void ValidationProfil(String profil) throws Exception {
		if (profil == null) {
			throw new Exception("Le profil d'utilisateur est obligatoire.");
		}
	}

	/*
	 * Ajoute un message correspondant au champ sp�cifi� � la map des erreurs.
	 */
	public void setErreurs(String champ, String message) {
		erreurs.put(champ, message);
	}

	public Map<String, String> getErreurs() {
		return erreurs;
	}

	public String getResultat() {
		return resultat;
	}

	/*
	 * M�thode utilitaire qui retourne null si un champ est vide, et son contenu
	 * sinon.
	 */
	private static String getValeurChamp(HttpServletRequest request, String nomChamp) {
		String valeur = request.getParameter(nomChamp);
		if (valeur == null || valeur.trim().length() == 0) {
			return null;
		} else {
			return valeur.trim();
		}
	}

}
