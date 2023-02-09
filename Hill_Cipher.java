/******************************************************************************
Input  : Plaintext: ACT
         Key: GYBNQKURP
Output : Ciphertext: POH

*******************************************************************************/
import java.util.*;
public class Hill_Cipher
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		char plain[]=sc.nextLine().toCharArray();
		char key[]=sc.nextLine().toCharArray();
		int i,j,k,ind=0;
		int mat_a[][]=new int[3][3];
		int mat_b[]=new int[3];
		int mul[]=new int [3];
		for(i=0;i<3;i++)
		{
		    for(j=0;j<3;j++)
		    {
		    mat_a[i][j]=key[ind]-65;
		    ind++;
		    }
		}
			System.out.println("KEY TEXT MATRIX:");
		for(i=0;i<3;i++)
		{
		    for(j=0;j<3;j++)
		    System.out.print(mat_a[i][j]+" ");
		    System.out.println();
		}
		System.out.println("PLAIN TEXT MATRIX:");
	    for(i=0;i<3;i++)
		mat_b[i]=plain[i]-65;
		 for(i=0;i<3;i++)
		System.out.println(mat_b[i]+" ");
		for(i=0;i<3;i++)
		{
		   for(j=0;j<3;j++)
		    {
		        mul[i]=0;
		        for(k=0;k<3;k++)
		            mul[i]+=mat_a[i][k]*mat_b[k];

		    }
		}
		System.out.println("MULTIPLY MATRIX:");
		for(i=0;i<3;i++)
		    System.out.print((char)(65+(mul[i]%26))+" ");
		
	}
}