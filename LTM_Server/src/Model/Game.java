/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.time.LocalTime;

public class Game implements Serializable {

    private int totalScore;
    private LocalTime time;
    private User user;

    public Game(int totalScore, LocalTime time) {
        this.totalScore = totalScore;
        this.time = time;
    }

    public Game(int totalScore, LocalTime time, User user) {
        this.totalScore = totalScore;
        this.time = time;
        this.user = user;
    }

    public Game() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
