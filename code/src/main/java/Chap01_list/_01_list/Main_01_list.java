package Chap01_list._01_list;

import java.util.ArrayList;
import java.util.List;

public class Main_01_list {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("World");
        list.add("KIM");

        System.out.println(list);

        list.remove("Hello");

        System.out.println(list);

        System.out.println(list.get(0));

    }
}
