package miembros.Modelo;

public class MiembroEstandar extends MiembroBase {
	static int maxAmigos;

	public MiembroEstandar(int id, String email, String nombre, MiembroBase[] amigos) {
		super(id, email, nombre, amigos);
	}

	protected static int getMaxAmigos() {
		return maxAmigos;
	}

	protected static void setMaxAmigos(int maxAmigos) {
		MiembroPremium.maxAmigos = 2;
	}

	@Override
	String getTipoUsuario() {
		String mensaje = "Estandar";
		return mensaje;
	}

	@Override
	public boolean esAmigo(MiembroBase a, MiembroBase []  amigos) {
		boolean amigo = false;
		for (int i = 0; i < amigos.length; i++) {
			if (amigos[i] == a) {
				amigo = true;
			} else {
				amigo = false;
			}
		}
		return amigo;
	}

	@Override
	public void addAmigo(MiembroBase a, MiembroBase []  amigos) throws GuzmanitosException {
		int contador = 0;
		for (int i = 0; i < amigos.length; i++) {
			if (amigos[i] == a) {
				throw new GuzmanitosException("el miembro ya esta en la lista de amigos");

			} else {
				contador++;
			}

			if (contador == amigos.length) {
				System.out.println("Añadiendo miembro a amigos");
			}
			for (int j = 0; j < amigos.length; j++) {
				if (amigos[j] != null && amigos[j - 1] != a) {
					amigos[j] = a;
				}
			}
		}

	}
}
