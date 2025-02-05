package boletin3.Torneo;

public class Partida {
    String nombreJuego;
    Participante[] participantes = new Participante[4]; // 4 jugadores
    Participante ganador;

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
}
