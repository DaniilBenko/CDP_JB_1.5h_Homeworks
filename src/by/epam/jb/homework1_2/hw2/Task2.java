package by.epam.jb.homework1_2.hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int b = 0;
        int d = 0;
        double a,c;

        System.out.print("Введите количество чисел: ");
        while (!sc.hasNextInt()){
            sc.next();
        }
        i = sc.nextInt();

        int[] x;
        x = new int[i];

        for (int i1=0; i1 < i; i1++){
            System.out.print("Введите число " + i1 + ": ");
            while (!sc.hasNextInt()){
                sc.next();
            }
            x[i1] = sc.nextInt();
            System.out.println("число " + i1 + "= " + x[i1]);
        }

        for (int i2=0; i2 < i; i2++) {
            a = x[i2] % 2;
            if (a == 0) {
                b = b + 1;
            }
            c = x[i2] % 3;
            if (x[i2] != 0) {if (c == 0) {
                d = d + 1;
                }
            }
        }
        System.out.println("количество четных = " + b);
        System.out.println("количество кратных 3 = " + d);
    }
}
