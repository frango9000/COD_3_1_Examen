package Factorial;

public class Factorial {

    public static void main(String[] args) {

        int numJ;
        int numF;

        numJ = 8;

        int numI;
        if (numJ == 0) {
            numF = 1;
        } else {
            numF = 1;
            for (numI = numJ; numI >= 1; numI--) {
                numF = numF * numI;
            }
        }

        System.out.println(numF);

    }

}
