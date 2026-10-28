import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите массив чисел (в одну строку): ");
        String[] numbers = scanner.nextLine().trim().split("\\s+");

        int[] a = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            a[i] = Integer.parseInt(numbers[i]);
        }

        int best = 0;
        long maxSum = (long) a[0] + a[1];

        for (int i = 1; i < a.length - 1; i++) {
            long sum = (long) a[i] + a[i + 1];

            if (sum > maxSum) {
                maxSum = sum;
                best = i;
            }
        }

        System.out.println("Наибольшая пара: " + a[best] + " " + a[best + 1]);
    }
}
