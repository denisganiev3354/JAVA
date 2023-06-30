package HW.HWtask_3;
// Реализовать простой калькулятор
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");

        int choice = sc.nextInt();

        System.out.print("Введите первое число: ");
        double num1 = sc.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = sc.nextDouble();

        switch (choice) {
            case 1: {
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            }
            case 2: {
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            }
            case 3: {
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            }
            case 4: {
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль!");
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                }
                break;
            }
            default: {
                System.out.println("Ошибка: неправильный выбор операции!");
            }
        }
    }
}