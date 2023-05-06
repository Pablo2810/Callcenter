package ar.edu.unlam.pb2;

public class Contacto {
	private Integer id;
	private String nombreCompleto;
	private Integer celular;
	private String email;
	private String direccion;
	private Integer codPostal;
	private String localidad;
	private Provincia provincia;
	private Boolean esCliente;
	private Boolean llamarNuevamente;
	
	public Contacto(Integer id, String nombreCompleto, Integer celular, String email, String direccion, Integer codPostal,
					String localidad, Provincia provincia) {
		this.id = id;
		this.nombreCompleto = nombreCompleto;
		this.celular = celular;
		this.email = email;
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.localidad = localidad;
		this.provincia = provincia;
		this.esCliente = false;
		this.llamarNuevamente = true;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public Integer getCelular() {
		return celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(Integer codPostal) {
		this.codPostal = codPostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public Boolean getEsCliente() {
		return esCliente;
	}

	public void setEsCliente(Boolean esCliente) {
		this.esCliente = esCliente;
	}

	public Boolean getLlamarNuevamente() {
		return llamarNuevamente;
	}

	public void setLlamarNuevamente(Boolean llamarNuevamente) {
		this.llamarNuevamente = llamarNuevamente;
	}
	
}
