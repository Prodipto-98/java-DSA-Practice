import java.util.*;
public class array4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the vallue of matrix");
        int arr[][]=new int[3][3];
        int trans[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                trans[j][i]=arr[i][j];
            }
        }
        System.out.println("original matrix");
         for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }
        System.out.println("transpose matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(trans[i][j]+" "); 
            }
            System.out.println();
        }
    }
}