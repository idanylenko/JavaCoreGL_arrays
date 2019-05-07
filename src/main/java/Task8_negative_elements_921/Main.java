package Task8_negative_elements_921;

public class Main {
    public static void main(String[] args) {
        double[] arr = {23, -12, 0, 8.4, -11.7, 2, 2.0, 90.75, 5, -3};
        double sum = 0;
        int count = 0;

        for (double v : arr) {
            if (v < 0) {
                sum += v;
                count++;
            }
        }
        System.out.println(count + " " + sum);
    }
}
