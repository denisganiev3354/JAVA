package lesson_1;

import java.util.Scanner;

import javax.script.ScriptEngineManager;

public class Program {

    static Scanner scanner = new Scanner(System.in);


    // public static void 

    public static void main(String[] args){
        boolean f = true;
        while(f){
            System.out.println("Укажите номер задачи: ");
        System.out.println("1 - Задача 1");
        System.out.println("2 - Задача 2");
        System.out.println("3 - Задача 3");
        System.out.println("4 - Домашняя Задача 1");
        System.out.println("5 - Домашняя Задача 2");
        System.out.println("6 - Домашняя Задача 3(калькулятор)");
        System.out.println("7 - Домашняя Задача 4(доп)");
        System.out.println("0 - Завершение работы приложения.");
        System.out.println();
        int no = Integer.parseInt(scanner.nextLine());
        


        switch(no){

            case 1: 
                printName();
                System.out.println();
                break;
                
            case 2: 
                task_2();
                System.out.println();
                break;
            
            case 3: 
                task_3("Добро пожаловать на курс по Java");
                break;
            
            case 4:
                hwTask_1(args);
                break;

            case 5:
                hwTask_2(args);
                break;

            case 6:
                Calculator.run(args);
                break;

            case 7:
                hwTask_4(args);
                break;

                

            case 0:
                System.out.println("Завершение работы приложения.");
                f = false;
                break;
                
            default:
                System.out.println("Некорректный номер задачи, \nпoвтopитe попытку ввода."); 
                break;
            }

        }

        
        
    }



    

    public static void hwTask_1(String[] args) {
        System.out.print("Введите значение n: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        int triangleNum = (n * (n + 1)) / 2;
        System.out.printf("Треугольное число %d = %d\n", n, triangleNum);

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.printf("Факториал %d = %d ", n, fact);
    }

    public static void hwTask_2(String[] args) {
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

    
    public static void hwTask_4(String[] args) {
        int e = 69;

        for (int q = 0; q <= 9; q++) {
            for (int w = 0; w <= 9; w++) {
                String eq = "2? + ?5 = " + e;
                eq = eq.replace("?", Integer.toString(q)).replace("?", Integer.toString(w));
                if (eval(eq)) {
                    System.out.println(eq);
                    return;
                }
            }
        }

        System.out.println("Решений нет");
    }

    public static boolean eval(String s) {
        try {
            return (new ScriptEngineManager().getEngineByName("JavaScript")
                    .eval(s).toString().equals("true"));
        } catch (Exception e) {
            return false;
        }
    }


// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    static void task_3(String str){
        
        for(int i = 0, j = 10; i < j; i++, j--){
            System.out.printf("i=%d - j%d\n", i, j);
        }
        String[] words = str.split(" ");
            for(int i = words.length - 1; i >= 0; i--){
                System.out.printf("%s ", words[i]);
            }
            System.out.println();
       }

    // Написать программу, которая запросит пользователя ввести <Имя> в консоли.
    // Получит введенную строку и выведет в консоль сообщение "Привет, <Имя>!"
    // 

    static void printName(){
        int i = 12;
        double j = 12.4;
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
        System.out.printf("Привет, %s ! %d %.2f\n", name, i, j);
    }

    // Дан массив двоичных чисел, например[1,1,0,1,1,1,0,1], вывести
    // максимальное колличество подряд идущих 1.

    static void task_2(){

        int counter = 0;
        int max = 0;

        int[] array = new int[5];
        array[0] = 1;
        array[1] = 1;
        array[2] = 0;
        array[3] = 1;
        array[4] = 0;
        int[] array1 = {1, 0, 0, 1, 1, 1, 0, 1};
        for (int e : array1) {
            if (e == 1) 
                counter++;
            else{
                if(counter > max)
                    max = counter;
                counter = 0;
            }
        }

        System.out.printf("Максимальное кол-во подряд идущих единиц: %d\n", max);

    }

  


}
