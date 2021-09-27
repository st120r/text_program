package src.main.java;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("""
                              Нужно написать программу, которая на вход получает текст, делит весь текст на слова (по пробелам и знакам препинания) и возвращает коллекцию только уникальных слов (то есть если в тексте, например, есть несколько слов "Привет", то в возвращаемой коллекции должно быть только одно такое слово. Результат вывести в консоль.
                """);
        Service service = new Service();
        while (true) {
            service.scanner();
        }
    }
}
