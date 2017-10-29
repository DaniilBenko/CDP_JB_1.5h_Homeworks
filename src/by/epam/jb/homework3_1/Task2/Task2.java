package by.epam.jb.homework3_1.Task2;
import java.util.Scanner;
public class Task2 {
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

        massivNull(a);

    }

    public static void enterArrayFromConsole(int[] mas) {
        Scanner fc = new Scanner(System.in);

        System.out.println("Введите массив");
        for (int i = 0; i < mas.length; i++) {

            System.out.println("ar[" + i + "]=>");
            mas[i] = fc.nextInt();
        }
    }

    public static void massivNull(int[] a) {
        int m = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 0) {
                m++;
            }
        }


        if (m==0){
            System.out.println("Нет нулевых эл-тов");

        }


        int[] SUM = new int[m];
        int f = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] == 0) {
                SUM[f] = i;
                f++;
            }
        }

        for (int i = 0; i < SUM.length; i++) {
            System.out.print("mas[" + i + "]=" + SUM[i] + "; ");
        }
    }
}
