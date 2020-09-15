import java.util.*;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] ar){

        int j=0;

        /*Iterate through the array */
        for(int i=0; i<ar.length-1; i++){

            /*If next element of the array is not equal to current element store the current element */
            if(ar[i] != ar[i+1])
            {
                ar[j] = ar[i];
                j++;  
            }
        }
        /*Store the last element of the array */
        ar[j++] = ar[ar.length-1];

        return j;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }

        int k = removeDuplicates(a);

        System.out.println("Array after removing duplicate elements is : ");
        for(int i=0; i<k; i++)
        {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
    
}
