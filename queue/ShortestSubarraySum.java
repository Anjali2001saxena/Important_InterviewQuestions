import java.util.*;

class ShortestSubarraySum {

    public static int shortestSubarray(int[] arr, int m){

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int curr = 0;
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i=0; i<arr.length; i++)
        {
            /*If queue is empty then add array element and update the sum */
            if(q.isEmpty())
            {
                q.add(arr[i]);
                sum = arr[i];
            }

            /*Add the elements until sum becomes greater than reqd sum */
            if(sum < m)
            {
                q.add(arr[i]);
                sum = sum + arr[i];
            }
            else
            {
                /*Once sum becomes greater now remove element from start until it becomes smaller */
                while(sum >= m)
                {
                    int temp = q.remove();
                    sum = sum - temp;
                }
            }

            /*Since sum becomes smaller store the size of queue + 1 i.e. size of queue when condition was fulfilled */
            curr = q.size()+1;


            if(curr < min)
            {
                min = curr;
            }
        }

        return min;
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of array : ");
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the minimum sum of the subarray for the condition to be fulfilled : ");
        int k = sc.nextInt();

        int len = shortestSubarray(a, k);

        if(len == 0)
        {
            System.out.println("There is no subarray with sum atleast equal to " + k);
        }
        else
        {
            System.out.println("Length of shortest subarray with minimum sum equal to " + k +" is " + len);
        }

        sc.close();

    }
    
    
}
