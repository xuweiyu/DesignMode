package com.xwy.designmode.mode.facade;

/**
 * Created by xuweiyu on 2020-04-12.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class PlayHome {
    private DvdPlayer dvdPlayer;
    private Screen screen;
    private Sound sound;

    public PlayHome() {
        this.dvdPlayer = DvdPlayer.getInstance();
        this.screen = Screen.getInstance();
        this.sound = Sound.getInstance();
    }

    public void prepare() {
        dvdPlayer.turnOn();
        screen.turnOn();
        sound.turnOn();
    }

    public void play() {
        dvdPlayer.play();
    }

    public void end() {
        dvdPlayer.turnOff();
        screen.turnOff();
        sound.turnOff();
    }
}
