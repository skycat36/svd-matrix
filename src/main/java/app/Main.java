package app;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SingularValueDecomposition;

public class Main {
    public static void main(String... args){
        RealMatrix A = new Array2DRowRealMatrix(
                new double[][] {new double[] {1, 2, 3}, new double[] {4, 5, 6}});

        double[] x = new double[3];
        x[0] = Math.random();
        x[1] = Math.random();
        x[2] = Math.random();

        double[] u = new double[2];
        double[] v = new double[3];

        SingularValueDecomposition svdA = new SingularValueDecomposition(A);
        System.out.println("test");
    }
}
