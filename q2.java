class Solution {
    int count = 0;
    public int solution(Tree T) {
        // write your code in Java SE 8
        test(T.x,T,T.x);
        return count;
    }

    public void test(int value,Tree current, int root){
        if(current == null){
            return;
        }
        int currentvalue = current.x;
        if(currentvalue>= root){
            count++;
        }
        test(currentvalue,current.l,root);
        test(currentvalue,current.r,root);
    }
}
