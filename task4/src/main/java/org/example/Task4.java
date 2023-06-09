package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String args[]) throws FileNotFoundException {

        Scanner sc = new Scanner(new FileReader(args[0]));
        List<Integer> nums = new ArrayList<>();
        int sum = 0;
        while (sc.hasNext()) {
            int temp = sc.nextInt();
            nums.add(temp);
            sum += temp;
        }
        System.out.println("Count of readed elements=" + nums.size());


        int avg = sum / nums.size();

        int steps = 0;
        for (int n : nums) {
            steps += Math.abs(n - avg);
        }

        System.out.println(steps);
    }
}


