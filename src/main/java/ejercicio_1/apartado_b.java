package ejercicio_1;

public class apartado_b {
    private int N;
    private int[][] matrix;

    public apartado_b(int N) {
        this.N = N;
        this.matrix = createMatrix();
    }

    private int[][] createMatrix() {
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = i * j; // Llenar la matriz con algún valor, en este caso i*j
            }
        }
        return matrix;
    }

    public int sumMatrix() {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}