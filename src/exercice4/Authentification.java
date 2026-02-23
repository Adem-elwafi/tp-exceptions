package exercice4;

import java.io.IOException;
import java.util.Scanner;

public class Authentification {
    // Constants
    private static final String LOGIN_CORRECT = "scott";
    private static final String PWD_CORRECT = "tiger";
    
    // Attributes
    private String login;
    private String password;
    
    // Constructor
    public Authentification() throws WrongLoginException, WrongPwdException, 
                                      WrongInputLengthException, IOException {
        this.login = getUserLogin();
        this.password = getUserPwd();
        System.out.println("Authentification créée avec succès!");
    }
    
    // Methods to implement
    public String getUserLogin() throws WrongInputLengthException, 
		WrongLoginException, IOException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entrez votre login: ");
		String input = scanner.nextLine();
		
		// Check length (max 10 characters)
		if (input.length() > 10) {
		throw new WrongInputLengthException("Le login ne doit pas dépasser 10 caractères! (saisie: " + input.length() + ")");
		}
		
		// Check if login matches "scott"
		if (!input.equals(LOGIN_CORRECT)) {
		throw new WrongLoginException("Login incorrect! (saisie: " + input + ")");
		}

return input;
}
			    public String getUserPwd() throws WrongInputLengthException, 
			    WrongPwdException, IOException {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Entrez votre mot de passe: ");
			String input = scanner.nextLine();
			
			// Check length (max 10 characters)
			if (input.length() > 10) {
			throw new WrongInputLengthException("Le mot de passe ne doit pas dépasser 10 caractères! (saisie: " + input.length() + ")");
			}
			
			// Check if password matches "tiger"
			if (!input.equals(PWD_CORRECT)) {
			throw new WrongPwdException("Mot de passe incorrect!");
			}
			
			return input;
			}
}