import java.util.*;
public class Rail_Fence_Cipher
{
    public static void encrytption_decryption(String p,int d)
    {
        int col=p.length()/d,row=d;
        char[][] enc=new char[row][col];
        char[][] dec=new char[row][col];
        int k=0,r=0;
        String cipherText="",Plaintext=" ";
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                if(k!=p.length())
                {
                    enc[j][i]=p.charAt(k++);
                }
                else 
                    enc[j][i]='X';
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                cipherText=cipherText+enc[i][j];
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                dec[i][j]=cipherText.charAt(r++);
            }
        }
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                Plaintext=Plaintext+dec[j][i];
            }
        }
        System.out.println("Ecryption: "+cipherText);
        System.out.println("Decryption: "+Plaintext);
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Plaintext & depth");
        String Plaintext=obj.nextLine();
        int depth=obj.nextInt();
        encrytption_decryption(Plaintext,depth);
    }
}