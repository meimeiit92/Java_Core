package testingHelloWorld;

import java.util.Scanner;

public class B5_ThuatToan {
    public static void main (String[] args)
    {
        tinhTong();
        tinhCanBac2();
        giaiPhuongTrinhBac2();
        tinhTien();
    }
    private static void tinhTong()
    {
        Scanner in = new Scanner(System.in);
        int n, sum=0;
        while (true)
        {
            System.out.println("Moi ban nhap vao so n");
            n = in.nextInt();
            if(n>0) break;
            else {
                System.out.println("n phai la so duong, moi ban nhap lai");
            }
        }
        for(int i =0;i<=n;i++)
        {
            sum = sum+i;
        }
        System.out.printf("Tong la %d",sum);
    }
    private static void tinhCanBac2()
    {
        Scanner in = new Scanner(System.in);
        int n;
        double s=2;
        while (true)
        {
            System.out.println("Moi ban nhap vao so n");
            n = in.nextInt();
            if(n>0) break;
            else {
                System.out.println("n phai la so duong, moi ban nhap lai");
            }
        }
        for(int i =1;i<=n;i++)
        {
            s = Math.sqrt(s);
        }
        System.out.printf("Can bac 2 la %f",s);
    }
    private  static  void  giaiPhuongTrinhBac2()
    {
        float a,b,c;
        int x;
        Scanner in = new Scanner(System.in);
        System.out.println("Moi ban nhap x");
        x = in.nextInt();
        if(x>=5)
        {
            a=2;b=5;c=9;
        }
        else {
            a=-2;b=4;c=-9;
        }
        float tinh = a*x*x+b*x+c;
        System.out.printf("fx bang %f",tinh);
    }
    private static void tinhTien()
    {
        int x,y,z;
        //x+2y+5z=200
        //200 * 1000 = 200000 => x thuộc [0, 200]
        // 100 * 2000 = 200000 => y thuộc [0, 100]
        // 40 * 5000 = 200000 => z thuộc [0, 40]

        for ( x = 0; x <= 200; ++x)
            for ( y = 0; y <= 100; ++y)
                for ( z = 0; z <= 40; ++z)
                    if (x * 1000 + y * 2000 + z * 5000 == 200000)
                        System.out.println("so to 1000 " + x + " ,so to 2000 " + y + " ,so 5000 " + z);
    }
}
