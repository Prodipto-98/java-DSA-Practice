import java.util.*;
public class array5{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the matrix elements");
        int arr[][]=new int[3][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the matrix is");
        for(int i=0;i<arr[0].length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<arr[0].length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(i<j)//< = lower triangular,> =upper triangular, = gives diagonal element
                arr[i][j]=0;
            }
        }
        System.out.println("the matrix after lower triangular is");
        for(int i=0;i<arr[0].length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}