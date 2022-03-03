package testingHelloWorld;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3Mang {
    public static void  main(String[] args)
    {
        timMaxMin();
        chenPhanTu();
        kiemTraPhanTuTrongMang();
        kiemTraNhieuPhanTuBiTrung();
        daoChieuMang();
        timGiaTriLonThuHai();
    }
    private static void timMaxMin()
    {
        int [] daySo = new int []{56,1389,23,67,89,1289};
        int min = daySo[0];
        int max = daySo[0];
        for(int i=0;i<daySo.length;i++)
        {
            if (daySo[i] < min )
            {
                min = daySo[i];
            }
            if(daySo[i]>max)
            {
                max=daySo[i];
            }
        }
        System.out.println("So nho nhat la "+min);
        System.out.println("So lon nhat la "+max);
    }
    private  static  void  chenPhanTu()
    {

        Scanner input= new Scanner(System.in);
        System.out.print("Moi Nhap So Phan Tu Cua Mang :");
        int sopt =input.nextInt();
        int[] arrBefore=new int[sopt];
        int[] arrAfter = new int[sopt + 1];
        //Nhap Mang
        for(int k=0;k<arrBefore.length;k++)
        {
            System.out.printf("mang[%d] = ",k);
            arrBefore[k]=input.nextInt();
        }
        System.out.println("Nhap vi tri can chen k=");
        int k=input.nextInt();
        System.out.println("Nhap gia tri can chen x:");
        int x=input.nextInt();
        for(int i=0;i<arrBefore.length;i++)
        {
            arrAfter[i]=arrBefore[i];
        }
        for(int i=arrAfter.length-1;i<arrAfter.length;i--)
        {
            arrAfter[i]=arrAfter[i-1];
            if(i==k)
            {
                arrAfter[k]=x;
                break;
            }
        }
        System.out.println("Mang Sau Khi Chen");
        for(int i=0;i<arrAfter.length;i++)
        {
            System.out.println(arrAfter[i]);
        }

    }
    private static  void kiemTraPhanTuTrongMang()
    {
        String [] mangCuaToi = new String[]{"Toi","la","nguoi","Viet","Nam"};
        Scanner input= new Scanner(System.in);
        System.out.print("Moi Ban Nhap Chuoi Can Kiem Tra:");
        String kiTu =input.nextLine();
        boolean contains = Arrays.stream(mangCuaToi).anyMatch(kiTu::equals);
        if(contains)
        {
            System.out.print("Chuoi ban vua nhap ton tai trong mang");

        }
        else
            System.out.print("Chuoi ban vua nhap khong co trong mang");

    }
    private static  void kiemTraNhieuPhanTuBiTrung()
    {
        String [] mangCuaToi = new String[]{"Toi","Toi","la","nguoi","Viet","Nam"};
        Scanner input= new Scanner(System.in);
        System.out.print("Moi Ban Nhap Chuoi Can Kiem Tra:");
        String kiTu =input.nextLine();
        int soLanBiTrung=0;
        boolean contains = false;
        for(int i =0;i<mangCuaToi.length;i++)
        {
            contains = mangCuaToi[i].equals(kiTu);
            if(contains)
                soLanBiTrung++;
        }

            System.out.print("So lan ki tu ban nhap bi trung trong mang la " +soLanBiTrung);

    }
    private  static  void daoChieuMang()
    {
        int size; int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap so phan tu cua mang:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Mang khong duoc qua 20 phan tu"); }
        while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Moi ban nhap gia tri cac phan tu cua mang " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Cac phan tu cua mang la: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("%-20s%s", "Mang sau khi dao chieu la: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
    private  static void timGiaTriLonThuHai()
    {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int n = arr.length;
        int i, first, second;
        if (arr.length < 2) {
            System.out.print(" Khong hop le ");
            return;
        }
        first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            if (arr[i] < first && arr[i] > second) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE)
            System.out.print("Khong ton tai phan tu lon thu 2 ");
        else
            System.out.print("Phan tu lon thu 2: " + second);
    }
}
