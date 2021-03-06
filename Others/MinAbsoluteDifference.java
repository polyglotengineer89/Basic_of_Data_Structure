package Others;

import java.io.*;
import java.util.*;

public class MinAbsoluteDifference {

    // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifferenceCalculte(int[] arr) {
        int min_absolute_difference = Integer.MAX_VALUE;// just set to max so its True

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            int current_absolute_minimum = Math.abs(arr[i] - arr[i + 1]);
            min_absolute_difference = Math.min(min_absolute_difference, current_absolute_minimum);
        }

        return min_absolute_difference;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = minimumAbsoluteDifferenceCalculte(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
