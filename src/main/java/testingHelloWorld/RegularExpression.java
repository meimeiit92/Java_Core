package testingHelloWorld;

import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args)
    {

        formatString();
    }
    private static void doiTen()
    {
        String olderName = "ngUyen   vAn    ung";
        System.out.println("ngUyen   vAn    ung".replaceAll("\\s+"," "));
        String [] newName= olderName.split("\\s+");
        System.out.println(Arrays.asList(newName) );
        for(int i =0;i<newName.length;i++)
        {
            newName[i] =newName[i].substring(0,1).toUpperCase(Locale.ROOT)+newName[i].substring(1).toLowerCase();
        }
        System.out.println(Arrays.asList(newName) );
        System.out.println(String.join( " ",newName));
    }
    private static void formatString ()
    {
        // Tao khoang trang truoc so duong de co the can chinh so duong va so am
        System.out.printf("% d\n",-111);
        System.out.printf("% d\n",111);
        System.out.printf("% d\n",-222);
        System.out.printf("% d\n",222);
        System.out.printf("%3d|\n",12);
        //Format them dau + vao truoc so duong nhung so am khong bi anh huong
        System.out.printf("%+d\n",111);
        System.out.printf("%+d\n",-111);
        // Dat cac gia tri so am ben trong dau ngoac, so duong se khong bi anh huong
        System.out.printf("%(d\n",-111);
        System.out.printf("%(d\n",111);
        //Dung dau phay de tach so
        System.out.printf("%, d\n",100000000);
        System.out.printf("%, .3f\n",659154831658734.2467);
        //Them dau tru de can trai
        System.out.printf("|%-12.3f|\n",1234.1234);
        System.out.printf("|%12.3f|\n",1234.1234);
        //In ra 12 phan tu va 2 phan tu thap phan
        System.out.printf("%12.2e\n",1234.1234567);//output 1.23e+03=1.23 x 10^3
        System.out.printf("%12.2E\n",1234.1234);
        //Lấy 4 số 123.1
        System.out.printf("%.4g\n",123.12345678);
        // lấy 15 ksi tự trong 1 string
        System.out.printf("%.15s\n","1iaqhfiwh23fh12nakdhefhihe345678");
        // format 10 số
        System.out.printf("%010d\n",88 );
    }

}
