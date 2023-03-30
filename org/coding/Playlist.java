package org.coding;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
	private int capacity;
    private List<String> songs;

    public Playlist(int capacity) {
        this.capacity = capacity;
        this.songs = new ArrayList<String>();
    }

    public void addSong(String song) {
        if (this.songs.contains(song)) {
           
            this.songs.remove(song);
            this.songs.add(0, song);
        } else {
           
            this.songs.add(0, song);
            
            if (this.songs.size() > this.capacity) {
                this.songs.remove(this.capacity);
            }
        }
    }

    public List<String> getPlaylist() {
        return this.songs;
    }

public static void main(String[] args) {
    Playlist playlist = new Playlist(3);
    playlist.addSong("S1");
    playlist.addSong("S2");
    playlist.addSong("S3");
    System.out.println(playlist.getPlaylist()); 
    playlist.addSong("S4");
    System.out.println(playlist.getPlaylist()); 
    playlist.addSong("S2");
    System.out.println(playlist.getPlaylist()); 
    playlist.addSong("S1");
    System.out.println(playlist.getPlaylist()); 
}
}



