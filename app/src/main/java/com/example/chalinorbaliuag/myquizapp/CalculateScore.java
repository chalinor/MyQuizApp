package com.example.chalinorbaliuag.myquizapp;

public class CalculateScore {

    int score = 0;
    int finalScore = 0;

    public int getScore() {
        return score;
    }

    public void setScore(int num) {
        if(num == 1)
        this.finalScore = score + 1;
        else
            this.score = score;
    }

}
