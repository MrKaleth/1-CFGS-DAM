package ejemploDuplicadosEnLista;

import java.util.LinkedList;
import java.util.List;

public class ListaProvincias {
	private List<Provincia> listaProvincia = new LinkedList<Provincia>();

	protected List<Provincia> getListaProvincia() {
		return listaProvincia;
	}

	protected void setListaProvincia(List<Provincia> listaProvincia) {
		this.listaProvincia = listaProvincia;
	}

	public boolean addSinRepetido(Provincia p) throws ProvinciaRepetidaException {
		boolean agregado = false;
		if (listaProvincia.contains(p)) {
			throw new ProvinciaRepetidaException("Provincia repetida");
		} else {
			agregado = listaProvincia.add(p);
		}
		return agregado;
	}

	public Provincia setSinRepetidos(int index, Provincia nuevaProvincia) throws ProvinciaRepetidaException {
		Provincia actual = listaProvincia.get(index);
		if (listaProvincia.contains(nuevaProvincia)) {
			throw new ProvinciaRepetidaException("Provincia Repetida");
		} else {
			actual = listaProvincia.set(index, nuevaProvincia);
		}
		return actual;
	}
	
	public static void main(String[] args) {
		ListaProvincias listaProvincia = new ListaProvincias();
		
		try {
			listaProvincia.addSinRepetido(new Provincia("Sevilla", 0));
		}
		catch (ProvinciaRepetidaException e) {
			e.getMessage();
		}
	}
}
