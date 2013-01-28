package objetos;

public class Empleado {
	private String strCodigo;
	private String strNombre;
	private String strApellido;
	private String strDireccion;
	private String strTelefono;
	private int intEdad;
	
	
	
	public Empleado(String strCodigo, String strNombre, String strApellido,
			String strDireccion, String strTelefono, int intEdad) {
		super();
		this.strCodigo = strCodigo;
		this.strNombre = strNombre;
		this.strApellido = strApellido;
		this.strDireccion = strDireccion;
		this.strTelefono = strTelefono;
		this.intEdad = intEdad;
	}
	public String getStrCodigo() {
		return strCodigo;
	}
	public void setStrCodigo(String strCodigo) {
		this.strCodigo = strCodigo;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	public String getStrApellido() {
		return strApellido;
	}
	public void setStrApellido(String strApellido) {
		this.strApellido = strApellido;
	}
	public String getStrDireccion() {
		return strDireccion;
	}
	public void setStrDireccion(String strDireccion) {
		this.strDireccion = strDireccion;
	}
	public String getStrTelefono() {
		return strTelefono;
	}
	public void setStrTelefono(String strTelefono) {
		this.strTelefono = strTelefono;
	}
	public int getIntEdad() {
		return intEdad;
	}
	public void setIntEdad(int intEdad) {
		this.intEdad = intEdad;
	}
	 
	 
}
