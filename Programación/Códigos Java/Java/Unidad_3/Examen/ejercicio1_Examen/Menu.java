package ejercicio1_Examen;

import java.time.LocalDate;
import java.util.Objects;

public class Menu {
	private int id;
	private String nombre;
	private double consumoCalorico;
	private double precio_Venta;
	private double precio_Coste;
	private TipoDieta tipo_Dieta;
	private LocalDate fechaMenu;

	public Menu(int id, String nombre, double consumoCalorico, double precio_Coste,
			TipoDieta tipo_Dieta, LocalDate fechaMenu) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.consumoCalorico = consumoCalorico;
		setPrecio_Coste(precio_Coste);
		setPrecio_Venta(precio_Venta);
		this.tipo_Dieta = tipo_Dieta;
		this.fechaMenu = fechaMenu;
	}

	@Override
	public String toString() {
		return "Menu: " + nombre + ", precio de Venta: " + precio_Venta + ", tipo " + tipo_Dieta + " Fecha: " + fechaMenu;
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected double getConsumoCalorico() {
		return consumoCalorico;
	}

	protected void setConsumoCalorico(double consumoCalorico) {
		this.consumoCalorico = consumoCalorico;
	}

	protected double getPrecio_Venta() {
		return precio_Venta;
	}

	protected void setPrecio_Venta(double precio_Venta) {
		if (this.precio_Venta <= 0) {
			this.precio_Venta = this.precio_Coste + (this.precio_Coste * 30 / 100);
		} else if (this.precio_Venta < (this.precio_Coste * 30 / 100)) {
			this.precio_Venta = this.precio_Coste + (this.precio_Coste * 30 / 100);
		} else {
			this.precio_Venta = precio_Venta;
		}
	}

	protected double getPrecio_Coste() {
		return precio_Coste;
	}

	protected void setPrecio_Coste(double precio_Coste) {
		if (precio_Coste <= 0) {
			System.out.println("Error. El precio de coste de "+ this.nombre + " no puede ser negativo. Por defecto 2 euros");
			this.precio_Coste = 2;
		} else {
			this.precio_Coste = precio_Coste;
		}

	}

	protected TipoDieta getTipo_Dieta() {
		return tipo_Dieta;
	}

	protected void setTipo_Dieta(TipoDieta tipo_Dieta) {
		this.tipo_Dieta = tipo_Dieta;
	}
	

	protected LocalDate getFechaMenu() {
		return fechaMenu;
	}

	protected void setFechaMenu(LocalDate fechaMenu) {
		this.fechaMenu = fechaMenu;
	}

	@Override
	public int hashCode() {
		return Objects.hash(consumoCalorico, fechaMenu, id, nombre, precio_Coste, precio_Venta, tipo_Dieta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		return Double.doubleToLongBits(consumoCalorico) == Double.doubleToLongBits(other.consumoCalorico)
				&& Objects.equals(fechaMenu, other.fechaMenu) && id == other.id && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio_Coste) == Double.doubleToLongBits(other.precio_Coste)
				&& Double.doubleToLongBits(precio_Venta) == Double.doubleToLongBits(other.precio_Venta)
				&& tipo_Dieta == other.tipo_Dieta;
	}

	public void esBajoEnCalorias() {
		if (consumoCalorico < 1000) {
			System.out.println("Es una dieta baja en calorias, posee menos de 1000 kcal");
		} else {
			System.out.println("No es una dieta baja en calorías, posee 1000 kcal o más");
		}
	}
	
	public void contieneCarne() {
		if(tipo_Dieta == TipoDieta.VEGANO || tipo_Dieta == TipoDieta.VEGETARIANO) {
			System.out.println("Este menú no contiene carne.");
		}
		else {
			System.out.println("Este menú SI contiene carne.");
		}
	}
	
	public void calculaPrecioPromocion() {
		if(precio_Venta <= 10) {
			precio_Venta -= 1;
		}
		else {
			precio_Venta = precio_Venta - (precio_Venta * 10 /100);
		}
		
	}

}
