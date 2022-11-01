package HashSet;

import java.util.HashSet;

public class Example1 {

    public static void main(String[] args) {

        HashSet hs = new HashSet();
        hs.add("ab");
        hs.add("bc");
        hs.add("cd");
        hs.add("de");
        hs.add("ef");
        hs.add("ab");
        hs.add("cd");
        System.out.println(hs);
    }
}
