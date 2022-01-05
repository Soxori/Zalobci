package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Judge> judges = new ArrayList<>();
        File input = new File("C:\\Users\\jakub\\Desktop\\Zalobci\\src\\com\\company\\naklady_zastoupeni.csv"); //D:\Zalobci\src\com\company\naklady_zastoupeni.csv
        Scanner sc = new Scanner(input);
        sc.nextLine();
        while(sc.hasNextLine()) {
            String[] judge = sc.nextLine().split(",");
            System.out.println(Arrays.toString(judge));
            judges.add(new Judge(judge));
        }
        double castkaAvg = judges.stream().mapToDouble(j -> j.castka).average().getAsDouble();
        System.out.println(Math.round(castkaAvg / 100));
    }
}
