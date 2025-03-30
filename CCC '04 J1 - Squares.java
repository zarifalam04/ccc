import java.io.*;
import java.util.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTiles = scanner.nextInt();
        int result = (int) Math.sqrt(numTiles);
        System.out.println("The largest square has side length " + result + ".");
        scanner.close();
    }

}
