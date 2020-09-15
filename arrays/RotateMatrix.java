import java.util.*;

public class RotateMatrix {

    public static void leftrotate(int n, int[][] ar)
    {
        /*Iteration from one loop to another */
        for(int i=0; i<n/2; i++)
        {
            /*Change the positions of elements starting from corner most position */
            for(int j=i; j<n-i-1; j++)
            {
                /*Store current element in temp */
                int temp = ar[i][j];
                /*Right to top */
                ar[i][j] = ar[j][n-i-1];
                /*bottom to right */
                ar[j][n-i-1] = ar[n-i-1][n-j-1];
                /*left to bottom */
                ar[n-i-1][n-j-1] = ar[n-j-1][i];
                /*assign temp to left */
                ar[n-j-1][i] = temp;
            }
            
        }
    }


    public static void rightrotate(int n, int[][] ar)
    {
        for(int i=0; i<n/2; i++)
        {
            for(int j=i; j<n-i-1; j++)
            {
                /*Store curr element in temp */
                int temp = ar[i][j];
                /*left to top */
                ar[i][j] = ar[n-j-1][i];
                /*bottom to left */
                ar[n-j-1][i] = ar[n-i-1][n-j-1];
                /*right to bottom */
                ar[n-i-1][n-j-1] = ar[j][n-i-1];
                /*assign temp to right */
                ar[j][n-i-1] = temp;
            }
            
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows/columns of the square matrix");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        System.out.println("Enter the elements of the matrix :");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("1. Left Rotation");
        System.out.println("2. Right Rotation");
        System.out.println("Enter your choice :");
        int ch = sc.nextInt();

        if(ch == 1)
        {
            leftrotate(n, a);
        }
        else if(ch == 2)
        {
            rightrotate(n, a);
        }
        else
        {
            System.out.println("Wrong choice entered!");
        }

        System.out.println("Matrix after rotation is :");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
    
}
