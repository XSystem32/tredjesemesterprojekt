package model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int id;
    private List<String> castels = new ArrayList<>();

    public Player(int id, List<String> castels) {
        this.id = id;
        this.castels = castels;
    }

    public Player() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getCastels() {
        return castels;
    }

    public void setCastels(List<String> castels) {
        this.castels = castels;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", castels=" + castels +
                '}';
    }
}
