import java.util.*;
import java.io.*;
import java.util.ArrayList;
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        int numStrings = readInt();
        int lengthStrings = readInt();

        // Use the method to check if each string inputted is alternating or not
        for (int i = 0; i < numStrings; i++) {
            String s = readLine();
            if (isAlternating(s)) {
                System.out.println("T");
            } else {
                System.out.println("F");
            }
        }
    }
// Make a method to check if it's alternating or not
    static boolean isAlternating(String s) {

        // Array that stores frequencies of every letter in alphabet
        int[] freq = new int[26];
        // Array that stores the classification of the letter as a 0 or 1 for heavy or light
        int[] classification = new int[s.length()];

        // Loops over the length of the user's string
        // For every letter it loops over, it adds 1 to the counter in the respective spot in the alphabet array (freq)
        // For each cycle, checks the letter at that index and subtracts 'a' from it to ge the position for it on the alphabet index (freq)
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Loops over the length of the user's string
        // We get the location of the letter in string which corresponds to the index in freq after we subtract is greater than 1 and add it to the classification list as a 0 or 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] > 1) {
                classification[i] = 0;
            } else {
                classification[i] = 1;
            }
        }

        // Now loop over the classification list which is all 0s and 1s at this point with a -1 length so we don't go out of bound of the list
        // If two numbers next to each other are the same then it's not alternating so return false, otherwise it just returns true
        for (int i = 0; i < classification.length-1; i++) {
            if (classification[i] == classification[i+1]) {
                return false;
            }
        }
        return true;
    }

    static String next () throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static long readLong () throws IOException {
        return Long.parseLong(next());
    }
    static int readInt () throws IOException {
        return Integer.parseInt(next());
    }
    static double readDouble () throws IOException {
        return Double.parseDouble(next());
    }
    static char readCharacter () throws IOException {
        return next().charAt(0);
    }
    static String readLine () throws IOException {
        return br.readLine().trim();
    }
}
