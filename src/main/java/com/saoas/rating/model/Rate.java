package com.saoas.rating.model;

/**
 * Created by s.ahmedouali on 13/03/2015.
 */
public class Rate {

    private int score;
    private String comment;

    public Rate(int score) {
        this.score = score;
    }

    public Rate(int score, String comment) {
        this.score = score;
        this.comment = comment;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
