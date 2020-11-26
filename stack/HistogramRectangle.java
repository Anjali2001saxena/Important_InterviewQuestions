import java.util.*;

class HistogramRectangle {

    public static int maxRectangle(int[] arr){

        Stack<Integer> s = new Stack<Integer>();
        int area = 0;
        int top = 0;
        int max = 0;
        int i = 0;
        
        while(i < arr.length)
        {
            /*If stack is empty or element with position equal to top element of stack is smaller than or equal to current element then push position of element */
            if( s.empty() || arr[s.peek()] <= arr[i])
            {
                s.push(i++); 
            }
            else
            {
                /*Store the value of position at top of stack and pop it */
                top = s.peek();
                s.pop();
                
                /*Calculate area with arr[top] as smallest */
                if(s.empty())
                {
                    area = arr[top] * i;
                }
                else
                {
                    area = arr[top] * (i-s.peek()-1);
                }


                /*If current area is greater than maximum value so max will store curr area value */
                if(area >= max)
                {
                    max = area;
                }
            }

        }

        /*Now pop remaining bars and calculate area with pop bar as smallest */
        while(!(s.empty()))
        {
            top = s.peek();
            s.pop();
            if(s.empty())
            {
                area = arr[top] * i;
            }
            else
            {
                    area = arr[top] * (i-s.peek()-1);

                    if(area >= max)
                    {
                        max = area;
                    }
            }

            if(area >= max)
            {
                max = area;
            }

        }

        return max;
        
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of bars to be in histogram : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the height of bars in histogram with width each of 1 unit : ");
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }

        int max_area = maxRectangle(a);
        System.out.println("Maximum area of rectangle in histogram is " + max_area);

        sc.close();
    }
    
}
