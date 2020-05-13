package FutbolManiakos;

public class Registrarse {
	
	public String NombreUsuario;
	private String correo;
	public String usuario;
	private int contrasena;
	private int telefono;
	private int fechaNacimiento;
	
	public Registrarse() {
	}
	
	public Registrarse(String NombreUsuario, String correo, String usuario, int contrasena, int telefono, int fechaNacimiento) {
		this.NombreUsuario = NombreUsuario;
		this.correo = correo;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public void TerminarRegistro(String NombreUsuario, String correo, String usuario, int contrasena, int telefono, int fechaNacimiento) {
	}

}
