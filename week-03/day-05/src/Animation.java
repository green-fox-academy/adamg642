import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Animation {
    int CLASSHEIGHT = 600;
    int CLASSWIDHT = 600;
    int classCounter = 0 ;

    public static void main(String[] args) {
        Animation gui = new Animation();
        gui.play();
    }

    public void play() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawPanel2 draw = new DrawPanel2();
        frame.getContentPane().add(draw);
        frame.setSize(CLASSWIDHT, CLASSHEIGHT);

        frame.setVisible(true);
        draw.repaint();


            for (int i = 0 ; i < 7;i++) {

                    classCounter++;
                    try {
                        Thread.sleep(1000);
                    }
                    catch (Exception e) {
                    }
                    draw.repaint();
                }

    }

    class DrawPanel2 extends JPanel {
        public void paintComponent(Graphics g) {

            trytry fractal = new trytry();
            fractal.drawSquareGrid2(g,(CLASSWIDHT/2),CLASSHEIGHT/2,300,classCounter,16.0f);

        }
    }


}
