package ejercicio_2.ejercicio_5;

public class apartado_a {
    public static void main(String[] args) {
        int n = 0;
        while (1024 * n >= 16 * Math.pow(n, 3)) {
            n++;
        }
        System.out.println("A es más eficiente que B cuando n es mayor o igual a " + n);
    }
}