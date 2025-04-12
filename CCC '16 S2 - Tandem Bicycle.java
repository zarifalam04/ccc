import java.util.*;
import java.io.*;
import java.util.Arrays;
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    // Handle the diff question types
    public static void main(String[] args) throws IOException {
        int questionType = readInt();
        if (questionType == 1) {
            System.out.println(getMinSpeed());
        } else {
            System.out.println(getMaxSpeed());
        }
    }

    // Method used for min speed
    public static int getMinSpeed() throws IOException {
        int numCitizens = readInt();
        int[] dmojistanSpeed = new int[numCitizens];
        int[] pegLand = new int[numCitizens];
        int total = 0;

        // Put each of the values into the respective array
        for (int i = 0; i < numCitizens; i++) {
            dmojistanSpeed[i] = readInt();
        }
        for (int i = 0; i < numCitizens; i++) {
            pegLand[i] = readInt();
        }

        // Sort each array for both country's speeds
        Arrays.sort(dmojistanSpeed);
        Arrays.sort(pegLand);

        // Cycle through the number of speeds, starting at index i, whichever value is greater in index i of either list, essentially matching the lowest with lowest, etc, add it to the total
        for (int i = 0; i < numCitizens; i++) {
            if (dmojistanSpeed[i] > pegLand[i]) {
                total += dmojistanSpeed[i];
            } else {
                total += pegLand[i];
            }
        }

        // Returns the total speed
        return total;
    }
    public static int getMaxSpeed() throws IOException {
        int numCitizens = readInt();
        int[] dmojistanSpeed = new int[numCitizens];
        int[] pegLand = new int[numCitizens];
        int[] reversePegLand = new int[numCitizens];
        int counter = 0;
        int total = 0;

        // Get the arrays
        for (int i = 0; i < numCitizens; i++) {
            dmojistanSpeed[i] = readInt();
        }
        for (int i = 0; i < numCitizens; i++) {
            pegLand[i] = readInt();
        }

        // Sort arrays from least to greatest
        Arrays.sort(dmojistanSpeed);
        Arrays.sort(pegLand);

        // Reverse one of the arrays
        // Start at the end of the array, loop until reaches 0, and decrements by 1
        // In the reverse lists, add to it starting from the highest index starting from the 0 index in it (using counter as a reference for the index)
        for (int i = numCitizens-1; i >= 0; i--) {
            reversePegLand[counter] = pegLand[i];
            counter++;
        }

        // Add the totals
        for (int i = 0; i < numCitizens; i++) {
            if (dmojistanSpeed[i] > reversePegLand[i]) {
                total += dmojistanSpeed[i];
            } else {
                total += reversePegLand[i];
            }
        }

        return total;
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
