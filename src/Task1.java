import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();

        System.out.print("Вводите массив почислово: ");
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.print("Введите число k: ");
        int k = scanner.nextInt();

        System.out.println("Готовые числа: ");
        for (int i = k - 1; i < n; i += k) {
            System.out.println(A[i]);
        }
    }
}