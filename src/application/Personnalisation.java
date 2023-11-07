package application;

public class Personnalisation extends Option {
	
	private String textPerso;

	public Personnalisation(float prix, String libelle, String type, String textPerso) {
		super(prix, libelle, type);
		this.textPerso = textPerso;
	}

	public String getTextPerso() {
		return textPerso;
	}

	public void setTextPerso(String textPerso) {
		this.textPerso = textPerso;
	}
	
	
}