import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the multiplication table: ");
        int num = scanner.nextInt();

        int[][] mul_table = new int[num][num];

        for (int i = 0; i <num; i++) {
            for (int j = 0; j < num; j++) {
                mul_table[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.println("Multiplication Table: ");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.printf("%4d", mul_table[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}