package ar.edu.unlam.pb2;
import java.util.ArrayList;
import java.util.HashSet;

public class Sistema {
	private String nombreCallcenter;
	private ArrayList<Contacto> contactos;
	private ArrayList<Operador> operadores;
	private ArrayList<Llamada> llamadas;
	
	public Sistema(String nombreCallcenter) {
		this.nombreCallcenter = nombreCallcenter;
		this.contactos = this.crearListaDeContactos();
		this.operadores = new ArrayList<>();
		this.llamadas = new ArrayList<>();
	}

	private ArrayList<Contacto> crearListaDeContactos() {
		ArrayList<Contacto> lista = new ArrayList<>();
		lista.add(new Contacto(1, "A", 1, "a@gmail.com", "A 1", 1, "A", Provincia.BUENOS_AIRES));
		lista.add(new Contacto(2, "B", 2, "b@gmail.com", "B 2", 2, "C", Provincia.CHACO));
		lista.add(new Contacto(3, "C", 3, "c@gmail.com", "C 3", 3, "C", Provincia.CORRIENTES));
		lista.add(new Contacto(4, "D", 4, "d@gmail.com", "D 4", 4, "D", Provincia.ENTRE_RIOS));
		lista.add(new Contacto(5, "E", 5, "e@gmail.com", "E 5", 5, "E", Provincia.JUJUY));
		lista.add(new Contacto(6, "F", 6, "f@gmail.com", "F 6", 6, "F", Provincia.MENDOZA));
		
		return lista;
	}

	public String getNombreCallcenter() {
		return nombreCallcenter;
	}

	public void setNombreCallcenter(String nombreCallcenter) {
		this.nombreCallcenter = nombreCallcenter;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public ArrayList<Operador> getOperadores() {
		return operadores;
	}

	public void setOperadores(ArrayList<Operador> operadores) {
		this.operadores = operadores;
	}

	public ArrayList<Llamada> getLlamadas() {
		return llamadas;
	}

	public void setLlamadas(ArrayList<Llamada> llamadas) {
		this.llamadas = llamadas;
	}

	public void agregarOperador(Operador operador) {
		this.operadores.add(operador);
	}

	public Integer cantidadOperadores() {
		return this.operadores.size();
	}
}
