import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.Date; 


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("started");

        Particle A = new Particle(100,100, 0, 0);
        Particle B = new Particle(500,500, 0, 0);
        Particle C = new Particle(200,300, 0, 0);
        ArrayList<Particle> particles = new ArrayList<Particle>();	
        particles.add(A);
        particles.add(B);
        //particles.add(C);
        MyFrame frame = new MyFrame(particles);

        for (int x = 0; x < 8000; x++) {
            particles = Interaction.computeForce(particles);
            Interaction.updateVelocities(particles);
            Interaction.updatePositions(particles);

            frame.updatePanel(particles);
            Thread.sleep(4);
        }
	}   
}
