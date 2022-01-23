package com.mycompany.exam;

public class Test {

    private String name;
    private int score;

    public Test(String name, int score) {
        this.name = name;
        this.score = score < 0 ? 0 : score; // basic check for valid score
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Test: " + name + ". Score: " + score + ".";
    }

}
