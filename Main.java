
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        System.out.println("started");
        Particle A = new Particle(3,5);
        Particle B = new Particle(5,3);
        ArrayList<Particle> particles = new ArrayList<Particle>();	
        particles.add(A);
        particles.add(B);
        for (int x = 0; x < 5; x++) {
            Interaction.computeForce(particles);
            Interaction.updatePositions(particles);
            Interaction.updateVelocities(particles);
            //Render.display(particles);
        }
	}   
}
