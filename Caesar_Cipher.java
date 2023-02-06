import java.util.*;
public class Caesar_Cipher
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Number (1 for ENCRYPTION) & (2 for DECRYPTION) ");
        int choice=obj.nextInt(),key=0,k=0,temp=0;
        String CipherText="",PlainText="",enc="",dec="";
        if(choice==1)
        {
            System.out.println("ENCRYPTION");
            obj.nextLine();
            System.out.print("Enter PlainText Message: ");
            PlainText=obj.nextLine();
            System.out.print("Enter Shift Key Value:");
            key=obj.nextInt();
            for(int i=0;i<PlainText.length();i++)
            {
                if((int)PlainText.charAt(i)==32)
                    CipherText=CipherText+(char)32;
                else if((int)PlainText.charAt(i) + key >122)
                {
                    temp=((int)PlainText.charAt(i)+ key)-122;
                    CipherText=CipherText+(char)(96+temp);
                }
                else if((int)PlainText.charAt(i) + key >90 && (int)PlainText.charAt(i)<96)
                {
                    temp=((int)PlainText.charAt(i)+key)-90;
                    CipherText=CipherText+(char)(64+temp);
                }
                else 
                    CipherText=CipherText+(char)((int)PlainText.charAt(i)+key);
            }
            System.out.println("ENCRYPTED MESSAGE(CIPHER TEXT): "+CipherText);
            
        }
        else if(choice==2)
        {
            System.out.println("DECRYPTION");
            obj.nextLine();
            System.out.print("Enter Cipher Text: ");
            CipherText=obj.nextLine();
            System.out.print("Enter key: ");
            key=obj.nextInt();
            for(int i=0;i<CipherText.length();i++)
            {
                if((int)CipherText.charAt(i)==32)
                    PlainText=PlainText+(char)32;
                else if((int)CipherText.charAt(i)-key <97 && (int)CipherText.charAt(i)-key >90)
                {
                    temp=((int)CipherText.charAt(i)-key)+26;
                    PlainText=PlainText+(char)temp;
                }
                else if(CipherText.charAt(i)-key<65)
                {
                    temp=((int)CipherText.charAt(i)-key)-26;
                    PlainText=PlainText+(char)temp;
                }
                else 
                {
                    PlainText=PlainText+(char)((int)CipherText.charAt(i)-key);
                }
            }
            System.out.println("DECRYPTED MESSAAGE (PlainText):"+PlainText);
        }
        else 
            System.out.println("Wrong Choice");
        
    }
}