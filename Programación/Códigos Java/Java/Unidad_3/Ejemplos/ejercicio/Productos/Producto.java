package ejercicio.Productos;

public class Producto {
	String nombre;
	int numUnidades;
	float precioVenta;

	boolean hayQpedirStock() {
		boolean hayQpedir = false;

		if (numUnidades < 3) {
			hayQpedir = true;
		} else {
			hayQpedir = false;
		}

		return hayQpedir;
	}
	int actualizaStock() {
		numUnidades = 10;
		return numUnidades;
	}
		String convierteEnCadena() {
			String cadena = "Producto: " + nombre + ". Stock: " + numUnidades + ". Precio de Venta: " + precioVenta;
			return cadena;
	}
}
