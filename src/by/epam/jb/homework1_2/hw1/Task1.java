package by.epam.jb.homework1_2.hw1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        double a,b,c,d,e;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите a: ");
        while (!sc.hasNextDouble()){
            sc.next();
        }
        a = sc.nextDouble();

        System.out.print("Введите b: ");
        while (!sc.hasNextDouble()){
            sc.next();
        }
        b = sc.nextDouble();

        if (a == b) {
            System.out.println("скоро Новый Год!");
        } else {
            System.out.print("Введите c: ");
            while (!sc.hasNextDouble()){
                sc.next();
            }
            c = sc.nextDouble();

            d = a + b + c;
            e = a * a + b * b;
            System.out.println("d= " + d);
            System.out.println("e= " + e);
            System.out.println("моя любимая футбольная команда");
        }
    }
}
