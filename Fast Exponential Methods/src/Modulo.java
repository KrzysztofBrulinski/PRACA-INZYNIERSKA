import java.math.BigInteger;

public class Modulo {

    BigInteger mod(BigInteger a, BigInteger p){

        BigInteger result = new BigInteger("0");

        switch (a.compareTo(p)){

            // a > p
            case 1:
                BigInteger div = a.divide(p);
                result = a.subtract(div.multiply(p));
                break;
            // a < p
            case -1:
                result = a;
                break;

        }
        return result;
    }

}
