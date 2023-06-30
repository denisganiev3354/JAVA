package HW.HWtask_4;
// (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
import javax.script.ScriptEngineManager;

public class Main {
    public static void main(String[] args) {
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
}