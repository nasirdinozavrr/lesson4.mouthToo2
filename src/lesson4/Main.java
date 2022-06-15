package lesson4;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");

        Collections.reverse(colors);
        System.out.println(colors);

        Collections.sort(colors);
        System.out.println(colors);

        Collections.shuffle(colors);
        System.out.println(colors);

        Players player1 = new Players(9, "Актан");
        Players player2 = new Players(8, "Бекжан");
        Players player3 = new Players(11, "Аман");



        ArrayList<Players> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);



    }
}