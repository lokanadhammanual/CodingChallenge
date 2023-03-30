package org.coding;
	// Example usage
	public class Main {
	    public static void main(String[] args) {
	        Playlist playlist = new Playlist(3);
	        playlist.addSong("S1");
	        playlist.addSong("S2");
	        playlist.addSong("S3");
	        System.out.println(playlist.getPlaylist()); // prints [S3, S2, S1]
	        playlist.addSong("S4");
	        System.out.println(playlist.getPlaylist()); // prints [S4, S2, S3]
	        playlist.addSong("S2");
	        System.out.println(playlist.getPlaylist()); // prints [S2, S4, S3]
	        playlist.addSong("S1");
	        System.out.println(playlist.getPlaylist()); // prints [S1, S2, S4]
	    }
	}

