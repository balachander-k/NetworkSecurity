import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
public class MD5 
{
    public static String md5(String i)
    {
        String m=null;
        if(null==i)
            return null;
        try{
            MessageDigest digest=MessageDigest.getInstance("MD5");
            digest.update(i.getBytes(),0,i.length());
            m=new BigInteger(1,digest.digest()).toString(16);
        }
        catch(NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        return m;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        System.out.print("MD5 hexadecimal hash code is"+md5(a));
    }
    
}
