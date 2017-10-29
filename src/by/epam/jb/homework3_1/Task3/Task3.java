package by.epam.jb.homework3_1.Task3;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число эл-тов массива");
        while (!sc.hasNextInt()) {
            sc.next();
        }
        i = sc.nextInt();

        double[] a = new double[i];

        enterArray(a);

        OpredeleniePosled(a);

    }

    public static void enterArray(double[] mas) {
        Scanner fc = new Scanner(System.in);

        System.out.println("Введите массив");
        for (int i = 0; i < mas.length; i++) {

            System.out.println("ar[" + i + "]=>");
            mas[i] = fc.nextDouble();
        }
    }

    public static void OpredeleniePosled(double[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i] + "; ");
        }
        boolean vozrast=true;
        boolean flag=false;
        int i=1;


        while(flag == false){
            while(i < a.length) {
                if(a[i-1] >a[i]){
                    System.out.println("Не Возрастающая");
                    flag=true;
                    vozrast=false;
                    break;
                }
                i++;
            }
            flag=true;
        }

        if(vozrast==true){
            System.out.println("Возрастающая");
        }
    }
}
