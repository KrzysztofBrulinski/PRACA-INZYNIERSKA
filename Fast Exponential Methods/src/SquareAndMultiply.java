import java.math.BigInteger;

public class SquareAndMultiply {

    public BigInteger Exponentiation(BigInteger base, BigInteger exp, BigInteger mod) {

        Modulo m = new Modulo();

        String binaryExp = exp.toString(2);


        int licznik = 0;
        char ch;

        BigInteger w = BigInteger.valueOf(1);
        BigInteger p = base;


        for (long i = binaryExp.length(); i > 0; i--) {


            w = m.mod(w.multiply(w),mod);
            ch = binaryExp.charAt(licznik);

            if (ch == '1') {

                w = m.mod(w.multiply(p),mod);

            }

            if (licznik < binaryExp.length()) licznik++;
        }


        System.out.println(w);

        return w;
    }
//
//    public void SimpleExponentiation(int base, int wykladnik) {
//
//
//        BigInteger p = BigInteger.valueOf(base);
//        BigInteger w = BigInteger.valueOf(1);
//
//        for (int i = 0; i < wykladnik; i++){
//            w = w.multiply(p);
//
//        }
//
//
//        System.out.println(base + "^" + wykladnik + " = " + w);
//
//
//    }

}