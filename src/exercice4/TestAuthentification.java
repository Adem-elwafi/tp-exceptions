package exercice4;

import java.io.IOException;

public class TestAuthentification {
    public static void main(String[] args) {
        boolean authenticated = false;
        
        System.out.println("=== SYSTÈME D'AUTHENTIFICATION ===");
        System.out.println("(login: scott, password: tiger, max 10 caractères)");
        System.out.println();
        
        while (!authenticated) {
            try {
                Authentification auth = new Authentification();
                System.out.println("\n✅ Authentification réussie! Bienvenue, scott!");
                authenticated = true;
                
            } catch (WrongLoginException e) {
                System.out.println("❌ Erreur de login: " + e.getMessage());
                System.out.println("Veuillez réessayer.\n");
                
            } catch (WrongPwdException e) {
                System.out.println("❌ Erreur de mot de passe: " + e.getMessage());
                System.out.println("Veuillez réessayer.\n");
                
            } catch (WrongInputLengthException e) {
                System.out.println("❌ Erreur de longueur: " + e.getMessage());
                System.out.println("Veuillez réessayer.\n");
                
            } catch (IOException e) {
                System.out.println("❌ Erreur d'entrée/sortie: " + e.getMessage());
                System.out.println("Veuillez réessayer.\n");
            }
        }
    }
}