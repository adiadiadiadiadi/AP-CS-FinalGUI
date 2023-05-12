import java.util.ArrayList;

public class Interaction {
    public static ArrayList<Particle> computeForce(ArrayList<Particle> particles) {
        ArrayList<Particle> newParticles = new ArrayList<Particle>();
        for (int i = 0; i < particles.size(); i++) {
            double[] totalForce = new double[2];
            for (int j = 0; j < particles.size(); j++) {
                if (i==j) {continue;}
                double[] distance = Matrix.matrixSubtract(particles.get(i).getPosition(), particles.get(j).getPosition());
                
                if (Matrix.force(distance, particles.get(j).getMass())==null) {
                    //collision code if it gets too close
                    double[] v1 = particles.get(i).getVelocity();
                    double[] v2 = particles.get(j).getVelocity();
                    double[] avgV = Matrix.matrixAdd(v1, v2);
                    double combinedMass = particles.get(i).getMass() + particles.get(j).getMass();
                    avgV[0] /= combinedMass;
                    avgV[1] /= combinedMass;
                    
                    particles.add(new Particle(particles.get(i).getPosition()[0], particles.get(i).getPosition()[1], avgV[0], avgV[1], combinedMass));
                    if (i < j) {
                        particles.remove(particles.get(i));
                        particles.remove(particles.get(j-1));
                    }
                    else {
                        particles.remove(particles.get(i-1));
                        particles.remove(particles.get(j));
                    }
                    System.out.println("collided");
                    break;
                }
                else {
                    totalForce = Matrix.matrixAdd(totalForce, Matrix.force(distance, particles.get(j).getMass()));
                }

            }
            particles.get(i).setAcceleration(totalForce);
            newParticles.add(particles.get(i));
        }
        return newParticles;
    }

    public static void updateVelocities(ArrayList<Particle> particles) {
        for (Particle particle : particles) {
            particle.updateVelocity();
        }
    }

    public static void updatePositions(ArrayList<Particle> particles) {
        for (Particle particle : particles) {
            particle.updatePosition();
        }
    }
}
