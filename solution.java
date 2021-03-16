//returns the smallest positive integer (greater than 0) that does not occur in A

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        
        Arrays.sort(A);
       
        for(int i = 0; i < A.length; i++)
        {
             System.out.println(A[i]);
            if (A[i] > 0)
            {
                if (i == A.length-1)
                {
                    return A[i]+1;
                }
                if(A[i+1] == A[i])
                { 
                    continue;
                }
                if(A[i+1] != A[i]+1)
                {
                   return A[i]+1;
                }
                
            }
        }
        return 1;
    }
}
