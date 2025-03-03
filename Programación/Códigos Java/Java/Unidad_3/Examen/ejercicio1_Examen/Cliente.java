package ejercicio1_Examen;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente {
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	private TipoDieta dietaAsignada;
	private LocalDate fechaInscripcion;
	private boolean vipONo;
	private Menu menu;

	public Cliente(String dni, String nombre, String apellidos, int edad, TipoDieta dietaAsignada,
			LocalDate fechaInscripcion, boolean vipONo, Menu menu) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dietaAsignada = dietaAsignada;
		this.fechaInscripcion = fechaInscripcion;
		this.vipONo = vipONo;
		this.menu = menu;
	}

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellidos() {
		return apellidos;
	}

	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		if (edad <= 0) {
			System.out.println(
					"Error. La edad del cliente " + this.nombre + " no puede ser 0 o inferior. Por defecto 20.");
			this.edad = 20;
		} else {
			this.edad = edad;
		}
	}

	protected TipoDieta getDietaAsignada() {
		return dietaAsignada;
	}

	protected void setDietaAsignada(TipoDieta dietaAsignada) {
		this.dietaAsignada = dietaAsignada;
	}

	protected LocalDate getFechaInscripcion() {
		return fechaInscripcion;
	}

	protected void setFechaInscripcion(LocalDate fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}

	protected boolean getVipONo() {
		return vipONo;
	}

	protected void setVipONo(boolean vipONo) {
		this.vipONo = vipONo;
	}

	protected Menu getMenu() {
		return menu;
	}

	protected void setMenu(Menu menu) {
		this.menu = menu;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(dni, other.dni);
	}

	private boolean hayQueHAcerPromocion() {
		boolean promocion = false;
		if (this.vipONo = true) {
			promocion = true;
		} else if (edad >= 65) {
			promocion = true;
		} else {
			promocion = false;
		}
		return promocion;
	}

	public void calculaPrecioPromocion() {
		if (hayQueHAcerPromocion()) {
			this.menu.calculaPrecioPromocion();
		}

	}

	@Override
	public String toString() {
		return "Cliente " + dni + ", hayQueHAcerPromocion(): " + hayQueHAcerPromocion();
	}
}
