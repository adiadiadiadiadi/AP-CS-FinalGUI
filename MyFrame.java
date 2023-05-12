import javax.swing.*;
import java.util.ArrayList;


public class MyFrame extends JFrame{
    MyPanel panel;

    MyFrame(ArrayList<Particle> a) {
        panel = new MyPanel();
        panel.setParticles(a);
    
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }  

    public void updatePanel(ArrayList<Particle> a) {
        panel.setParticles(a);
        panel.revalidate();
        this.repaint();
    }
}
//Thank you to Amelia for helping me out with jframe!!!
//Figured out this setup from https://www.youtube.com/watch?v=KcEvHq8Pqs0