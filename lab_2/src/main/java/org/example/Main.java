package org.example;
import java.util.Random;
import java.util.Scanner;


public class Main {
    private static final int MAX_SIZE = 20;
    private static final int MIN_RANDOM = -50;
    private static final int MAX_RANDOM = 50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть висоту матриці (не більше 20): ");
        int rows = getValidInput(scanner);

        System.out.print("Введіть ширину матриці (не більше 20): ");
        int cols = getValidInput(scanner);

        System.out.print("Оберіть спосіб заповнення (1 - вручну, 2 - рандомно): ");
        int choice = scanner.nextInt();

        int[][] matrix;
        if (choice == 1) {
            matrix = createMatrixManually(scanner, rows, cols);
        } else {
            matrix = createMatrixRandomly(rows, cols);
        }

        displayMatrix(matrix);
        System.out.println("Мінімальний елемент: " + findMin(matrix));
        System.out.println("Максимальний елемент: " + findMax(matrix));
        System.out.println("Середнє арифметичне: " + calculateAverage(matrix));
    }

    private static int getValidInput(Scanner scanner) {
        int value;
        do {
            value = scanner.nextInt();
            if (value < 1 || value > MAX_SIZE) {
                System.out.print("Неправильне значення. Введіть число від 1 до 20: ");
            }
        } while (value < 1 || value > MAX_SIZE);
        return value;
    }

    private static int[][] createMatrixManually(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static int[][] createMatrixRandomly(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = MIN_RANDOM + random.nextInt(MAX_RANDOM - MIN_RANDOM + 1);
            }
        }
        return matrix;
    }

    private static void displayMatrix(int[][] matrix) {
        System.out.println("Матриця:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }

    private static int findMin(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num < min) {
                    min = num;
                }
            }
        }
        return min;
    }

    private static int findMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    private static double calculateAverage(int[][] matrix) {
        int sum = 0, count = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
                count++;
            }
        }
        return (double) sum / count;
    }
}
