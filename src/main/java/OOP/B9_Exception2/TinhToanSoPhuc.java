package OOP.B9_Exception2;

import java.util.List;

public class TinhToanSoPhuc extends SoPhuc implements ISoPhuc{
    public static TinhToanSoPhuc tinhToanSoPhuc = null;

    public TinhToanSoPhuc() {
        super();
    }

    public synchronized static TinhToanSoPhuc getInstance() {
        if (tinhToanSoPhuc == null) tinhToanSoPhuc = new TinhToanSoPhuc();
        return tinhToanSoPhuc;
    }
    @Override
    public SoPhuc congSoPhuc(SoPhuc... args) {
        if (args.length == 0) return null;
        SoPhuc tmp = new SoPhuc(args[0].getPhanThuc(), args[0].getPhanAo());
        for (int i = 1; i < args.length; i++) {
            tmp.congSP(args[i]);
        }
        tmp.hienThi();
        return tmp;
    }

    @Override
    public SoPhuc truSoPhuc(SoPhuc... args) {
        if (args.length == 0) return null;
        SoPhuc tmp = new SoPhuc(args[0].getPhanThuc(), args[0].getPhanAo());
        for (int i = 1; i < args.length; i++) {
            tmp.truSP(args[i]);
        }
        tmp.hienThi();
        return tmp;
    }

    @Override
    public SoPhuc nhanSoPhuc(SoPhuc... args) {
        if (args.length == 0) return null;
        SoPhuc tmp = new SoPhuc(args[0].getPhanThuc(), args[0].getPhanAo());
        for (int i = 1; i < args.length; i++) {
            tmp.nhanSP(args[i]);
        }
        tmp.hienThi();
        return tmp;
    }

    @Override
    public SoPhuc chiaSoPhuc(SoPhuc... args) {
        if (args.length == 0) return null;
        SoPhuc tmp = new SoPhuc(args[0].getPhanThuc(), args[0].getPhanAo());
        for (int i = 1; i < args.length; i++) {
            tmp.chiaSP(args[i]);
        }
        tmp.hienThi();
        return tmp;
    }
}
