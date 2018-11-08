import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ClickerGraphics extends JPanel implements MouseListener {

    private int myWindowWidth = 300;
    private int myWindowHeight = 400;
    private int x;
    private int y;

    public ClickerGraphics () {
        JFrame myFrame = new JFrame();
        myFrame.setSize(myWindowWidth, myWindowHeight);
        myFrame.add(this);
        myFrame.setVisible(true);
        addMouseListener (this);
    }

    public void mouseClicked (MouseEvent e) {
        x = e.getX() - 20;
        y = e.getY() - 20;
        repaint ( );
    }

    public void paintComponent (Graphics g) {
        g.setColor(Color.pink);
        g.fillOval(x,y,50,50);
    }

    public void mouseReleased (MouseEvent event) {
    }

    public void mousePressed (MouseEvent event) {
    }

    public void mouseEntered (MouseEvent event) {
    }

    public void mouseExited (MouseEvent event) {
    }

}