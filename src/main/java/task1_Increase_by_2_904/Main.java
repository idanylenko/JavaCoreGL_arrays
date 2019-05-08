package task1_Increase_by_2_904;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, -1, 9, -4, 0};

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0) {
                arr[i] = arr[i] + 2;
        }

        }
        System.out.println(Arrays.toString(arr));
    }
}
