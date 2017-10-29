package by.epam.jb.homework3_1.Task4;
import java.util.Scanner;
import java.util.Random;
public class Task4 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число эл-тов массива");
        while (!sc.hasNextInt()) {
            sc.next();
        }
        i = sc.nextInt();

        int[] a = new int[i];

        enterArrayFromConsole(a);
        Print(a);
        massivChetnie(a);

    }

    public static void enterArrayFromConsole(int[] a) {
        Random random=new Random();



        for (int i = 0; i < a.length; i++) {


            a[i] = random.nextInt(100);
        }
    }

    public static void Print(int[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"]="+a[i] + "   ");
        }
        System.out.println();
    }



    public static void massivChetnie(int[] a) {
        int m = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i]%2 == 0) {
                m++;
            }
        }


        if (m==0){
            System.out.println("Четных элементов нет!");

        }


        int[] SUM = new int[m];
        int f = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i]%2 == 0) {
                SUM[f] = a[i];
                f++;
            }
        }

        for (int i = 0; i < SUM.length; i++) {
            System.out.println("mas[" + i + "]=" + SUM[i]);
        }
    }
}
