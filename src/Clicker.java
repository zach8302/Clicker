public class Clicker {
    private int score;
    private int clickValue = 1;
    private int pointsPerSecond;

    private void click() {
        score += clickValue;
    }

    public void buy(Products p1){
        pointsPerSecond += p1.pointValue;
        clickValue += p1.clickValue;
        p1.increasePrice(); //hi
    }

}
