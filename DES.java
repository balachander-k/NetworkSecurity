import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class DES 
{
    public static void main(String[] arg)
    {
        try{
            System.out.println("Message Encryption using DES Algorithm");
            KeyGenerator k=KeyGenerator.getInstance("DES");
            SecretKey m=k.generateKey();
            Cipher desCipher;
            desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            desCipher.init(Cipher.ENCRYPT_MODE,m);
            byte[] text="Secret Information".getBytes();
            System.out.println("Message[Byte Format] :"+text);
            System.out.println("Message: "+new String(text));
            byte[] textenc=desCipher.doFinal(text);
            System.out.println("Encrypted Message:"+textenc);
            desCipher.init(Cipher.DECRYPT_MODE,m);
            byte[] textdec=desCipher.doFinal(textenc);
            System.out.println("Decrypted Message :"+new String(textdec));
        }
        catch(NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        catch(NoSuchPaddingException e)
        {
            e.printStackTrace();
        }
        catch(InvalidKeyException e)
        {
            e.printStackTrace();
        }
        catch(IllegalBlockSizeException e)
        {
            e.printStackTrace();
        }
        catch(BadPaddingException e)
        {
            e.printStackTrace();
        }
    }
}