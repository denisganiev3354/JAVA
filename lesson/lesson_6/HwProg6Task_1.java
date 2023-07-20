package lesson_6;

import java.util.HashSet;
import java.util.Objects;

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }


}

public class HwProg6Task_1 {
    public static void main(String[] args) {
        HashSet<Cat> catSet = new HashSet<>();

        Cat cat1 = new Cat("Tom", 3);
        Cat cat2 = new Cat("Jerry", 2);
        Cat cat3 = new Cat("Tom", 3);
        Cat cat4 = new Cat("Jerry", 2);

        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        catSet.add(cat4);

        System.out.println("Содержимое множества после добавления:");
        for (Cat cat : catSet) {
            System.out.println(cat.getName() + " - " + cat.getAge());
        }
    }
}