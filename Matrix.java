import java.util.Arrays;

public class Matrix {
    public static double[] matrixAdd(double[] a, double[] b) {
        double[] additionMatrix = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            additionMatrix[i] = (double) a[i] + (double) b[i];
        }
        return additionMatrix;
    }

    //RECURSION
    public static double[] matrixAddRecursion(double[] a, double[] b, double[] output) {
              
        // Base case: if all elements have been processed, return the result
        if (output.length >= a.length) {
            return output;
        }
        double sum = a[output.length] + b[output.length];
        double[] arr = Arrays.copyOf(output, output.length + 1);
        arr[arr.length - 1] = sum; 
        
        return matrixAddRecursion(a, b, arr);
    }

    public static double[] matrixSubtract(double[] a, double[] b) {
        double[] subtractionMatrix = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            subtractionMatrix[i] = (double) a[i] - (double) b[i];
        }
        return subtractionMatrix;
    }

    public static double[] force(double[] d, double m2) {
        double[] forceMatrix = new double[d.length];
        if (Math.abs(d[0]) < 10 && Math.abs(d[1]) < 10) {;
          return null;
        }
        for (int i = 0; i < d.length; i++) {
            forceMatrix[i] = (-10*m2/(((double) d[i])*Math.abs((double) d[i])));
        }
        return forceMatrix;
    }

    
}
