package application;

public class Sony implements TV {
	
	private int dimensione;
	private float prezzo;
	private String tipologia;

	
	
	public Sony(int dimensione, float prezzo, String tipologia) {
		super();
		this.dimensione = dimensione;
		this.prezzo = prezzo;
		this.tipologia = tipologia;
	}



	public int getDimensione() {
		return dimensione;
	}



	public void setDimensione(int dimensione) {
		this.dimensione = dimensione;
	}


	@Override
	public String toString() {
		return "Sony Tv[dimensione=" + dimensione + " pollici, prezzo=" + prezzo + "Euro, tipologia=" + tipologia + "]";
	}



	public float getPrezzo() {
		return prezzo;
	}



	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}



	public String getTipologia() {
		return tipologia;
	}



	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}


	@Override
	public void produce() {
		System.out.println("produce a Sony Tv");
	}

}
