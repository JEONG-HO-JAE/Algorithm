import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        PG_배스트앨범 OJ= new PG_배스트앨범();
        int [] anw = OJ.solution(genres, plays);
        for(int i : anw){
            System.out.println(i);
        }
    }
}


