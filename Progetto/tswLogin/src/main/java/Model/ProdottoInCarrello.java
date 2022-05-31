package Model;

public class ProdottoInCarrello {
	private Articolo prodotto;
	private int quantit�;
	
	public ProdottoInCarrello(Articolo prodotto, int quantit�) {
		super();
		this.prodotto = prodotto;
		this.quantit� = quantit�;
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
	@Override
	public String toString() {
		return "ProdottoInCarrello [prodotto=" + prodotto + ", quantit�=" + quantit� + "]";
	}
	
	
	
}
