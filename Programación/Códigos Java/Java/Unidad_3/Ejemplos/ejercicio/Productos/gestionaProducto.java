package ejercicio.Productos;

public class gestionaProducto {

	public static void main(String[] args) {
		Producto pan = new Producto();
		pan.nombre = "Pan";
		pan.numUnidades = 12;
		pan.precioVenta = 1;

		Producto leche = new Producto();
		leche.nombre = "Leche";
		leche.numUnidades = 2;
		leche.precioVenta = 1;

		Producto huevos = new Producto();
		huevos.nombre = "Huevos";
		huevos.numUnidades = 5;
		huevos.precioVenta = 2;

		Producto arroz = new Producto();
		arroz.nombre = "Arroz";
		arroz.numUnidades = 1;
		arroz.precioVenta = 0;

		Producto azucar = new Producto();
		azucar.nombre = "Azúcar";
		azucar.numUnidades = 8;
		azucar.precioVenta = 1;

		Producto cafe = new Producto();
		cafe.nombre = "Café";
		cafe.numUnidades = 0;
		cafe.precioVenta = 3;

		Producto aceite = new Producto();
		aceite.nombre = "Aceite";
		aceite.numUnidades = 4;
		aceite.precioVenta = 5;

		Producto sal = new Producto();
		sal.nombre = "Sal";
		sal.numUnidades = 7;
		sal.precioVenta = 0;

		Producto[] productos = { pan, leche, huevos, arroz, azucar, cafe, aceite, sal };

		for (Producto p : productos) {
			System.out.println(p.convierteEnCadena());
			if (p.hayQpedirStock()) {
				System.out.println("Se necesita pedir más stock de " + p.nombre);
				p.actualizaStock();
				System.out.println("Stock actualizado: " + p.numUnidades + " unidades.");
			}
			System.out.println();
		}
	}
}