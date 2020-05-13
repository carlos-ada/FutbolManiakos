package FutbolManiakos;

public class Portada {
	
	public String TamanoLetra;
	public int TamanoNumeros;
	
	public Portada() {
	}
	
	public Portada(String TamanoLetra, int TamanoNumeros) {
		super();
		this.TamanoLetra = TamanoLetra;
		this.TamanoNumeros = TamanoNumeros;
	}
	
	public String getTamnoLetra() {
		return TamanoLetra;
	}
	
	public void setMoverPorPagina(String TamanoLetra, int TamanoNumeros) {
		this.TamanoLetra = TamanoLetra;
		this.TamanoNumeros = TamanoNumeros;
	}

}
