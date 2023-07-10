package lesson_2;

import java.util.UUID;

public class Program {
    

    public static void main(String[] args){
        task_1();
        
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
