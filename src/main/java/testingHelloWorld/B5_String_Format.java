package testingHelloWorld;

import java.util.Date;

public class B5_String_Format {
    public static void main(String [] args)
    {
        // Integers
        System.out.printf("%d\n",123);
        System.out.printf("%6d\n",123);
        System.out.printf("%-6d\n",123);
        System.out.printf("%06d\n",123);
        // floats
        System.out.printf("%f\n",10.123456789);
        System.out.printf("%15f\n",10.123456789);
        // .8f la lay 8 so sau dau phay
        System.out.printf("%.8f\n",10.123456789);
        // So chu so la 9 vi tri va 4 so sau dau phay
        System.out.printf("%9.4f\n",10.123456789);

        // String
        System.out.printf("%s\n","Day la string format");
        // can ben phai
        System.out.printf("%30s\n","Day la string format");
        // can ben trai
        System.out.printf("%-30s\n","Day la string format");
        // Ngat den du 15 ki tu thoi
        System.out.printf("%.15s\n","Day la string format");

        System.out.printf("Integer: %d\n",20);

        System.out.printf("%s%s %d %s %f\n","String: OMG","Integer: ",20,"Float:",10.1234);
        // Date, time
        System.out.printf("Curent time - %tT\n", new Date());
        System.out.printf("Timestamp  - %tc\n", new Date());
        String longDate =  String.format("Today is %tA %<tB %<td , %<tY ", new Date() );
        System.out.println(longDate);
        System.out.printf ("Today is %tA %<tB %<td , %<tY ", new Date() );
        // index
        System.out.printf ("%3$10s %2$10s %1$10s","Group", "Mount", "One");
    }

}
