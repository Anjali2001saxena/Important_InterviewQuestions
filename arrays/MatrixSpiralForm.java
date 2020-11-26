import java.util.*;

class MatrixSpiralForm {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of matrix : ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns of matrix : ");
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        int i, k=0, l=0;

        /*Loop between the extreme coordinates of matrix until all squares are covered */
        while(k<r && l<c){
            /*Print first row from remaining rows */
            for(i=l; i<c; i++)
            {
                System.out.print(a[k][i] + " ");
            }
            k++;
            /*Print the last column from the remaining columns*/
            for(i=k; i<r; i++)
            {
                System.out.print(a[i][c-1] + " ");
            }
            c--;
            /*Print last row from remaining rows */
            if(k<r)
            {
                for(i=c-1; i>=0; i--)
                {
                    System.out.print(a[r-1][i] + " ");
                }
                r--;
            }
            /*Print the first column from the remaining columns*/
            if(l<c)
            {
                for (i = r - 1; i >= k; i--) 
                {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }

        sc.close();
    }
    
};
