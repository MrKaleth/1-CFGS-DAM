package ejerciciosCodificacion.ListasLambda;

import java.util.List;

public class Exercise {
    int res = 0;

    public int eliminarNegativos(List<Integer> numeros) {
        numeros.removeIf(n -> n < 0); // Elimina los negativos
        res = 0;
        numeros.forEach(n -> res += n); // Suma los positivos restantes
        return res;
    }
}

