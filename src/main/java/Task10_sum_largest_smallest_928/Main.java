package Task10_sum_largest_smallest_928;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 6, 5, 5, 1, 0, -3};
        Arrays.sort(arr);
        int sum = arr[0] + arr[arr.length - 1];
        System.out.println(sum);
    }

}
