package lesson_2;

import java.util.Scanner;
import java.util.UUID;

public class Program_2 {
    

    public static void main(String[] args){
        // task_1();
        System.out.println(task_2());
        

        }

/**
     * Задача:
     * На вход программы подаются произвольные алфавитно-цифровые символы.
     * Требуется написать программу, которая будет печатать последовательность строчных английских букв ('a' 'b'... 'z')
     * из входной последовательности и частот их повторения.
     * Печать должна происходить в алфавитном порядке. Например, пусть на вход подаются следующие символы:
     * fhb5234SSDSFsfsdfskbfsh.fmsdfsdf.
     * '.' - завершение последовательности
     * В этом случае программа должна вывести:
     * b2
     * f3
     * h2
     * k1
     * m1
     * s1
     */


    static String task_2(){
        
        String inputStr = "fhb5234SSDSFsfsdfskbfsh.fmsdfsdf.";
        int[] statistic = new int[26];
        int cA = 'a';
        int code;
        char c;
        for (int i = 0; i < inputStr.length();i++){
            c = inputStr.charAt(i);
            code = c;
            if(c >= 'a' && c <= 'z'){
                statistic[code - cA]++;
            }
            if(c == '.'){
                break;
                
            }
        }
        System.out.println("Результат работы приложения: ");
        StringBuilder stringBuilder = new StringBuilder();   
        
        for(int i = 0; i< statistic.length; i++){
            if(statistic[i] > 0){
            char cc = (char)(i + cA);
            stringBuilder
                .append(cc)
                .append(statistic[i])
                .append('\n');
            }
        }

        return stringBuilder.toString();

    }
    
    private static void append(int i) {
}

    static void task_1(){
        int a = 12;
        double b = 14.5;
        String str = "AAA" + "BBB" + a + "CCC" + b + "DDD";
        System.out.println(UUID.randomUUID());
        System.out.println(UUID.randomUUID());
        System.out.println(UUID.randomUUID());

        String buf = "";
        buf.length();
        long startTime =  System.currentTimeMillis();
        for (int i = 0; i < 30000; i++){
            buf += UUID.randomUUID();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Операция выполнена за " + (endTime - startTime) + "мс.");

        buf = "";
        startTime =  System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 30000; i++){
            stringBuilder.append(UUID.randomUUID());
        }
        endTime = System.currentTimeMillis();
        System.out.println("Операция выполнена за " + (endTime - startTime) + "мс.");


        }
    
}
