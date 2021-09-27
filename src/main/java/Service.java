package src.main.java;

import java.util.Scanner;

public class Service {

    public void scanner() {
        System.out.println("Input a text");
        Scanner in = new Scanner(System.in);
        System.out.println(LocalRepoList.splitText(in.nextLine()));
    }
}
