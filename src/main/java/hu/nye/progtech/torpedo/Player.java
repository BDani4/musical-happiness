package hu.nye.progtech.torpedo;

public class Player {
    String name;
    int point = 0;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player name: " + this.name + "\t Point:" + this.point + "\n";
    }
    }
