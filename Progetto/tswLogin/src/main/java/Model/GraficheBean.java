package Model;

public class GraficheBean extends Articolo{
	private String categoria;
	
	public GraficheBean() {
		this.macroCategoria = "Grafiche";
	}
	
	public GraficheBean(String nome, long seriale, double prezzo, int quantit?, String descrizione,
			 String categoria, String macroCategoria, int numVendite, double iva, boolean visible) {
		super(nome, seriale, prezzo, quantit?, descrizione, macroCategoria, numVendite, iva, visible);
		this.categoria = categoria;
		this.macroCategoria = "Grafiche";
	}
	
	public long getSeriale() {
		return seriale;
	}

	public void setSeriale(long seriale) {
		this.seriale = seriale;
	}

	public String getTitolo() {
		return nome;
	}

	public void setTitolo(String titolo) {
		this.nome = titolo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getQuantit?() {
		return quantit?;
	}

	public void setQuantit?(int quantit?) {
		this.quantit? = quantit?;
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
	
	public String getMacroCategoria() {
		return macroCategoria;
	}

	@Override
	public String toString() {
		return "GraficheBean [categoria=" + categoria + ", nome=" + nome + ", seriale=" + seriale + ", prezzo=" + prezzo
				+ ", quantit?=" + quantit? + ", descrizione=" + descrizione + "]";
	}
	
	
	
}


