package ejemplo.PersonaEquipo;

import java.util.Arrays;

public class Equipo {
	String nombreEquipo;
	int[] puntuaciones;
	Persona[] personas;

	public Equipo(String nombreEquipo, int[] puntuaciones, Persona[] personas) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.puntuaciones = puntuaciones;
		this.personas = personas;
	}

	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", puntuaciones=" + puntuaciones + ", personas="
				+ Arrays.toString(personas) + "]";
	}

	float mediaEdad() {
	    float mediaEdad = 0f;
	    Persona[] tablaPersona = this.personas;
	    
	    for (Persona p : tablaPersona) {
	        mediaEdad = mediaEdad + p.edad;  
	    }
	    
	    mediaEdad = mediaEdad / tablaPersona.length;  
	    return mediaEdad;
	}
}