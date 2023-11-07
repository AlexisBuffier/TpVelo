package application;

public class Velo {
	
	private String marque;
	private String lienVelo;
	private static Integer prix;

	
	public Velo(String marque, String lienVelo, Integer prix) {
		this.marque = marque;
		this.lienVelo = lienVelo;
		this.prix = prix;
	}


	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getLienVelo() {
		return lienVelo;
	}

	public void setLienVelo(String lienVelo) {
		this.lienVelo = lienVelo;
	}	
	
	public static Integer getPrix()
	{
		return prix;
	}
	
	
}