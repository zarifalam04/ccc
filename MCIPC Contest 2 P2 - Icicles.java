import java.util.*;
import java.io.*;
import java.util.ArrayList;
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int numIcicles = readInt();
        ArrayList<Integer> icicles = new ArrayList<Integer>();
        int breakCounter = 0;
        for (int i = 0; i < numIcicles; i++) {
            icicles.add(readInt());
        }
        for (int i = 0; i < numIcicles/2; i++) {
            if (!icicles.get(i).equals(icicles.get(icicles.size() - 1 -i))) {
                breakCounter += 2;
            }
        }
        System.out.println(breakCounter);
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
