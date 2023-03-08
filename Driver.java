import java.util.Scanner;
public class Driver {

	public static void main (String [] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		Email mail = new Email("Salvatore Fumagalli", "Mario Tisci", "Un'avventura", "Ciao, come stai?");
		
		File file = new File("Domande", "Ciao, come stai?");
		
		Documento docs = new Documento("Ciao, come stai?");
		
		if(contieneParolaChiave(docs, "come")) {
			
			System.out.println("La parola è contenuta nel testo.");
		}
		else {
			
			System.out.println("La parola non è contenuta nel testo.");
		}
		
	}
	
	public static boolean contieneParolaChiave(Documento oggettoDoc, String parolaChiave) {
		if (oggettoDoc.toString().indexOf(parolaChiave, 0) >= 0) {
			
			return true;
		}
		else {
			
			return false;
		}
			
			
	}
}
