package ejerciciosCodificacion;

import java.time.*;
import java.util.*;

class Pedido {
	private String producto;
	private LocalDate fechaPedido;
	private double precio;

	public Pedido(String producto, LocalDate fechaPedido, double precio) {
		this.producto = producto;
		this.fechaPedido = fechaPedido;
		this.precio = precio;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public LocalDate getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(LocalDate fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}

public class GestorPedidos {
	ArrayList<Pedido> pedidos = new ArrayList<>();

	public void guardarPedido(String producto, LocalDate fechaPedido, double precio) {
		Pedido nuevoPedido = new Pedido(producto, fechaPedido, precio);
		pedidos.add(nuevoPedido);
	}

	public Pedido pedidoMasReciente() {
		if (pedidos.isEmpty()) {
			return null;
		}
		Pedido masReciente = pedidos.get(0);
		for (int i = 1; i < pedidos.size(); i++) {
			if (pedidos.get(i).getFechaPedido().isAfter(masReciente.getFechaPedido())) {
				masReciente = pedidos.get(i);
			}
		}
		return masReciente;
	}

	public ArrayList<Pedido> pedidosPrecioMax(double precio) {
		ArrayList<Pedido> resultado = new ArrayList<>();
		for (int i = 0; i < pedidos.size(); i++) {
			if (pedidos.get(i).getPrecio() <= precio) {
				resultado.add(pedidos.get(i));
			}
		}
		return resultado;
	}
}
