package exercice3;

public class TestAdresseIP {
	public static void main(String args[]) {
		try {
			AdresseIP ip = new AdresseIP(192,168,10,37); 
			
			System.out.println( "valid ip :"+ip.toString());
		}catch(ExceptionAdrIP e) {
			System.out.println("Error creating IP"+ e.getMessage());
		}
		try {
			AdresseIP ip2 = new AdresseIP(580,500,666,999);
			 System.out.println( "invalid ip :"+ip2.toString());
		}catch(ExceptionAdrIP e) {
			System.out.println("Error creating IP"+ e.getMessage());

		}
	    try {
	        AdresseIP ip3 = new AdresseIP(192, 168, 300, 37);
	        System.out.println("IP3: " + ip3);
	    } catch (ExceptionAdrIP e) {
	        System.out.println("Error creating IP: " + e.getMessage());

		
	}
}}
