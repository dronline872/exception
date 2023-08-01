package Lesson_2;

public class task_2 {
    public static void main(String[] args) {
        int d = 2;
        Double[] arg = new Double[] { 1.2, 2.1, 3.2, 4.3, 5.5, 6.6, 7.7, 7.7, 7.7, 7.7 };
        division(d, arg);
    }

    public static void division(int d, Double[] intArray) {
        if (d == 0) {
            System.out.println("На ноль делить нельзя");
            return;
        }

        if (intArray.length < 9) {
            System.out.println("Длина intArray меньше 9");
            return;
        }

        Double catchedRes1 = intArray[8] / d;
        System.out.println("Результат = " + catchedRes1);
    }
}
