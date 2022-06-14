import clases.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();
        while (n-- > 0) {
            String input = scanner.nextLine();
            String[] songInfo = input.split("_");
            Song song = new Song(songInfo[0], songInfo[1], songInfo[2]);
            songs.add(song);

        }
        String typeList = scanner.nextLine();

        printList(songs, typeList);
    }

    private static void printList(List<Song> songs, String typeList) {
        for (Song song : songs) {
            if (song.getTypeList().equals(typeList) || typeList.equals("all")) {
                System.out.println(song.getName());
            }
        }
    }
}
