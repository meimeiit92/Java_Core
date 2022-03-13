package testingHelloWorld;

import java.util.Scanner;

public class B5_TongHop {
    public static void  main(String[] args)
    {
        double a = -1, b = -1;
        boolean hasValue = false;
        // Try
        try{
            a = Double.parseDouble(args[0]);
            a = Double.parseDouble(args[1]);
            hasValue = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        Scanner in = new Scanner(System.in);
        if(!hasValue||a<=0||b<=0)
        {
            while (true){
                if(a>0 && b>0) {
                    break;
                }
                else {
                    System.out.println("Cac canh phai la so duong");
                }
                System.out.println("Nhap chieu dai");
                a = in.nextDouble();
                System.out.println("Nhap chieu rong");
                b = in.nextDouble();
            }

        }
        in.close();
        double cv = (a+b)*2;
        // In co dinh dang
        System.out.printf("Chu vi la %2f \n",cv);
        System.out.println("Ket thuc chuong trinh");
    }
    public static void vongLap()
    {
        double a,b;
        // println la xuong dong
        // printf la dinh dang
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Nhap chieu dai");
            a = in.nextDouble();
            System.out.println("Nhap chieu rong");
            b = in.nextDouble();
            if(a>0 && b>0) {
                break;
            }
            else {
                System.out.println("Cac canh phai la so duong");
            }
        }
        in.close();
        double cv = (a+b)*2;
        // In co dinh dang
        System.out.printf("Chu vi la %2f \n",cv);
        System.out.println("Ket thuc chuong trinh");
    }
}
