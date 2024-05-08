package ejercicio_1;

public class apartado_a {
    private int[] data;

    public apartado_a(int[] data) {
        this.data = data;
    }

    public int sumArray() {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }

    public double averageArray() {
        return (double) sumArray() / data.length;
    }
}