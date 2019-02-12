// Author: Rafael Castaneda
//Project Title: OvalDrawPlus
//Favorite Color:Orange(Blue not Available)


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Container;
import java.awt.Color;

class Oval extends JPanel {
    Oval() {

    }

        public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        
        //g.fillRect(1,1,200,200);

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        Color rectColor = new Color(0,0,204);
        g.setColor(rectColor);
        g.fillRect(0,0,panelWidth,panelHeight);

        Color myColor = new Color(255,102,0);
        g.setColor(myColor);
        g.fillOval(0,0,panelWidth, panelHeight);
    }
}


class OvalFrame extends JFrame {
    OvalFrame() {
        setTitle("OvalDraw");
        setBounds(300,300,400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Oval myOval = new Oval();
        Container contentPane = getContentPane();
        contentPane.add(myOval);

    }
}

public class OvalDraw {
    public static void main(String[] args) {
        System.out.println("OvalDraw Starting...");


        OvalFrame myFrame = new OvalFrame();
        myFrame.setVisible(true);
    }
}