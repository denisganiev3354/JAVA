package lesson_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhonebookHW5 {
    private Map<String, List<String>> phonebook;

    public PhonebookHW5() {
        this.phonebook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (phonebook.containsKey(lastName)) {
            List<String> numbers = phonebook.get(lastName);
            numbers.add(phoneNumber);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            phonebook.put(lastName, numbers);
        }
    }

    public List<String> get(String lastName) {
        return phonebook.get(lastName);
    }

    public static void main(String[] args) {
        PhonebookHW5 phonebook = new PhonebookHW5();

        // Добавляем записи в телефонный справочник
        phonebook.add("Иванов", "1111111");
        phonebook.add("Петров", "2222222");
        phonebook.add("Сидоров", "3333333");
        phonebook.add("Иванов", "4444444");

        // Ищем номера телефонов по фамилии
        List<String> ivanovNumbers = phonebook.get("Иванов");
        if (ivanovNumbers != null) {
            System.out.println("Номера телефонов Ивановых: " + ivanovNumbers);
        } else {
            System.out.println("Нет записей для фамилии Иванов");
        }

        List<String> petrovNumbers = phonebook.get("Петров");
        if (petrovNumbers != null) {
            System.out.println("Номера телефонов Петровых: " + petrovNumbers);
        } else {
            System.out.println("Нет записей для фамилии Петров");
        }

        List<String> smithNumbers = phonebook.get("Смит");
        if (smithNumbers != null) {
            System.out.println("Номера телефонов Смитов: " + smithNumbers);
        } else {
            System.out.println("Нет записей для фамилии Смит");
        }
    }
}