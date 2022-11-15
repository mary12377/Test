package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new FileReader(args[0]));

        int cx= sc.nextInt();
        int cy = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Read from file =" + args[0] + " values ="+ cx+" "+ cy +" " + r);

        sc = new Scanner(new FileReader(args[1]));
        while (sc.hasNext()) {
            float px = sc.nextInt();
            float py = sc.nextInt();
        System.out.println("Считана точка " + px + " " +  py);

            float a = cx - px;
            float b = cy - py;

            double c = Math.sqrt(a * a + b * b);

            if (c < r) {
                System.out.println("Точка внутри ");
            } else if (c > r) {
                System.out.println("Точка снаружи ");
            } else {
                System.out.println("Точка лежит на окружности");
            }
        }
    }
}