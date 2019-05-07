package Task5_maximum_of_absolute_914;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] arr = {23, -12, 0, 8.4, -11.7, 2, 2.0, 90.75};
        double[] arr_2 = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr_2[i] = Math.abs(arr[i]);
        }
        Arrays.sort(arr_2);
        System.out.println(arr_2[arr_2.length - 1]);
        System.out.printf("%.2f", arr_2[arr_2.length - 1]);
    }
}
