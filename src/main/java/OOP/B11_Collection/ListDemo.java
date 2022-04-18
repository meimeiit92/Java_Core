package OOP.B11_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListDemo {
    public static void main(String[] args) {
        // lam viec voi ArrayList
        // VD tao ra 1 mang luu tru String C1 tao mang thong thuong, nhuoc diem la phai truyen vao kich thuoc cua mang
        String[] arrString = new String[100];
        // Gan gia tri cho cacs phan tu
        arrString[0] = "Hello";
        arrString[1] = "Java";
        // Nhuoc diem: kich thuoc co dinh, co luc thieu co luc thua
        // C2 lam viec voi mang dong: khong can kich thuoc ban dau
        List<String> arrList = new ArrayList<>();
        // them phan tu thong qua
        arrList.add("Hello");
        arrList.add("Java");
        arrList.add("Collection");
        // cap nhat 1 phan tu: set
        arrList.set(0,"Hi");
        // xoa phan tu
        arrList.remove(0);
        // Xoa object: bine -> tham chieu object day
        String element = "Gest";
        arrList.add(element);
        arrList.remove(element);
        // Sap xep theo Alphabet neu la string, theo tu be den lon neu la so
        Collections.sort(arrList);
        // Dao nguoc arrayList
        Collections.reverse(arrList);
        // VD taoj 1 arrayList luu tru cacs so thuc, them ngau nhien 10 phan tu va sap xep
        ArrayList<Double> arrDouble = new ArrayList<>();
        for (int i=0;i<10;i++){
            arrDouble.add(new Random().nextDouble());
        }
        Collections.sort(arrDouble);

    }
}
