package HW.HWtask_1;
// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение n: ");
        int n = sc.nextInt();

        int triangleNum = (n * (n + 1)) / 2;
        System.out.println("Треугольное число " + n + " = " + triangleNum);

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Факториал " + n + " = " + fact);
    }
}