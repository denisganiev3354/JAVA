package lesson_3;
import java.net.Socket;
import java.net.SocketPermission;
import java.util.ArrayList;
import java.util.List;

public class hwProgram3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        printOriginalList(numbers);

        removeEvenNumbers(numbers);

        printUpdatedList(numbers);

        int minValue = findMinValue(numbers);
        System.out.printf("Минимальное значение: %d\n", minValue);

        int maxValue = findMaxValue(numbers);
        System.out.printf("Максимальное значение: %d\n", maxValue);

        double averageValue = calculateAverage(numbers);
        System.out.printf("Среднее значение: %.2f\n", averageValue);
    }

    public static void removeEvenNumbers(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }
    }

    public static void printOriginalList(List<Integer> numbers) {
        System.out.println("Исходный список:");
        System.out.printf("%s\n", numbers);
        }
    

    public static void printUpdatedList(List<Integer> numbers) {
        System.out.printf("Список после удаления четных чисел: %s\n", numbers);
        }
    

    public static int findMinValue(List<Integer> numbers) {
        int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        return min;
    }

    public static int findMaxValue(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static double calculateAverage(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }
}
