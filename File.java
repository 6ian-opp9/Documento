
public class File extends Documento {

	private String nomePercorso; 
	
	public File(String nomePercorso, String testo) {
		super (testo);
		
		this.nomePercorso = nomePercorso;
	}

	public String getNomePercorso() {
		return nomePercorso;
	}

	public void setNomePercorso(String nomePercorso) {
		this.nomePercorso = nomePercorso;
	}
	
	/*
	 * =======================================================================================================================
	 */
	
	public void to_String(String nome_file) {
		
		System.out.println("Il nome del file è: " + nome_file + "\n" + super.toString());
	}
}
