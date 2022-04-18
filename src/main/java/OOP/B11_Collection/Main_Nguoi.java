package OOP.B11_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main_Nguoi {
    public static void main(String[] args) {
        ArrayList<Nguoi> arrNguoi = new ArrayList<>();
        arrNguoi.add(new Nguoi(1,"Nguyen mei1",11));
        arrNguoi.add(new Nguoi(2,"Vu Mei2", 12));
        arrNguoi.add(new Nguoi(3,"An Mei3",13));
        System.out.println(arrNguoi.toString());
        // sap xep theo ABC
        Collections.sort(arrNguoi, new Comparator<Nguoi>() {
            @Override
            public int compare(Nguoi o1, Nguoi o2) {
                // return 1 co nghia la >
                // return 0 bang nhau: khong sap xep, giu nguyen vi tri
                // return -1 tuong duong <
                if(o1.hoTen.charAt(0)< o2.hoTen.charAt(0)){
                    return -1;
                }
                else if(o1.hoTen.charAt(0) == o2.hoTen.charAt(0)){
                    return 0;
                }
                return 1;
            }
        });
        System.out.println(arrNguoi.toString());
    }
}
