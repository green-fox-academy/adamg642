import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a 50 long horizontal line from that point.
        // Draw 3 lines with that function. Use loop for that.
        int StartX[] = {21,250,160};
        int StartY[] = {0,300,130};
        for (int i = 0; i < StartX.length ; i++){

            drawingLINE(StartX[i],StartY[i],graphics);
        }

    }

    public static void drawingLINE (int StartX , int StartY, Graphics graphics2){
        int LONG = 50;
        if (StartX< (WIDTH/2)) {
            graphics2.drawLine(StartX, StartY, StartX + LONG, StartY);
        }
        else{
            graphics2.drawLine(StartX, StartY, StartX - LONG, StartY);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
