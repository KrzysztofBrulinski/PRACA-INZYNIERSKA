import java.math.BigInteger;

public class MontgomeryLadder {

    public BigInteger Exponentiation(BigInteger base, BigInteger exponent, BigInteger mod){

        Modulo m = new Modulo();

        BigInteger x1 = base;
        BigInteger x2 = base.multiply(base);

        BigInteger tempX1;
        BigInteger tempX2;


        String binaryExponent = exponent.toString(2);

        for(int i = 1; i < binaryExponent.length(); i++){
            if(binaryExponent.charAt(i) == '0'){
                tempX1 = m.mod(x1.multiply(x1),mod);
                tempX2 = m.mod(x1.multiply(x2),mod);
            }else{
                tempX1 = m.mod(x1.multiply(x2),mod);
                tempX2 = m.mod(x2.multiply(x2),mod);
            }
            x1 = tempX1;
            x2 = tempX2;
        }

        System.out.println(x1);

        return x1;
    }
}
