package ejercicio_4;

public class ejercicio_4 {
    public static void main(String[] args) {
        int number = 102;
        int result = sumOfDigits(number);
        System.out.println("The sum of digits of " + number + " is " + result);
    }

    public static int sumOfDigits(int num) {
        if (num < 10) {
            return num;
        } else {
            return num % 10 + sumOfDigits(num / 10);
        }
    }
}
//La recursividad es un concepto en programación donde una función se llama a sí misma en su definición.
// Hay dos tipos principales de recursividad: la recursividad de cabeza y la recursividad de cola.
// En la recursividad de cabeza, la llamada recursiva no es la última operación en la función, mientras que en la recursividad de cola, la llamada recursiva es la última operación.
// La recursividad de cola es más eficiente ya que no necesita mantener el rastro de las operaciones anteriores, lo que reduce el uso de la memoria.
// La complejidad computacional se refiere a la eficiencia de un algoritmo en términos de tiempo de ejecución y espacio de memoria utilizado.
// Se mide en términos de la cantidad de datos de entrada (n). Por ejemplo, un algoritmo con una complejidad de tiempo de O(n) aumentará linealmente con el tamaño de los datos de entrada, mientras que un algoritmo con una complejidad de tiempo de O(n^2) aumentará cuadráticamente.
// En el caso del algoritmo que proporcioné para calcular la suma de los dígitos de un número, la complejidad de tiempo es O(n), donde n es el número de dígitos del número. Esto se debe a que cada llamada recursiva procesa un dígito del número.
// La complejidad del espacio también es O(n) porque cada llamada recursiva se añade a la pila de llamadas, que es una parte de la memoria.