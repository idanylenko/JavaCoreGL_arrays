package Task9_shift_to_right_922;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr_2 = new int[arr.length];

        for (int i = 0; i < arr.length - 1; i++) {

            arr_2[i+1] = arr[i];
        }

        arr_2[0] = arr[arr.length - 1];

        System.out.println(Arrays.toString(arr_2));
    }
}
