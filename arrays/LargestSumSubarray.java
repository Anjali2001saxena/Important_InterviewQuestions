import java.util.*;
                                            /*Kaden's Algorithm */

class LargestSumSubarray{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();   
        }

        int curr=0;
        int max = Integer.MIN_VALUE;


        for (int i = 0; i < n; i++) 
        {
            curr = curr + a[i];
            /*If sum of current subarray becomes greater than maximum sum then curr becomes max */
            if(curr > max)
            {
                max = curr;
            }
            else
            {
                /*If curr becomes negative at any point it will not contribute increasing the sum so curr sum set to 0 and maximum value that can be contributed is already stored in max  */
                if(curr < 0)
                curr =0;
            }
            
        }

        System.out.println("Subarray with the largest sum is: " + max);

        sc.close();
    }

}