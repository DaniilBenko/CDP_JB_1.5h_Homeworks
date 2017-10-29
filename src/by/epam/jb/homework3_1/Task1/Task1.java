package by.epam.jb.homework3_1.Task1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        int i;
        int K=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число элементов");
        while (!sc.hasNextInt()) {
            sc.next();
        }
        i=sc.nextInt();

        int[] a= new int[i];

        enterArrayFromConsole(a);
        K=kratnoe();
        summaElem(a,K);


    }

    public static void enterArrayFromConsole(int[] mas) {
        Scanner fc = new Scanner(System.in);

        System.out.println("Введите массив");
        for (int i = 0; i < mas.length; i++) {

            System.out.println("ar[" + i + "]=>");
            mas[i] = fc.nextInt();
        }
    }
    public static int kratnoe(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите кратное число");
        while (!sc.hasNextInt()) {
            sc.next();
        }
        return sc.nextInt();
    }


    public static void summaElem(int[] a, int K){
        int SUM=0;
        for(int i=0; i<a.length; i++){

            if(a[i]%K==0){
                SUM=SUM+a[i];
            }

        }
        System.out.println("Сумма элементов, кратных "+ K + "=  " + SUM);

    }
}
