package lesson_1.HW.HWtask_2;
public class Main {
    public static void main(String[] args) {
        boolean[] primes = new boolean[1001];
        for (int i = 2; i <= 1000; i++) {
            primes[i] = true;
        }

        for (int i = 2; i * i <= 1000; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= 1000; j += i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 2; i <= 1000; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}


// Вывести все простые числа от 1 до 1000
