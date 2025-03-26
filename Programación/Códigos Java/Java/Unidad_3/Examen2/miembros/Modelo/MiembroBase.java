package miembros.Modelo;

import java.util.Arrays;
import java.util.Objects;

public abstract class MiembroBase {
	private int id;
	private String email;
	private String nombre;
	protected MiembroBase[] amigos;
	private int contadorAmigos;
	static int contadorIdentificador;

	public MiembroBase(int id, String email, String nombre, MiembroBase[] amigos) {
		super();
		this.id = id;
		this.email = email;
		this.nombre = nombre;
		this.amigos = amigos;
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected MiembroBase[] getAmigos() {
		return amigos;
	}

	protected void setAmigos(MiembroBase[] amigos) {
		this.amigos = amigos;
	}

	protected int getContadorAmigos() {
		return contadorAmigos;
	}

	protected void setContadorAmigos(int contadorAmigos) {
		this.contadorAmigos = contadorAmigos;
	}

	protected static int getContadorIdentificador() {
		return contadorIdentificador;
	}

	protected static void setContadorIdentificador(int contadorIdentificador) {
		MiembroBase.contadorIdentificador = contadorIdentificador;
	}

	@Override
	public String toString() {
		return "MiembroBase [id=" + id + ", email=" + email + ", nombre=" + nombre + ", amigos="
				+ Arrays.toString(amigos) + ", contadorAmigos=" + contadorAmigos + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MiembroBase other = (MiembroBase) obj;
		return Objects.equals(email, other.email) && id == other.id;
	}

	abstract String getTipoUsuario();
	
	abstract boolean esAmigo(MiembroBase a, MiembroBase []  amigos);
	abstract void addAmigo(MiembroBase a, MiembroBase []  amigos) throws GuzmanitosException;

}
