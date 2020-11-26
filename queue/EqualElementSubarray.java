import java.util.*;

class EqualElementSubarray {

    public static int subarray(int[] arr, int m){

        int max = 0;
        int sum = 0;
        int count = 0;
        Queue<Integer> q = new LinkedList<Integer>();

        /*Iterate through the entire array */
        for(int i=0; i<arr.length; i++)
        {
            /*If queue is empty add the array element and update the other variables accordingly */
            if(q.isEmpty())
            {
                q.add(arr[i]);
                max = arr[i];
                count++;
                continue;
            }

            /*Add element to queue and increase count to store the size of queue */
            q.add(arr[i]);
            count++;

            /*If element added is greater than max so change value of max and add the value of prev max to sum  */
            if(arr[i] > max)
            {
                sum = sum + max;
                max = arr[i];
            }
            /*Else add the element to sum of remaining elements */
            else
            {
                sum = sum + arr[i];
            }


            /*Check whether condition is fulfilled or not */
            if(((count-1)*max)-sum > m)
            {
                /*If condition not true then slide window by 1 unit by removing first element of queue */
                int temp = q.remove();
                count--;
                /*If max element was the first element of the array then find max of updated queue */
                if(max == temp)
                {
                    max = Collections.max(q); 
                    sum = sum - max;
                }
                else
                {
                    sum = sum - temp;
                }
            }

            
        }

        return count;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number of operations to be performed :");
        int k = sc.nextInt();

        int size = subarray(a, k);

        System.out.println("Maximum length subarray with equal elements after performing "+ k + " operations :" + size);

        sc.close();
    }
    
}
