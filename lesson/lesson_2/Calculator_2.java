package lesson_2;

import java.util.Scanner;

public class Calculator_2 {
    
    static Scanner scanner = new Scanner(System.in);
    
    static void main(String[] args) {
        
        boolean exit = true;

        while(exit){
            System.out.println("Выберите операцию:");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Выход");
    
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
                    exit = false;
                    break;

                default: 
                    System.out.println("Ошибка: неправильный выбор операции!");
                
    
            }
        }

    }

    static void add(){
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();
    
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, num1 + num2 );
            System.out.println();
    }

    static void subtract(){
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();
    
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, num1 - num2 );
            System.out.println();

    }

    static void multiply(){
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();
    
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            System.out.printf("%.2f * %.2f = %.2f\n", num1 , num2, num1 * num2);
            System.out.println();


    }

    static void division(){
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();
    
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();
            
        if (num2 != 0) 
            System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, num1 / num2);
            


        else
            System.out.println("Ошибка: деление на ноль!");
            System.out.println();


    }

}

