import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class MyPanel extends JPanel{
    ArrayList<Particle> particles = new ArrayList<>();
    
    MyPanel(){  
        this.setPreferredSize(new Dimension(800,800));
    }

    public void setParticles(ArrayList<Particle> a) {
        particles = a; 
    }
 
    public void paint(Graphics g) {
  
    Graphics2D g2D = (Graphics2D) g;

    for (Particle particle : particles) {
        g2D.drawOval((int) particle.getPosition()[0], (int) particle.getPosition()[1], 10, 10);
    }
    }
}