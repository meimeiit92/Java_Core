package testingHelloWorld;

public class B2_VongLap {
    public static void main(String[] args)
    {
        
    }
    private static int soLeNhoNhat()
    {
        int soChanNhoNhat =0;
        int[] mang = {5,4,2,5,3};
        int min ;
        int dem= 0;
        for (int i=0; i<mang.length ; i++)
        {
            if (mang[i]%2 !=0)
            {
                min = mang[i];
                dem ++;
                break;
            }
        }
        if (dem ==0)
        {
            return 0;

        }

        return  soChanNhoNhat;
    }

}
