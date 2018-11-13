import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ClickerGraphics extends JPanel implements MouseListener{

    private int myWindowWidth = 300;
    private int myWindowHeight = 400;
    private int x;
    private int y;

    Clicker clicker1 = new Clicker();
    Products clickUpdgrade = new Products(0,1,10,0);

    public ClickerGraphics () {
        JFrame myFrame = new JFrame();
        myFrame.setSize(myWindowWidth, myWindowHeight);
        myFrame.getContentPane().add(this);

        JButton shopButton = new JButton("Shop!");
        this.add(shopButton);
        shopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame myFrame = new JFrame();
                JPanel panel = new JPanel();
                myFrame.setSize(myWindowWidth, myWindowHeight);
                myFrame.getContentPane().add(panel);
                myFrame.setVisible(true);
                JButton buyButton = new JButton("Buy!");
                panel.add(buyButton);
                buyButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        clicker1.buy(clickUpdgrade);
                    }
                    }
                );
            }
        });

        myFrame.setVisible(true);
        addMouseListener (this);


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
        clicker1.click();
        repaint();
    }

    public void mouseEntered (MouseEvent event) {
    }

    public void mouseExited (MouseEvent event) {
    }


}