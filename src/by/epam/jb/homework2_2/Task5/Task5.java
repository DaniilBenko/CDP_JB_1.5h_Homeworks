package by.epam.jb.homework2_2.Task5;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        String str1;
        String str2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первую строчку : ");
        str1 = sc.next();

        System.out.print("Введите вторую строчку : ");
        str2 = sc.next();

        if(str1.equals(str2))
        {
            System.out.println("str1 equal str2 - значения объектов равны");
        }
        else {
            System.out.println("str1 not equal str2 - значения объектов не равны");
        }

        if(str1==str2)
        {
            System.out.println("str1 == str2 - ссылки указывают на один объект");
        }
        else {
            System.out.println("str1 !== str2  - ссылки указывают на разные объекты");
        }
    }
}
