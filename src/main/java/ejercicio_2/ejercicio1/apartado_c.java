package ejercicio_2.ejercicio1;

public class apartado_c {
    private int[] data;

    public apartado_c(int[] data) {
        this.data = data;
    }

    public int binarySearch(int target) {
        int left = 0;
        int right = data.length - 1;
        int steps = 0;
        while (left <= right) {
            steps++;
            int mid = left + (right - left) / 2;
            if (data[mid] == target) {
                System.out.println("Number of steps: " + steps);
                return mid;
            } else if (data[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Number of steps: " + steps);
        return -1;
    }
}