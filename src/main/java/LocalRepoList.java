package src.main.java;

public class LocalRepoList {
    public static String[] splitText(String text) {
        return text.split("[ ,.!?:;()\"\']+");
    }

    @Override
    public String toString() {
        return "LocalRepoList{}";
    }
}
