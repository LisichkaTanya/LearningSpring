package com.lisichka;

import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;
    private String name;
    private int volume;

    /**
     * Сделаем приватный конструктор, чтобы при создании объекта использовать factory-method
     */
    private MusicPlayer(){
    }

    /**
     * Этот метод будем использовать для создания объектов этого класса (factory-method)
     * @return возвращаем новый объект класса MusicPlayer
     */
    public static MusicPlayer getMusicPlayer() {
        return new MusicPlayer();
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }


    public void playMusic (){
        for (int i = 0; i < musicList.size(); i++){
            System.out.println(musicList.get(i).getSong());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
