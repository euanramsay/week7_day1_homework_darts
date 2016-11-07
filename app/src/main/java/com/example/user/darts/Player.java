package com.example.user.darts;

/**
 * Created by user on 07/11/2016.
 */

public class Player {

    private String name;
    private String nickname;
    private int currentRanking;

    public Player(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;

    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setCurrentRanking(int currentRanking) {
        this.currentRanking = currentRanking;
    }

    public int getCurrentRanking() {
        return currentRanking;
    }


}
