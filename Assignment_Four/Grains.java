
import java.math.BigInteger;

public class Grains {
    public static void main(String[] args) {
        BigInteger grainsOnCurrentSquare = BigInteger.ONE;
        BigInteger totalGrains = BigInteger.ZERO;
        for (int square = 1; square <=64; square++) {
            System.out.println("Square " + square + ": " + grainsOnCurrentSquare );
            totalGrains=totalGrains.add(grainsOnCurrentSquare);           
            grainsOnCurrentSquare = grainsOnCurrentSquare.multiply(BigInteger.TWO);
        }
        System.out.println("Total grains on 64 squares: " + totalGrains);
    }
}
