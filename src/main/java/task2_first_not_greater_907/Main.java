package task2_first_not_greater_907;

public class Main {
    public static void main(String[] args) {
        double[] arr = {22.3, 23, 1, -2.5, 0, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= -5) {
                System.out.println(i + " " + arr[i]);
                break;
        } if (i == (arr.length -1)) {
                System.out.println("Not found");
            }
            }
        }
    }

