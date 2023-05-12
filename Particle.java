public class Particle {
    private double[] position = new double[2];
    private double[] velocity = new double[2];
    private double[] acceleration = new double[2];

    public Particle(double a, double b, double c, double d) {
        position[0] = a;
        position[1] = b;
        velocity[0] = c;
        velocity[1] = d;
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
        position = Matrix.matrixAdd(position, velocity);
    }

    public void updateVelocity() {
        velocity = Matrix.matrixAdd(velocity, acceleration);
        //System.out.print(velocity[0]);
        //System.out.println(velocity[1]);
    }
}
