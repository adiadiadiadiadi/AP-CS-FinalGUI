import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.Date; 


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("started");

        Particle A = new Particle(100,500);
        Particle B = new Particle(500,100);
        Particle C = new Particle(200,300);
        ArrayList<Particle> particles = new ArrayList<Particle>();	
        particles.add(A);
        particles.add(B);
        //particles.add(C);

        for (int x = 0; x < 300; x++) {
            new Render(particles);
            particles = Interaction.computeForce(particles);
            Interaction.updateVelocities(particles);
            Interaction.updatePositions(particles);
            new Render(particles);
            Thread.sleep(50);
        }
	}   
}
