package Lesson_2;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        try {
            String input = readNonEmptyString();
            System.out.println("Введенная строка: " + input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String readNonEmptyString() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите непустую строку: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            throw new Exception("Ошибка! Пустые строки вводить нельзя.");
        }

        return input;
    }
}
