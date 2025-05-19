package section10.LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        Song foundSong = findSong(title);
        if(foundSong == null){
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public Song findSong(String title){
        for(Song song : songs){
            if(song.getTitle().equals(title)){
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song foundSong = findSong(title);
        if(foundSong != null){
            playlist.add(foundSong);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber - 1;
        if((index >= 0 ) && (index <= this.songs.size())){
            playlist.add(this.songs.get(trackNumber));
            return true;
        }
        return false;
    }
}
