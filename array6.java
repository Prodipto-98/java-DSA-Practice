import java.util.*;
public class array6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows of 1st matrix");
        int r1=sc.nextInt();
        System.out.println("enter no of columns of 1st matrix");
        int c1=sc.nextInt();
        System.out.println("enter no of rows of 2st matrix");
        int r2=sc.nextInt();
        System.out.println("enter no of columns of 2st matrix");
        int c2=sc.nextInt();
        if(c1==r2)
        System.out.println("matrix possible");
        else
        System.out.println("matrix not possible");
        int arr1[][]=new int[r1][c1];
        int arr2[][]=new int[r2][c2];
        int arr3[][]=new int[r1][c2];
        int temp=0;
        System.out.println("enter elements for 1st matrix");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter elements for 2nd matrix");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                 temp+=(arr1[i][j]*arr2[j][i]);
                    for(int k=0;k<c2;k++)
                {
                    arr3[i][k]=temp;
                }
            }
        }
        System.out.println("the product martix is");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}