package ejerciciosCodificacion.InterfacesLambda;

interface Operations {
    int process(int a, int b);
}

public class Exercise {

    public Operations testingA() {
        // Devuelve el producto de a y b
        return (a, b) -> a * b;
    }

    public Operations testingB() {
        // Devuelve la suma de todos los números enteros comprendidos entre a y b (inclusive)
        return (a, b) -> {
            int min = Math.min(a, b);
            int max = Math.max(a, b);
            int suma = 0;
            for (int i = min; i <= max; i++) {
                suma += i;
            }
            return suma;
        };
    }
}
