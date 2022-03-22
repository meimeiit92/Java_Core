package testingHelloWorld;

import java.util.Scanner;

public class B5_ThuatToan {
    public static void main (String[] args)
    {
        tinhTienTimMax();
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
    private static void tinhTienTimMax()
    {
        int count = 0;
        // Số lượng lớn nhất của mỗi mệnh giá
        int iMax = 0, jMax = 0, kMax = 0;
        // Tổng max
        int max = 0;
        for(int i = 0; i <= 200; i++){
            for(int j = 0; j<=100; j++){
                for(int k=0; k<=40; k++ ){
                    if((i + 2 * j + 5 * k) == 200){
                        if(i >= 1 && j >= 1 && k >= 1){
                            if(max < (i + j + k)){
                                max = i + j + k;
                                iMax = i;
                                jMax = j;
                                kMax = k;
                            }
                        }
                        count ++;
                        System.out.printf("%d to 1000, %d to 2000, %d to 5000 \n",i, j, k);
                    }
                }
            }
        }
        System.out.printf("Tổng trường hợp đúng là %d \n", count);
        System.out.printf("Trường hợp có tổng số tờ tiền cao nhất là %d, %d 1000 VND, %d 2000 VND, %d 5000 VND",max, iMax,jMax, kMax);
    }
    private static void tinhTienTimMin()
    {
        int count = 0;
        // Số lượng lớn nhất của mỗi mệnh giá
        int iMax = 0, jMax = 0, kMax = 0;
        int iMin = 0, jMin = 0, kMin = 0;
        // Tổng max
        int max = 0;
        int min = 40;
        for(int i = 0; i <= 200; i++){
            for(int j = 0; j<=100; j++){
                for(int k=0; k<=40; k++ ){
                    if((i + 2 * j + 5 * k) == 200){
                        if(i >= 1 && j >= 1 && k >= 1){
                            if(min>(i+j+k)){

                            }
                        }
                        count ++;
                        System.out.printf("%d to 1000, %d to 2000, %d to 5000 \n",i, j, k);
                    }
                }
            }
        }
        System.out.printf("Tổng trường hợp đúng là %d \n", count);
        System.out.printf("Trường hợp có tổng số tờ tiền cao nhất là %d, %d 1000 VND, %d 2000 VND, %d 5000 VND",max, iMax,jMax, kMax);
    }
}
