/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.musiclibrary;

/**
 *
 * @author Administrator
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicLibrary {
    private final List<String> songs;

    public MusicLibrary() {
        songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
        System.out.println("Song \"" + song + "\" added to the library.");
    }

    public void removeSong(String song) {
        if (songs.remove(song)) {
            System.out.println("Song \"" + song + "\" removed from the library.");
        } else {
            System.out.println("Song \"" + song + "\" not found in the library.");
        }
    }

    // Method to play a random song
    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("The music library is empty!");
            return;
        }
        Random random = new Random();
        int index = random.nextInt(songs.size());
        String randomSong = songs.get(index);
        System.out.println("Now playing: \"" + randomSong + "\"");
    }

    // Method to display all songs
    public void displaySongs() {
        System.out.println("\nMusic Library Songs:");
        if (songs.isEmpty()) {
            System.out.println("No songs in the library.");
        } else {
            for (String song : songs) {
                System.out.println("- " + song);
            }
        }
    }

    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        myLibrary.addSong("Bohemian Rhapsody");
        myLibrary.addSong("Imagine");
        myLibrary.addSong("Billie Jean");

        myLibrary.displaySongs();

        myLibrary.playRandomSong();

        myLibrary.removeSong("Imagine");
        myLibrary.displaySongs();

        myLibrary.playRandomSong();
    }
}
