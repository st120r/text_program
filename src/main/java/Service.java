package src.main.java;

import java.util.Arrays;
import java.util.Scanner;

public class Service {

    private String scan() {
        System.out.println("Input a command");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public void scanner() {
        System.out.println("");
        System.out.println(Arrays.toString( LocalRepoList.splitText(scan())));
    }
}
