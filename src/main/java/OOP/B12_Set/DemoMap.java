package OOP.B12_Set;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        // Map luu tru du lieu o dang Key - Value
        // Moi key se co 1 value duy nhat
        Map<String, String> pc_and_ip = new HashMap<>();

        // Them 1 gia tri vao hashmap
        pc_and_ip.put("PC1","192.168.1.010");
        pc_and_ip.put("PC2","192.168.1.011");

        // In ra hasshmap
        System.out.println(pc_and_ip);
        // thu them 1 key bi trung
        pc_and_ip.put("PC1","192.168.1.012");
        System.out.println(pc_and_ip);
        // Lay 1 gia tri ? neu co tra ve value, khong co thi tra ve null
        System.out.println(pc_and_ip.get("PC4"));

    }
}
