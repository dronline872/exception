package Lesson_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class task_1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные (Фамилия Имя Отчество, дата рождения, номер телефона, пол):");

        try {
            String userDataInput = scanner.nextLine();
            String[] userDataArray = userDataInput.split(" ");
            
            if (userDataArray.length != 6) {
                throw new InputMismatchException("Неверное количество данных.");
            }
            
            String fullName = userDataArray[0] + " " + userDataArray[1] + " " + userDataArray[2];
            String birthDate = userDataArray[3];
            long phoneNumber = Long.parseLong(userDataArray[4]);
            char gender = userDataArray[5].charAt(0);
            
            if (gender != 'f' && gender != 'm') {
                throw new InputMismatchException("Неверный формат пола.");
            }
            
            String fileName = userDataArray[0] + ".txt";
            
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                String userInfo = fullName + ", " + birthDate + ", " + phoneNumber + ", " + gender;
                writer.write(userInfo);
            } catch (IOException e) {
                System.err.println("Ошибка при записи данных в файл.");
                e.printStackTrace();
            }
            
        } catch (InputMismatchException e) {
            handleInputMismatch(e);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат номера телефона.");
            e.printStackTrace();
        }
    }

    private static void handleInputMismatch(InputMismatchException e) {
        System.err.println("Ошибка: " + e.getMessage());
        e.printStackTrace();
    }
}
