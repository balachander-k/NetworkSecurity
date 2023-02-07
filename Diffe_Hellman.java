import java.util.*;
import java.math.*;
public class Diffe_Hellman
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a prime number: ");
        int q=obj.nextInt();
        System.out.print("Enter primitive root of q: ");
        int alpha=obj.nextInt();
        System.out.print("Enter the private key of Xa: ");
        int xa=obj.nextInt();
        System.out.print("Enter the private key of Xb: ");
        int xb=obj.nextInt();
        System.out.println("User A Key Generation");
        System.out.println("User A private key Xa<q "+xa+"<"+q);
        int ya=(int)Math.pow(alpha,xa)%q;
        System.out.println("User A public key: "+ya);
        System.out.println("User B Key Generation");
        System.out.println("User B private key Xb<q "+xb+"<"+q);
        int yb=(int)Math.pow(alpha,xb)%q;
        System.out.println("User A public key: "+yb);
        int ka=(int)Math.pow(yb,xa)%q;
        System.out.println("Secret key for User A:"+ka);
        int kb=(int)Math.pow(ya,xb)%q;
        System.out.println("Secret key for User B:"+kb);
        
        
    }
}