package ejercicio_3;

//a)El código no compilará debido a que está en un bucle infinito. La función recursive nunca alcanzará el caso base porque b nunca llegará a ser 0. Cada llamada a recursive aumenta b en 1, pero nunca disminuye b hacia 0. Por lo tanto, el programa continuará haciendo llamadas recursivas sin fin, lo que eventualmente resultará en un desbordamiento de pila (StackOverflowError).
// Para corregirlo, podemos modificar la lógica de la función recursive para que b se acerque al caso base. Podemos cambiar b para que disminuya en lugar de aumentar en cada llamada recursiva. Aquí está el código corregido:
//b) Este programa está calculando la potencia de un número usando recursividad. La función recursive toma dos números a y b, y devuelve a elevado a la b. Si b es 0, devuelve 1 (caso base). Si a es 0, devuelve 0.
// Si b es negativo, calcula la potencia pero con el exponente positivo (esto es para asegurar que el resultado sea un número entero). Y en caso contrario, multiplica a por recursive(a, b - 1), lo que básicamente disminuye b en cada llamada recursiva hasta llegar al caso base. Esta es una forma de recursividad descendente, ya que la variable b se reduce en cada llamada hasta alcanzar el caso base
//una solucion sería:
public class apartado_a {
    public static void main(String[] args) {
        int a = recursive(1, -2);
        System.out.println(a);
    }

    public static int recursive(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (a == 0) {
            return 0;
        } else if (b < 0) {
            return 1 / recursive(a, -b);
        } else {
            return a * recursive(a, b - 1);
        }
    }
}
