import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.Objects;

public class Record {
    private int score;
    private String player;

    public Record(String player, int score) {
        this.score=score;
        this.player=player;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Record{" +
                "score=" + score +
                ", player='" + player + "/" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return score == record.score && Objects.equals(player, record.player);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, player);
    }
}