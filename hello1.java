// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class hello1 {
    public static void main(String[] args) {
        int temp=0;
        int arr[]=new int[1000];
        int f;
        for(int j=2;j<100;j++)
        {
            f=0;
            for (int i = 2; i <= Math.sqrt(j); i++)
            {
                if (j % i == 0) 
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            {
                arr[temp]=j;
                temp++;
            }
        }
        for(int i=0;i<temp;i++)
            System.out.print(arr[i]+" ");

    }
}