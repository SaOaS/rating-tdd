package com.saoas.rating.dto;

/**
 * Created by s.ahmedouali on 17/03/2015.
 */
public class RateDTO {

    private String eName;
    private int score;
    private String comment;

    public RateDTO(String eName, int score, String comment) {
        this.eName = eName;
        this.score = score;
        this.comment = comment;
    }

    public RateDTO(String eName, String comment) {
        this.eName = eName;
        this.comment = comment;
    }

    public RateDTO(String eName, int score) {
        this.eName = eName;
        this.score = score;
    }

    public RateDTO(String eName) {
        this.eName = eName;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
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
