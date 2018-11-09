import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ClickerGraphics extends JPanel implements MouseListener {

    private int myWindowWidth = 300;
    private int myWindowHeight = 400;
    private int x;
    private int y;

    Clicker clicker1 = new Clicker();

    public ClickerGraphics () {
        JFrame myFrame = new JFrame();
        myFrame.setSize(myWindowWidth, myWindowHeight);
        myFrame.add(this);
        JButton clickButton = new JButton("Click Me!");
        this.add(clickButton);
        clickButton.addActionListener(this::actionPerformed);

        myFrame.setVisible(true);
        addMouseListener (this);
    }

    public void actionPerformed(ActionEvent e){
        clicker1.click();
        System.out.println(clicker1.score);
    }

    public void mouseClicked(MouseEvent e) {


    }

    public void paintComponent (Graphics g) {

    }

    public void mouseReleased (MouseEvent event) {
    }

    public void mousePressed (MouseEvent event) {
    }

    public void mouseEntered (MouseEvent event) {
    }

    public void mouseExited (MouseEvent event) {
    }

    public void callClick(Clicker c1){
        c1.click();
    }

}