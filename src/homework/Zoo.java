package homework;

import java.util.ArrayList;

//Використовуючи Intelij IDEA, створити проект, пакет.
// Використовуючи клас Zoo Завдання 2, видалити 3, 5, 7 тварин, дізнатися розмір списку і вивести в консоль.
public class Zoo {
    public ArrayList<String> animals = new ArrayList<>();

    public void abbAnimals() {
        animals.add(0, "Cat");
        animals.add(1, "Dog");
        animals.add(2, "Mouse");
        animals.add(3, "Lion");
        animals.add(4, "Lizard");
        animals.add(5, "Cow");
        animals.add(6, "Horse");
        animals.add(7, "Hare");

    }

    public void print() {
        abbAnimals();
        animals.remove(6); //animals.remove("Horse");
        animals.remove(4);
        animals.remove(2);

        System.out.println(animals.size() + " - Size ArrayList");
        for (int i = animals.size() - 1; i >= 0; i--) {
            System.out.println(animals.get(i));
        }
    }
}