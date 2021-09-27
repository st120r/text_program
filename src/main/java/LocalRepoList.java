package src.main.java;

import java.util.ArrayList;

public class LocalRepoList {

    private static ArrayList list = new ArrayList();

    public static ArrayList splitText(String text) {
        for (String s : text.split("[ ,.!?:;()\"\']+")) {
            if (!list.contains(s)) {
                list.add(s);
            }
        }
        return list;
    }
}