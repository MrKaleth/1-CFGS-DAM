package boletin3.Torneo;

public class Participante {
	private String nickname;
	private String nombre;
	private int edad;
	private int puntuacion;

	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public Participante(String nickname, String nombre, int edad, int puntuacion) {
		super();
		this.nickname = nickname;
		this.nombre = nombre;
		this.edad = edad;
		this.puntuacion = puntuacion;
	}

	@Override
	public String toString() {
		return "Participante [nickname=" + nickname + ", nombre=" + nombre + ", edad=" + edad + ", puntuacion="
				+ puntuacion + "]";
	}

	public int obtenPuntucion() {
		return puntuacion;
	}

}
