package lesson_4;


import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;


public class HwProg4Task_1 {
    public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> linkedList) {
        LinkedList<T> reversedList = new LinkedList<>();
        ListIterator<T> iterator = linkedList.listIterator(linkedList.size());

        while (iterator.hasPrevious()) {
            T element = iterator.previous();
            reversedList.add(element);
        }

        return reversedList;
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(10));
        }
    System.out.printf("Основной список: %s\n", linkedList);

    LinkedList<Integer> reversedLinkedList = reverseLinkedList(linkedList);
    System.out.printf("Перевернутый список: %s\n", reversedLinkedList);
    
    }
}

    

