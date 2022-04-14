package OOP.B10_Generic;

import java.util.Arrays;

public class ComputerANdIP extends TuDien<String, String[]>{

    public ComputerANdIP(String s, String[] strings) {
        super(s, strings);
    }

    public ComputerANdIP() {
    }

    @Override
    public String toString() {
        return String.format("Computer[%s,%s}", super.getK(), Arrays.toString(super.getV()));
    }
}
