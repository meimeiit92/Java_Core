package OOP.B12_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DemoSet {
    public static void main(String[] args) {
        // tao doi tuong hashset
        HashSet<String> hashSet = new HashSet<>();
        // Set khong cho trung lap
        hashSet.add("heloo");
        hashSet.add("hi");
        hashSet.add("heloo");
        // bi trung lap nen 1 phan tu bi xoa
        // Xoa 1 ohan tu trong set
        hashSet.remove("heloo");
        // truy cap 1 phan tu
        // -> khong truy cap theo index -> can convert ve list
//        List<String> arrList = new ArrayList<>(hashSet);
//        for (int i =0; i<arrList.size();i++){
//            System.out.println(arrList.get(i));
//        }
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("heloo");
        hashSet2.add("goodbye");
        HashSet<String> copyHashSet1 = (HashSet<String>) hashSet.clone();
        // Hop union -> 2 tap hop
        copyHashSet1.addAll(hashSet2);
        System.out.println("phep cong" + copyHashSet1);

        // Giao 2 phan tu, chi gom nhung phan tu chung
        copyHashSet1 = (HashSet<String>) hashSet.clone();
        copyHashSet1.retainAll(hashSet2);
        System.out.println("pheps giao" + copyHashSet1);

        // PHeps tru
        copyHashSet1 = (HashSet<String>) hashSet.clone();
        copyHashSet1.removeAll(hashSet2);
        System.out.println("Phep tru" + copyHashSet1);

    }
}
