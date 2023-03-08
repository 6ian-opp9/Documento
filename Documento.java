
public class Documento {

	private String testo; // tutti i contenuti testuali del documento
	
	public Documento(String testo) {
		
		this.testo = testo; 
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	/*
	 * =======================================================================================================================
	 */
	
	
	public void to_String() {
		
		System.out.println("Il documento contiene: " + testo);
	}
	
	
}
