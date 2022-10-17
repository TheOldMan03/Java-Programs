//Write a java program that counts the frequncy of a character in a string

import java.util.Scanner;

class Frequency {

    public static void main(String args[]) {

        Scanner r = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String Word = r.nextLine();

        int l = Word.length();

        int FreqCount[];

        FreqCount = new int[l - 1];

        int i, j;

        for (i = 0; i <= l - 1; i++) {

            FreqCount[i] = 1;

            for (j = i + 1; j <= l - 1; j++) {

                if (FreqCount[j] != 0) {

                    if (Word.charAt(i) == Word.charAt(j)) {
                        FreqCount[i]++;
                        FreqCount[j] = 0;
                    }
                }

            }
        }

        for (i = 0; i < l; i++) {

            if (FreqCount[i] != 0 || Word.charAt(i) != ' ') {
                System.out.println(Word.charAt(i) + " -> " + FreqCount[i]);
            }
        }

    }

}