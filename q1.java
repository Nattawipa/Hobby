import java.util.Arrays;

class Solution {
    public int solution(int N) {
            String answer = "";

        // write your code in Java SE 8
        if(N > 0)
        {
            //Convert an integer to an array of digits
            //Ref: https://stackoverflow.com/questions/8033550/convert-an-integer-to-an-array-of-digits
            String temp = Integer.toString(N);
            String temp2;
            int temp3;
            int [] newGuess = new int[temp.length()];
            for(int i = 0 ; i < temp.length() ; i++) 
            {
                if (i!=temp.length()) 
                {
                    temp2 = temp.substring(i, i+1);
                } 
                else 
                {
                    temp2 = temp.substring(i);
                }
                temp3 =  Integer.parseInt(temp2);
                newGuess[i] = temp3;
            }

            Arrays.sort(newGuess);
            
            for(int i = newGuess.length-1 ; i >= 0 ; i--) 
            {
                answer = answer + newGuess[i];
            }
        }
        return Integer.parseInt(answer);
    }
}
