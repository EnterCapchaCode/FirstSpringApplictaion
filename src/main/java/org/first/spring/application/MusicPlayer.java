package org.first.spring.application;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public List<Music> getMusicList() { return musicList; }
    public void setMusicList(List<Music> musicList) { this.musicList = musicList; }

    public MusicPlayer(Music music){ this.music = music; }
    public MusicPlayer() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getVolume() { return volume; }
    public void setVolume(int volume) { this.volume = volume; }

    public Music getMusic() { return music; }
    public void setMusic(Music music) { this.music = music; }

    public void playMusic(){
        System.out.println("Played: ");
        for (Music song: musicList) {
            System.out.println("Song: " + song.getSong());
        }
    }
}
