import java.util.Scanner;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите массив чисел для преобразований: ");
        String[] numbers = scanner.nextLine().trim().split("\\s+");

        int[] a = new int[numbers.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(numbers[i]);
        }

        int[] b = new int[a.length];
        int[] indexes = new int[a.length];

        int j = 0;
        for (int i = 0; i < b.length; i += 2) {
            b[j] = a[i];
            indexes[j] = i;
            j += 1;
        }
        for (int i = 1; i < b.length; i += 2) {
            b[j] = a[i];
            indexes[j] = i;
            j += 1;
        }

        System.out.println("Конечный массив: " + Arrays.toString(b));
        System.out.println("Индексы в старом массиве для проверки: " + Arrays.toString(indexes));
    }

}
