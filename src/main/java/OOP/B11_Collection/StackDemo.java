package OOP.B11_Collection;

import java.util.Collections;
import java.util.Stack;

public class StackDemo {
    public  static  void pushToMyStack(String s, Stack<String> stack){
        if(stack.size()==4){
            stack.remove(0);
            stack.push(s);
        }
    }
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // them vao tren cung cua stack
        stack.push("mei");
        stack.push("mei 2");
        stack.push("mei3");
        stack.push("mei 4");
        // de luu 5 phep tinh -> them tren cung danh sach -> loai bo gia tri dau tien
      pushToMyStack("mei 6",stack);
        pushToMyStack("mei 7",stack);
        System.out.println(stack);
    }
}
