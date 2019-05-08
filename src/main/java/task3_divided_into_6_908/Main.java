package task3_divided_into_6_908;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7, 8, 12, 18};
        int sum = 0;
        int q = 0;

        for (int i : arr) {
            if (i >= 0 && i % 6 == 0) {
                sum += i;
                ++q;
            }
        }
        System.out.println("Sum = " + sum);
        System.out.println("Count = " + q);
    }
}
