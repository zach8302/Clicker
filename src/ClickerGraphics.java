import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ClickerGraphics extends JPanel implements MouseListener, ActionListener {

    private int myWindowWidth = 300;
    private int myWindowHeight = 400;
    private int x;
    private int y;

    Clicker clicker1 = new Clicker();

    public ClickerGraphics () {
        JFrame myFrame = new JFrame();
        myFrame.setSize(myWindowWidth, myWindowHeight);
        myFrame.getContentPane().add(this);
        JButton clickButton = new JButton("Click Me!");
        this.add(clickButton);
        clickButton.addActionListener(this::actionPerformed);

        myFrame.setVisible(true);
        addMouseListener (this);
    }

    public void actionPerformed(ActionEvent e){
        clicker1.click();
        repaint();
    }

    public void mouseClicked(MouseEvent e) {


    }

    public void paintComponent (Graphics g) {
        g.clearRect(0,0,myWindowWidth,myWindowHeight);
        g.drawString(clicker1.numText,myWindowWidth/2,myWindowHeight/2);

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