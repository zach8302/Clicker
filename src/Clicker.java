import java.util.TimerTask;
import javax.swing.*;
import java.util.Timer;

public class Clicker {
    public int score;
    private int clickValue = 1;
    private int pointsPerSecond;
    public String numText = "";

    public void click() {
        score += clickValue;
        numText = score + "";
    }

    public void buy(Products p1){
        pointsPerSecond += p1.pointValue;
        clickValue += p1.clickValue;
        p1.increasePrice(); //hi
    }
    public void addPoints() {
       while (pointsPerSecond>0){
        try{
            Thread.sleep(1000);
            score+=pointsPerSecond;
        }catch(Exception e) {
        }
    }
    }

}
