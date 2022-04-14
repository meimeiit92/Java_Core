package OOP.B10_Generic;

public class Main_TuDien {
    public static void main(String[] args) {
        // Xay dung tu dien tieng anh
        TuDien<String,String>[] tuDien = new TuDien[100];
        tuDien[0] = new TuDien("Hello", "XinChao");
        tuDien[1] = new TuDien<>("Bye","tam biet");

        for(TuDien item : tuDien){
            if (item == null) break;
            System.out.println(item);
        }

        ComputerANdIP c1 = new ComputerANdIP();
        c1.setK("Meimei");
        c1.setV(new String[]{"mei", "xinh"});

        System.out.println(c1);
    }
}
