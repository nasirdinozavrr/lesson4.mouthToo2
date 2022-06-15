package homeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println(listA.add(scanner1.nextLine()));
        }

        ArrayList<String> listB = new ArrayList<>();
        Scanner scanner2 = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println(listB.add(scanner2.nextLine()));
        }

        ArrayList<String> listC = new ArrayList<>();
        Collections.reverse(listB);
        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }

        listC.sort(Comparator.comparing(String::length));
        System.out.println(listC);

    }
}
