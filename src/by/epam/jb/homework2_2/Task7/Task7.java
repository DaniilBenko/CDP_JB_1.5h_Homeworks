package by.epam.jb.homework2_2.Task7;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        int i=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число эл-тов");
        while (!sc.hasNextInt()) {
            sc.next();
        }
        i=sc.nextInt();

        double[] mas = new double[i];

        fromConsole(mas);
        maxElement(mas);
        minElementAndIndex(mas);
        sortMas(mas);
        printMas(mas);
    }

    public static void fromConsole(double[] mas) {

        Scanner fc = new Scanner(System.in);

        System.out.println("Введите массив");
        for (int i = 0; i < mas.length; i++) {

            System.out.println("ar[" + i + "]=>");
            mas[i] = fc.nextDouble();
        }
    }



    public static void printMas(double[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println("mas[" + i + "]=" + mas[i]);
        }
    }

    public static void maxElement(double[] mas) {
        if (mas.length == 0) {
            return;
        }
        double max;

        max = mas[0];

        for (int i = 1; i < mas.length; i++) {
            if (max < mas[i]) {
                max = mas[i];

            }
        }
        System.out.println("MaxElement= " + max);
    }

    public static void minElementAndIndex(double[] mas) {
        if (mas.length == 0) {
            return;
        }
        double min=mas[0];
        int x=0;
        for (int i = 1; i < mas.length; i++) {
            if (min > mas[i]) {
                min = mas[i];
                x=i;
            }
        }
        System.out.println("MinElement= " + min + " Index= " + x);
    }



    public static void sortMas(double[] mas) {
        int minIndex = 0;
        for (int i = 0; i < mas.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[j] < mas[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = mas[i];
            mas[i] = mas[minIndex];
            mas[minIndex] = temp;
        }
    }
}
