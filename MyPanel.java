import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class MyPanel extends JPanel{
    private Color color = Color.BLACK;
    ArrayList<Particle> particles = new ArrayList<>();
    
    MyPanel(){  
        this.setPreferredSize(new Dimension(2000,1000));
    }

    public void setParticles(ArrayList<Particle> a) {
        particles = a; 
    }
 
    public void paint(Graphics g) {
  
    Graphics2D g2D = (Graphics2D) g;

    for (Particle particle : particles) {
        //g.setColor(Color.decode(particle.getColor()));
        g2D.drawOval((int) particle.getPosition()[0], (int) particle.getPosition()[1], 10, 10);
    }
    }
}