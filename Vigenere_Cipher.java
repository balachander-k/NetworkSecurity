import java.util.*;
public class Vigenere_Cipher
{
    public static void encryption_decryption(String p,String k)
    {
        char[] msg=p.toCharArray();
        int len=msg.length;
        int keylen=k.length(),j=0,i=0;
        char[] key=new char[len];
        char[] encryption=new char[len];
        char[] decryption=new char[len];
        for(j=0,i=0;i<len;i++,j++)
        {
            if(j==keylen)
            {
                j=0;
            }
            key[i]=k.charAt(j);
        }
        for(i=0;i<len;i++)
            encryption[i]=(char)(((msg[i]+key[i])%26)+'A');
        for(i=0;i<len;i++)
            decryption[i]=(char)((((encryption[i]-key[i])+26)%26)+'A');
        System.out.println("Original Message (PlainText): "+ p);
        System.out.println("Keyword "+ k);
        System.out.println("\n"+"\n"+"keyword Spliting "+ String.valueOf(key));
        System.out.println("Encryption (CipherText) :"+String.valueOf(encryption));
        System.out.println("Decryption (PlainText) :"+String.valueOf(decryption));
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the PlainText & Keyword :");
        String plaintext=obj.nextLine();
        String keyword=obj.nextLine();
        encryption_decryption(plaintext,keyword);
        
    }
}