import java.util.*;
import java.io.*;
import java.util.ArrayList;
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int numQuestions = readInt();
        ArrayList<String> answers = new ArrayList<>();
        ArrayList<String> correctAnswers = new ArrayList<>();
        int correct = 0;
        for (int i = 0; i < numQuestions; i++) {
            answers.add(br.readLine());
        }

        for (int i = 0; i <numQuestions; i++) {
            correctAnswers.add(br.readLine());
        }
        for (int i = 0; i < numQuestions; i++) {
            if (answers.get(i).equals(correctAnswers.get(i))) {
                correct++;
            }
        }

        System.out.println(correct);
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
