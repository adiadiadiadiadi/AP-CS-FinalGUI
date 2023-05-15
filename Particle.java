public class Particle {
    private double[] position = new double[2];
    private double[] velocity = new double[2];
    private double[] acceleration = new double[2];
    private double mass;

    public Particle(double a, double b, double c, double d, double e) {
        position[0] = a;
        position[1] = b;
        velocity[0] = c;
        velocity[1] = d;
        mass = e;
    }

    public double getMass() {
        return mass;
    }

    public double[] getPosition() {
        return position;
    }

    public double[] getVelocity() {
        return velocity;
    }

    public double[] getAcceleration() {
        return acceleration;
    }

    public void setMass(double a) {
        mass = a;
    }

    public void setPosition(double[] a) {
        position = a;
    }

    public void setVelocity(double[] a) {
        velocity = a;
    }

    public void setAcceleration(double[] a) {
        acceleration = a;
    }

    public void updatePosition() {
        double[] c = {};
        position = Matrix.matrixAddRecursion(position, velocity, c); //RECURSION INSTANCE
    }

    public void updateVelocity() {
        velocity = Matrix.matrixAdd(velocity, acceleration);
    }
}
