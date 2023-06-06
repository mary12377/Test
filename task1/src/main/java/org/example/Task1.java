package org.example;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите элементы массива n m");
        int n = scan.nextInt();
        int m = scan.nextInt();

        System.out.println(findRoute(n, m));
    }

    public static String findRoute(int n, int m) {
        int[] arr = IntStream.rangeClosed(1, n).toArray();
        String result = "";
        int indleft = 0;
        int indright = m - 1;
        while (true) {
            result += arr[indleft];
            if (indright == 0) {
                break;
            }
            indleft = indright;
            indright = (indright + m - 1) % n;
        }
        return result;
    }
}



