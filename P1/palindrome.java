/* Write a Java program that checks whether a given string is a Palindrome
Write a java program that counts the frequncy of a character in a string
WAJAP that multiplys 2 matrices */

import java.util.Scanner;

class Palindrome {

    public static void main(String args[]) {

        Scanner r = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String text = r.nextLine();

        int i, j;
        int flag = 0;

        for (i = 0, j = text.length() - 1; j >= 0; i++, j--) {

            if (text.charAt(i) != text.charAt(j)) {
                flag = 1;
                break;
            }

        }

        if (flag == 1)
            System.out.println("The given string " + text + " is not a Palindrome");

        else
            System.out.println("The given string " + text + " is a palindrome");

    }

}