class Solution {
    public int compress(char[] chars) {
        int count = 1;
        if(chars.length == 1){
            return 1;
        }
       StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < chars.length - 1; i++){
            if(chars[i] == chars[i+1]){
                count++;
            }else {
                if(count == 1){
                    str.append(chars[i]);
                    count = 1;
                } else{
                    str.append(chars[i]+""+ count);
                    count = 1 ;
                }
            }
        }
        if(count == 1){
            str.append(chars[chars.length - 1]);
        }else{
            str.append(chars[chars.length - 1]).append(count);
        }
        
        char[] ans = str.toString().toCharArray();
        for(int i = 0 ; i < ans.length ; i++){
            chars[i] = ans[i];
        }
        return ans.length ;
    }
}