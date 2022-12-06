/*WAJAP that multiplys 2 matrices*/

import java.util.Scanner;

class Multi {

    public static void main(String args[]) {

        Scanner r = new Scanner(System.in);

        System.out.print("Enter the number of rows of the 1st Arrayy:");
        int a = r.nextInt();

        System.out.print("Enter the number of coloumns of the 1st Arrayy:");
        int b = r.nextInt();
        System.out.println();

        System.out.print("Enter the number of rows of the 2nd Arrayy:");
        int c = r.nextInt();

        System.out.print("Enter the number of coloumns of the 2nd Arrayy:");
        int d = r.nextInt();
        System.out.println();

        if (b != c) {
            System.out.print("Matrix Multiplication is not possible!");
        }

        else {

            int i, j,k;

            int A[][] = new int[a][b];
            int B[][] = new int[c][d];

            for (i = 0; i < a; i++) {
                for (j = 0; j < b; j++) {
                    System.out.print("Enter the element of the 1st array: ");
                    A[i][j] = r.nextInt();

                }
            }
            System.out.println();

            for (i = 0; i < c; i++) {
                for (j = 0; j < d; j++) {
                    System.out.print("Enter the element of the 2nd array: ");
                    A[i][j] = r.nextInt();

                }
            }
            System.out.println();

            int C[][] = new int[a][d];

            for (i = 0; i <a; i++) {
                for (j = 0; j < d; j++) {
                    C[i][j]=0;
                    for (k=0;k<a;k++){

                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            for (i = 0; i < a; i++) {
                System.out.println("-----------");
                for (j = 0; j < d; j++) {
                    System.out.println(C[i][j]);

                }
            }

        }

    }
