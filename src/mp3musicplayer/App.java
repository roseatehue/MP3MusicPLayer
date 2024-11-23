
package mp3musicplayer;


import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                LaunchPage launch= new LaunchPage();


             Song song = new Song("src/assets/Wind Riders - Asher Fulero.mp3");
            System.out.println(song.getSongTitle());
             System.out.println(song.getSongArtist());
            }
        });
    }
}
//REFERENCE:TapTap(14.3K subscribers)-ASMR Programming - MP3 Music Player App - Java Beginner Project Tutorial


