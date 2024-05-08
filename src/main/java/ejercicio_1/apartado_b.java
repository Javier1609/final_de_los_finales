package ejercicio_1;

public class apartado_b {
    public int[][] createMatrix(int N) {
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = i * j; // Llenar la matriz con algún valor, en este caso i*j
            }
        }
        return matrix;
    }
}