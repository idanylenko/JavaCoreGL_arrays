package Task7_number_by_3_919;

public class Main {
    public static void main(String[] args) {
        double[] arr = {23, -12, 0, 8.4, -11.7, 2, 2.0, 90.75, 5, -3};
        int count = 0;
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && i % 3 == 0 && i != 0) {
                count++;
                sum += arr[i];
            }
        }
        System.out.println(count + " " + sum);
    }
}
