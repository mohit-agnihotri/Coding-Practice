class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false;
        }
        // return (n & (n -1)) == 0;

        while(n % 2 == 0){
            n = n / 2;
        }
        return n == 1;
    }
}