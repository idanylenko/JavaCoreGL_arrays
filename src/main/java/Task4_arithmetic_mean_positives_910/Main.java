package Task4_arithmetic_mean_positives_910;

public class Main {
    public static void main(String[] args) {
        double[] arr = {23, -12, 0, 8.4, -11.7, 2, 2.0, 90.75};
        int count = 0;
        double sum = 0;

        for (double v : arr) {
            if (v > 0) {
                count++;
                sum += v;
            }
        }
        if (count == 0) {
            System.out.println("Not found");
        } else {
            System.out.printf("%.2f", sum / count);

        }
    }
}
