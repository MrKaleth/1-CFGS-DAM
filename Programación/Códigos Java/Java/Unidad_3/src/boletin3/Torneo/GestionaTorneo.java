package boletin3.Torneo;

public class GestionaTorneo {
    public static void main(String[] args) {
        Participante p1 = new Participante("jose123", "José", 25, 150);
        Participante p2 = new Participante("ana456", "Ana", 28, 200);
        Participante p3 = new Participante("miguel789", "Miguel", 30, 180);
        Participante p4 = new Participante("lucia101", "Lucía", 22, 210);

        Participante[] jugadores = { p1, p2, p3, p4 };

        Partida catán = new Partida("Catán", jugadores);

        catán.jugadorGanador();
   
        System.out.println("Resultados del Torneo:");
        System.out.println(catán);
        
    }
}