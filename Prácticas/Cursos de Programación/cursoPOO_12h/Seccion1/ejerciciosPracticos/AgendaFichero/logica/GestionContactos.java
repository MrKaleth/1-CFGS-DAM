package ejerciciosPracticos.AgendaFichero.logica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import ejerciciosPracticos.Agenda.beans.Contacto;

public class GestionContactos {
	String ruta = "c:\\temporal\\contactos.txt";

	public boolean agregar(String nombre, int edad, String email) {
		// si no existe se añade
		if (buscar(email) == null) {
			Contacto c = new Contacto(nombre, email, edad);
			try (FileOutputStream fos = new FileOutputStream(ruta, true); PrintStream salida = new PrintStream(fos)) {
				salida.println(nombre + "|" + edad + "|" + email);
			} catch (IOException ex) {
				ex.printStackTrace();
			}
			return true;
		} else {
			return false;
		}
	}

	public Contacto buscar(String email) {
		Contacto c = null;
		try (BufferedReader bf = new BufferedReader(new FileReader(ruta))) {
			String s;
			while ((s = bf.readLine()) != null) {
				String[] datos = s.split("[|]");
				if (datos[2].equals(email)) {
					c = new Contacto(datos[0], datos[2], Integer.parseInt(datos[1]));
					break;
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return c;
	}

	public boolean eliminar(String email) {
		boolean res = false;
		Contacto[] todos = recuperarContactos();
		try (PrintStream out = new PrintStream(ruta)) {
			for (Contacto c : todos) {
				if (!email.equals(c.getEmail())) {
					out.println(c.getNombre() + "|" + c.getEdad() + "|" + c.getEmail());
				} else {
					res = true;
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		return res;
	}

	public Contacto[] recuperarContactos() {
		ArrayList<Contacto> existentes = new ArrayList<>();
		Contacto c = null;
		try (BufferedReader bf = new BufferedReader(new FileReader(ruta))) {
			String s;
			while ((s = bf.readLine()) != null) {
				String[] datos = s.split("[|]");
				c = new Contacto(datos[0], datos[2], Integer.parseInt(datos[1]));
				existentes.add(c);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return existentes.toArray(new Contacto[0]);

	}
}
