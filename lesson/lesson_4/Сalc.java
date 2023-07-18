package lesson_4;

import java.util.Scanner;

public class Сalc  {

    static Scanner scanner = new Scanner(System.in);
    static double result = 0.0; // инициализируем переменную для хранения результата
    static boolean exit = true;
    static boolean undo = false;

    public static void main(String[] args) {
        Сalc calculator = new Сalc(); // создаем экземпляр класса Calculator_2
        calculator.start();
    }

    public void start() {
        while (exit) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Отменить последнюю операцию");
            System.out.println("6. Выход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    add();
                    break;

                case 2:
                    subtract();
                    break;

                case 3:
                    multiply();
                    break;

                case 4:
                    division();
                    break;

                case 5:
                    undo();
                    break;

                case 6:
                    exit = false;
                    break;

                default:
                    System.out.println("Ошибка: неправильный выбор операции!");

            }
        }
    }

    static void add() {
        double num1;
        double num2;

        if (!undo) { // если предыдущая операция не была отменена, то запрашиваем новые числа
            System.out.print("Введите первое число: ");
            num1 = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            num2 = scanner.nextDouble();
            result = num1 + num2; // сохраняем результат сложения
        } else { // если предыдущая операция была отменена, используем уже сохраненное значение результата и запрашиваем только второе число
            System.out.print("Введите второе число: ");
            num2 = scanner.nextDouble();
            result += num2; // добавляем второе число к сохраненному результату
            undo = false; // сбрасываем флаг отмены
        }

        System.out.printf("Результат: %.2f\n", result);
        System.out.println();
    }

    static void subtract() {
        double num1;
        double num2;

        if (!undo) { // если предыдущая операция не была отменена, то запрашиваем новые числа
            System.out.print("Введите первое число: ");
            num1 = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            num2 = scanner.nextDouble();
            result = num1 - num2; // сохраняем результат вычитания
        } else { // если предыдущая операция была отменена, используем уже сохраненное значение результата и запрашиваем только второе число
            System.out.print("Введите второе число: ");
            num2 = scanner.nextDouble();
            result -= num2; // вычитаем второе число из сохраненного результата
            undo = false; // сбрасываем флаг отмены
        }

        System.out.printf("Результат: %.2f\n", result);
        System.out.println();
    }

    static void multiply() {
        double num1;
        double num2;

        if (!undo) { // если предыдущая операция не была отменена, то запрашиваем новые числа
            System.out.print("Введите первое число: ");
            num1 = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            num2 = scanner.nextDouble();
            result = num1 * num2; // сохраняем результат умножения
        } else { // если предыдущая операция была отменена, используем уже сохраненное значение результата и запрашиваем только второе число
            System.out.print("Введите второе число: ");
            num2 = scanner.nextDouble();
            result *= num2; // умножаем сохраненный результат на второе число
            undo = false; // сбрасываем флаг отмены
        }

        System.out.printf("Результат: %.2f\n", result);
        System.out.println();
    }


    static void division() {
        double num1;
        double num2;

        if (!undo) { // если предыдущая операция не была отменена, то запрашиваем новые числа
            System.out.print("Введите первое число: ");
            num1 = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            num2 = scanner.nextDouble();
            result = num1 / num2; // сохраняем результат деления
        } else { // если предыдущая операция была отменена, используем уже сохраненное значение результата и запрашиваем только второе число
            System.out.print("Введите второе число: ");
            num2 = scanner.nextDouble();
            result /= num2; // делим сохраненный результат на второе число
            undo = false; // сбрасываем флаг отмены
        }

        System.out.printf("Результат: %.2f\n", result);
        System.out.println();
    }

    static void undo() {
        undo = true; // устанавливаем флаг отмены
    }
}