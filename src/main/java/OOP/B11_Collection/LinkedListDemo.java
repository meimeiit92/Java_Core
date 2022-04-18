package OOP.B11_Collection;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Mei xinh");
        linkedList.add("Lan xinh");
        System.out.println(linkedList);
        // them du lieu vao dau linked List
        linkedList.addFirst("mei xinh first");
        // it dung hon: trien khai cua danh sach lien ket don va danh sach lien ket doi trong cau truc du lieu va giai thuat
        // Khi nao nen dung Arrayist khi nao nen dung LinkedList: ve co ban 2 thang nay tuong tu nhau
        // Arrayist dungf cho danh sach dong, k can biet chinh xac so phan tu, cham hon, mang thuong xuyen them suwar xoa du lieu thi nen dung linkedList
        // linkedList trien khai danh sach lien ket doi

        System.out.println(linkedList);
    }
}
