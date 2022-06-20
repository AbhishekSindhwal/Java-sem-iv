import java.util.*;
class arr{
    public static void main(String args[]){
        int ar[][]=new int[3][];
        ar[0]=new int[3];
        ar[1]=new int[4];
        ar[2]=new int[2];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<ar[i].length;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        System.out.println("Traversing : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<ar[i].length;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}