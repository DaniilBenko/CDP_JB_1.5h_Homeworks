package by.epam.jb.homework1_2.hw7;
import java.util.Scanner;
import static java.lang.Math.pow;
public class Task7 {
    public static void main(String[] args) {

        double a, b, c;
        Scanner sc = new Scanner(System.in);



        for (int i=0; i<3; i++){

            System.out.println("Введите  значение числа" + (i+1));
            while (!sc.hasNextDouble()) {
                sc.next();
            }
            a = sc.nextDouble();

            if (a>=0) {
                a=pow(a,2);
                System.out.println("квадрат числа =" + a);
            }

            if(a<0){
                a=pow(a,4);
                System.out.println("четвертая степень числа =" + a);

            }

        }
    }
}
