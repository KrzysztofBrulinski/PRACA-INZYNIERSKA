import java.math.BigInteger;

public class SquareAndMultiply {

    public BigInteger Exponentiation(BigInteger base, BigInteger exp, BigInteger mod) {

        Modulo m = new Modulo();

        String binaryExp = exp.toString(2);
        char ch;

        BigInteger w = BigInteger.valueOf(1);

        for (int i = 0; i < binaryExp.length(); i++) {

            w = m.mod(w.multiply(w),mod);
            ch = binaryExp.charAt(i);

            if (ch == '1') {
                w = m.mod(w.multiply(base),mod);
            }
        }

        System.out.println(w);

        return w;
    }

}