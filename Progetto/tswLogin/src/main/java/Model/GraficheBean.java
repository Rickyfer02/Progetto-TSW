package Model;

public class GraficheBean extends Articolo{
	private String titolo;
	private String categoria;
	
	public GraficheBean() {
		
	}
	
	public GraficheBean(long seriale, String titolo, double prezzo, int quantit�, String descrizione,
			 String categoria) {
		super(seriale, prezzo, quantit�, descrizione);
		this.titolo = titolo;
		this.categoria = categoria;
	}

	public long getSeriale() {
		return seriale;
	}

	public void setSeriale(long seriale) {
		this.seriale = seriale;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getQuantit�() {
		return quantit�;
	}

	public void setQuantit�(int quantit�) {
		this.quantit� = quantit�;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}
	
	
}


