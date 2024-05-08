package ejercicio_2.ejercicio_4;
//El método de ordenación por inserción es un algoritmo simple que funciona de la misma manera que ordenarías las cartas en tu mano en un juego de cartas.
// El algoritmo divide la lista en dos partes: la parte ordenada y la parte desordenada. Inicialmente, la parte ordenada contiene un solo elemento, por lo que por definición está ordenada. Luego, en cada iteración, el algoritmo toma el primer elemento de la parte desordenada y lo 'inserta' en el lugar correcto en la parte ordenada.
public class apartado_a {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;


            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] data = {50, 20, 84, 13, 22, 16, 89, 85};
        sort(data);
        for (int i : data) {
            System.out.print(i + " ");
        }
    }
}