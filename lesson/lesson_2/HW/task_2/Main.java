import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 6, 3};
        File logFile = new File("sort_log.txt");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(logFile));

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;

                        writer.write(Arrays.toString(arr) + "\n");
                    }
                }
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}