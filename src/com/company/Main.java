package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("D:\\Zalobci\\src\\com\\company\\naklady_zastoupeni.csv");
        Scanner sc = new Scanner(input);
        while(sc.hasNextLine()) {
            String[] soudce = sc.nextLine().split(",");
            System.out.println();
        }
    }
}
