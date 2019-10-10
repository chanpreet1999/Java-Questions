import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimension of First matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
        System.out.print("Enter dimension of Second matrix: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] b = new int[x][y];
        System.out.print("Enter elements: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                b[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
        System.out.println("Multiplication: ");
        int sum = 0;
        int c[][] = new int[m][y];
        if (n == y) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < y; j++) {
                    for (int k = 0; k < x; k++) {
                        sum = sum + a[i][k] * b[k][j];
                    }

                    c[i][j] = sum;
                    sum = 0;
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < y; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("not possible");
        }
    }

}
