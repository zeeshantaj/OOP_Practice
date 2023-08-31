package org.example;

import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {

    ArrayList<song> songsArrayList = new ArrayList<>();

    public ArrayList<song> getSong(){
        return songsArrayList;
    }

    public void addSong(song songs){
        songsArrayList.add(songs);
    }
    public void removeSong(song songs){
        songsArrayList.remove(songs);
    }

    public void playRandomSong(){
        int size = songsArrayList.size();
        if (size == 0){
            System.out.println("no song in the library");
            return;
        }
        Random random = new Random();
        int index = random.nextInt(size);
        System.out.println("Now playing: " + songsArrayList.get(index).getSongName() + " by " + songsArrayList.get(index).getArtistName());
    }

    public static void main(String[] args) {

        MusicLibrary library = new MusicLibrary();

        library.addSong(new song("Midnight Train to Georgia", "Gladys Knight & the Pips"));
        library.addSong(new song("Stairway to Heaven", "Led Zeppelin"));
        library.addSong(new song("Imagine", "John Lennon"));
        library.addSong(new song("All by Myself", "Eric Carmen"));
        library.addSong(new song("What'd I Say", "Ray Charles"));
        library.addSong(new song("Walking in Memphis", "Marc Cohn"));
        library.addSong(new song("In the Air Tonight", "Phil Collins"));

        System.out.println("All songs:");
        for (song song: library.getSong()) {
            System.out.println(song.getSongName() + " by " + song.getArtistName());
        }
        System.out.println("\n**Playing Random Song**");
        library.playRandomSong();
        System.out.println();
        library.playRandomSong();
        System.out.println();
        library.playRandomSong();

    }
}
class song{
    String songName,artistName;

    public song(String songName,String artistName){
        this.songName = songName;
        this.artistName = artistName;
    }
    public String getSongName(){
        return songName;
    }
    public String getArtistName(){
        return songName;
    }
}
