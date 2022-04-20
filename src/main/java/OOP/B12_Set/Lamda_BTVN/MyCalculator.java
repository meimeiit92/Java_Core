package OOP.B12_Set.Lamda_BTVN;

public class MyCalculator {
    interface TinhToan {
        int countK(String str);
    }
//    public int demKiTu(String str){
//        return  str.length();
//    }
//    public int tinhSoTu (String str) {
//        int count = 0;
//        boolean notCounted = true;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) != ' ' && str.charAt(i) != '\t'
//                    && str.charAt(i) != '\n') {
//                if (notCounted) {
//                    count++;
//
//                }
//            }
//        }
//        return count;
//    }
    public  int doSomeThing(TinhToan tToan, String str ){
        return tToan.countK(str);
    }
}
