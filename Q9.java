import java.util.*;
class arr{
    public static void main(String args[]){
        int m=3,n=3;
        int ar[][]=new int[m][n];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        System.out.println("Traversing : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter key to search : ");
        int key=sc.nextInt();
        boolean flag=false;
         for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(key==ar[i][j]){
                    System.out.println("Key found.");
                    flag=true;
                    break;
                }
            }
        }
        if(!flag){
            System.out.println("Key not found.");
        }
    }
}