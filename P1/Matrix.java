/*WAJAP that multiplys 2 matrices*/

import java.util.Scanner;

class Multi {

    public static void main(String args[]) {

        Scanner r = new Scanner(System.in);

        System.out.print("Enter the number of rows of the 1st Arrayy:");
        int p = r.nextInt();

        System.out.print("Enter the number of coloumns of the 1st Arrayy:");
        int q = r.nextInt();
        System.out.println();

        System.out.print("Enter the number of rows of the 2nd Arrayy:");
        int a = r.nextInt();

        System.out.print("Enter the number of coloumns of the 2nd Arrayy:");
        int b = r.nextInt();
        System.out.println();

        if (q != a) {
            System.out.print("Matrix Multiplication is not possible!");
        }

        else {

            int i, j;

            int A[][] = new int[p][q];
            int B[][] = new int[a][b];

            for (i = 0; i < p; i++) {
                for (j = 0; j < q; j++) {
                    System.out.print("Enter the element of the 1st array: ");
                    A[i][j] = r.nextInt();

                }
            }
            System.out.println();

            for (i = 0; i < a; i++) {
                for (j = 0; j < b; j++) {
                    System.out.print("Enter the element of the 2nd array: ");
                    A[i][j] = r.nextInt();

                }
            }
            System.out.println();

            int C[][] = new int[p][b];

            for (i = 0; i < p; i++) {
                for (j = 0; j < b; j++) {
                    C[i][j] = 0;
                    C[i][j] += A[i][j] * B[j][i];
                }
            }

            for (i = 0; i < p; i++) {
                System.out.println("-----------");
                for (j = 0; j < b; j++) {
                    System.out.println(C[i][j]);

                }
            }

        }

    }

}