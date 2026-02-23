package exercice3;


public class AdresseIP {
    private int[] octet; 

    // The constructor now DECLARES that it might throw our custom exception
    public AdresseIP(int o1, int o2, int o3, int o4) throws ExceptionAdrIP {
        // VALIDATION: Check each octet before assigning!
        if (o1 < 0 || o1 > 255) {
            throw new ExceptionAdrIP("Erreur: Octet 1 (" + o1 + ") n'est pas entre 0 et 255");
        }
        if (o2 < 0 || o2 > 255) {
            throw new ExceptionAdrIP("Erreur: Octet 2 (" + o2 + ") n'est pas entre 0 et 255");
        }
        if (o3 < 0 || o3 > 255) {
            throw new ExceptionAdrIP("Erreur: Octet 3 (" + o3 + ") n'est pas entre 0 et 255");
        }
        if (o4 < 0 || o4 > 255) {
            throw new ExceptionAdrIP("Erreur: Octet 4 (" + o4 + ") n'est pas entre 0 et 255");
        }
        
        // ONLY if all validations pass, we create the array and assign values
        octet = new int[4];
        this.octet[0] = o1; 
        this.octet[1] = o2; 
        this.octet[2] = o3; 
        this.octet[3] = o4; 
    }
    
    @Override 
    public String toString() {
        return octet[0] + "." + octet[1] + "." + octet[2] + "." + octet[3];
    }
}