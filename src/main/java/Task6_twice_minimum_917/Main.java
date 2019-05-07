package Task6_twice_minimum_917;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] arr = {23, -12, 0, 8.4, -11.7, 2, 2.0, 90.75};
        Arrays.sort(arr);
        System.out.printf("%.2f", arr[0] * 2);
    }
}
