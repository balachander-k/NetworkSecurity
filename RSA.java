import java.util.*;
import java.math.*;
public class RSA
{
    public static int gcd(int e,int z)
    {
        if(e==0)
            return z;
        else 
            return gcd(z%e,e);
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int m,p,q,phi,e=0,d=0,n=0;
        System.out.print("Enter the number to be encrypted & decrypted");
        m=obj.nextInt();
        System.out.print("Enter the 1st prime number p: ");
        p=obj.nextInt();
        System.out.print("Enter the 2nd prime number q: ");
        q=obj.nextInt();
        n=p*q;
        System.out.println("The value of n is: "+n);
        phi=(p-1)*(q-1);
        System.out.println("The value of Phi(O) is: "+phi);
        for(int i=2;i<phi;i++)
        {
            if(gcd(i,phi)==1)
            {
                e=i;
                break;
            }
        }
        System.out.println("The Value of e is: "+e);
        for(int i=0;i<=9;i++)
        {
            int x=1+(i*phi);
            if(x%e==0)
            {
                d=x/e;
                break;
            }
        }
        System.out.println("The value of d is "+d);
        System.out.println("The public key is [e,n] = " + "["+e+","+n+"]");
        System.out.println("The private key is [d,n] = " + "["+d+","+n+"]");
        double c=(Math.pow(m,e))%n;
        System.out.println("Encrypted Message is: "+c);
        BigInteger N=BigInteger.valueOf(n);
        BigInteger C=BigDecimal.valueOf(c).toBigInteger();
        BigInteger M=(C.pow(d)).mod(N);
        System.out.println("Decrypted Message is: "+M);
    }
}