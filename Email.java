
public class Email extends Documento {

	private String mittente;
	private String destinatario;
	private String titolo_messaggio;
	
	public Email (String mittente, String destinatario, String titolo_messaggio, String testo){
		super(testo);
		
		this.mittente = mittente;
		this.destinatario = destinatario;
		this.titolo_messaggio = titolo_messaggio;
	}

	public String getMittente() {
		return mittente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public String getTitolo_messaggio() {
		return titolo_messaggio;
	}

	public void setMittente(String mittente) {
		this.mittente = mittente;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public void setTitolo_messaggio(String titolo_messaggio) {
		this.titolo_messaggio = titolo_messaggio;
	}
	
	/*
	 * =======================================================================================================================
	 */
	
	public void to_String() {
		
		System.out.println("Il mittente della mail è: " + mittente + "\nIl destinatario è: " + destinatario + "\nAvente titolo: " + titolo_messaggio);
	}
	
	public void salva_testo() {
		
		String temp = "Il mittente della mail è: " + mittente + "\nIl destinatario è: " + destinatario + "\nAvente titolo: " + titolo_messaggio + "\nContnuto "
				+ "testuale: " + getTesto();
		
		setTesto(temp);
	}
}
