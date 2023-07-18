package lesson_4;

import java.util.LinkedList;
import java.util.Random;

class MyQueue<T> {
    private LinkedList<T> elements;

    public MyQueue() {
        elements = new LinkedList<>();
    }

    public MyQueue(LinkedList<T> linkedList) {
        elements = linkedList;
    }

    public void enqueue(T element) {
        elements.addLast(element);
    }

    public T dequeue() {
        return elements.pollFirst();
    }

    public T first() {
        return elements.peekFirst();
    }
}

public class HwProg4Task_2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(10));
        }

        System.out.println("Основной список: " + linkedList);

        MyQueue<Integer> queue = new MyQueue<>(linkedList);

        System.out.printf("Вывод: %d\n", queue.dequeue());
        System.out.printf("Вывод: %d\n", queue.first());
    }
}
