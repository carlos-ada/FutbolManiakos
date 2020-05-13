package FutbolManiakos;

public class InicioDeSesion {
	
	public String usuario;
	private int contrasena;
	
	public InicioDeSesion() {
	}
	
	public InicioDeSesion(String usuario, int contrasena) {
		super();
		this.usuario = usuario;
		this.contrasena = contrasena;
	}
	
	public void setIniciarLaSesion(String usuario, int contrasena) {
		this.usuario = usuario;
		this.contrasena = contrasena;
	}

}
