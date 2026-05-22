// class Solution {
//     public void reverseString(char[] s) {
//         int n = s.length;
//         int  j = n - 1;
//         for(int i = 0 ; i < n/2 ; i++){
//             char temp = s[i];
//             s[i] = s[j];
//             s[j] = temp;
//             j--;
//         }
//     }
// }

class Solution {

    public void reverseString(char[] s) {

        int i = 0;
        int j = s.length - 1;

        while(i < j) {

            char temp = s[i];

            s[i] = s[j];

            s[j] = temp;

            i++;
            j--;
        }
    }
}