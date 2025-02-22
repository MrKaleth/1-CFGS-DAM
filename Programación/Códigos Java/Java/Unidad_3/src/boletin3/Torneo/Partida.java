package boletin3.Torneo;

public class Partida {
    private String nombreJuego;
    private Participante[] participantes = new Participante[4]; // 4 jugadores
    private Participante ganador;
    
    public String getNombreJuego() {
		return nombreJuego;
	}

	public void setNombreJuego(String nombreJuego) {
		this.nombreJuego = nombreJuego;
	}

	public Participante[] getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Participante[] participantes) {
		this.participantes = participantes;
	}

	public Participante getGanador() {
		return ganador;
	}

	public void setGanador(Participante ganador) {
		this.ganador = ganador;
	}

	public Partida(String nombreJuego, Participante[] participantes) {
        this.nombreJuego = nombreJuego;
        this.participantes = participantes;
    }

    public Participante obtenerJugadorConMayorPuntuacion() {
        Participante mayor = participantes[0];
        for (int i = 1; i < participantes.length; i++) {
            if (participantes[i].obtenPuntucion() > mayor.obtenPuntucion()) {
            	mayor = participantes[i];
            }
        }
        return mayor;
    }

    @Override
    public String toString() {
        return "Juego: " + nombreJuego + ", Ganador: " + ganador;
    }
    
    Participante jugadorGanador() {
    	this.ganador = this.obtenerJugadorConMayorPuntuacion();
    	return ganador;
    	
    }
}
