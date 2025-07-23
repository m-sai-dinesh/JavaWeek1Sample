import java.util.*;
public class mat {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);        
        // size of A
        System.out.print("Enter dimension of matrix A : ");
        int m1 = inp.nextInt();
        int n1 = inp.nextInt();        
        // size of B
        System.out.print("Enter dimension of matrix B : ");
        int m2 = inp.nextInt();
        int n2 = inp.nextInt();        
        // declaration of matrix
        int[][] A = new int[m1][n1];
        int[][] B = new int[m2][n2];        
        // multiplication check
        if (n1 != m2)
            System.out.print("Matrix multiplication not possible due to inconsistency");
        else {
            System.out.print("Enter " + m1 * n1 + " elemnts to A \n");            
            // input to A
            for (int i = 0; i < m1; i++)
                for (int j = 0; j < n1; j++) {
                    System.out.print("Enter element of A[" + i + "][" + j + "]");
                    A[i][j] = inp.nextInt();
                }            
            System.out.print("Enter " + m2 * n2 + " elemnts to B \n");            
            // input to B
            for (int i = 0; i < m2; i++)
                for (int j = 0; j < n2; j++) {
                    System.out.print("Enter element of B[" + i + "][" + j + "]");
                    B[i][j] = inp.nextInt();
                }            
            int[][] C = new int[m1][n2];
            for (int i = 0; i < m1; i++)
                for (int j = 0; j < n2; j++) {
                    C[i][j] = 0;
                    for (int k = 0; k < n1; k++)
                        C[i][j] += A[i][k] * B[k][j];
                }            
            // print product
            System.out.println("Product Matrix:");
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++)
                    System.out.print(C[i][j] + " ");
                System.out.print("\n");
            }
        }
    }
}
