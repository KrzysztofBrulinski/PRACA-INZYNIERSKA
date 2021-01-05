import java.math.BigInteger;

public class SlidingWindowMethod {

    public BigInteger[] PreComputation(int k, BigInteger base, BigInteger mod){

        Modulo m = new Modulo();

        int maxExp = (int) Math.pow(2,k) - 1;
        BigInteger tab[] = new BigInteger[maxExp+1];

        while(maxExp > 0){
            tab[maxExp] = m.mod(base.pow(maxExp), mod);
            maxExp -= 2;
        }
        
        return tab;
    }

    public BigInteger Exponentiation(BigInteger base, BigInteger exponent, BigInteger mod) {

        Modulo m = new Modulo();

        // Count window size => k
        int k = 0;
        int kSize = 0;
        String binaryExponent = exponent.toString(2);
        int l = binaryExponent.length();
        BigInteger y = new BigInteger("1");


        while(l > kSize){
            k++;
            kSize = (int) ((k * (k+1) * Math.pow(2,2*k)) / (Math.pow(2,k+1)-k-2));
        }

        // get precomputed values
        BigInteger[] precomputedValues = PreComputation(k,base,mod);

        int i = 0,s,max,u;

        while (i<l){
            if(binaryExponent.charAt(i) == '0'){
                y = m.mod(y.pow(2),mod);
                i++;
            }else {
                s = l-1;

                max = i+k-1;
                if(max < l){
                    s = max;
                }

                while(binaryExponent.charAt(s) == '0'){
                    s--;
                }

                for(int h = 1; h <= s-i+1; h++){
                    y = m.mod(y.pow(2),mod);
                }

                u = Integer.parseInt(binaryExponent.substring(i, s+1),2) ;
                y = m.mod(y.multiply(precomputedValues[u]),mod);
                i = s+1;
            }
        }

        System.out.println(y);

        return y;
    }

}


