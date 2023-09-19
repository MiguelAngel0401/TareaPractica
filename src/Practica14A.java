public class Practica14A {
    public static void main(String[] args) {
        int y = 0;
        int z = 0;

        int resultado = sumatoria(1, 10);
        System.out.println("La sumatoria del 1 al 10 es: " + resultado);
    }

    public static int sumatoria(int inicio, int fin) {
        if (inicio > fin) {
            return 0;
        } else {
            int cuadrado = inicio * inicio;
            return cuadrado + sumatoria(inicio + 1, fin);
        }
    }
}