package Lesson_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        float number = readFloatFromUser();
        System.out.println("Введенное число: " + number);
    }

    public static float readFloatFromUser() {
        float result = 0;
        boolean isValidInput = false;
        Scanner scanner = new Scanner(System.in);

        while (!isValidInput) {
            try {
                System.out.print("Введите дробное число: ");
                result = scanner.nextFloat();
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите дробное число с плавающей точкой.");
                scanner.nextLine(); // Clear the invalid input from the buffer
            }
        }

        return result;
    }
}
