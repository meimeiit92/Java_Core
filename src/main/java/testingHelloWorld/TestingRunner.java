package testingHelloWorld;

import java.util.Date;
import java.util.Scanner;

public class TestingRunner {
    public static void  main(String[] args)
    {
        tinhTong();
        doiNhietDo();
    }
    private static void tinhTong()
    {

        int number, balance;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào 1 số nguyên có 3 chữ số : ");
        number = scanner.nextInt();
        while (number < 100) {
            System.out.println("Số nhập vào phải lớn hơn 000. Mời bạn nhập lại: ");
            number = scanner.nextInt();
        }

        while (number > 999) {
            System.out.println("Số nhập vào phải nhỏ hơn 1000. Mời bạn nhập lại: ");
            number = scanner.nextInt();
        }
        while(number!=0){
            balance = number%10;
            sum+= balance; number/=10;
        }
        System.out.println("Tổng các chữ số = " + sum);

    }

    private static void doiNhietDo()
    {
        double celsius, fahrenheit;
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập 1 nếu bạn muốn chuyển từ C sang F. Nhập 2 nếu bạn muốn chuyển từ F sang C");
        number = scanner.nextInt();
        if(number == 1)
        {
            System.out.println("Nhập vào độ Celcius cần đổi: ");
            celsius = scanner.nextDouble();
            fahrenheit = (double) 9 / 5 * celsius + 32;
            System.out.println(celsius + " độ C = " + fahrenheit + " độ F");
        }
        else if (number == 2)
        {
            System.out.println("Nhập vào độ Fahrenheit cần đổi: ");
            fahrenheit = scanner.nextDouble();
            celsius = 5*(fahrenheit - 32)/(float)(9);
            System.out.println(celsius + " độ F = " + celsius + " độ C");
        }
        else
        {
            System.out.println("Ban chi co the nhap 1 hoac 2. Xin loi toi xin dung chuong trinh tai day");
        }
    }
}
