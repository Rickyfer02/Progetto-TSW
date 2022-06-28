package Model;

public class ProdottoInCarrello {
	private Articolo prodotto;
	private int quantit�;
	private double prezzo;
	
	public ProdottoInCarrello(Articolo prodotto, int quantit�, double prezzo) {
		super();
		this.prodotto = prodotto;
		this.quantit� = quantit�;
		this.prezzo = prezzo;
	}
	
	public ProdottoInCarrello() {
	}
	
	public Articolo getProdotto() {
		return prodotto;
	}
	
	public void setProdotto(Articolo prodotto) {
		this.prodotto = prodotto;
	}
	
	public int getQuantit�() {
		return quantit�;
	}
	
	public void setQuantit�(int quantit�) {
		this.quantit� = quantit�;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString() {
		return "ProdottoInCarrello [prodotto=" + prodotto + ", quantit�=" + quantit� + "]";
	}
	
	
	
}
