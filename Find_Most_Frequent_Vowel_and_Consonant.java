class Solution {
    public int maxFreqSum(String s) {
        s = s.toLowerCase();
        int [] count = new int[26];

        for(char c : s.toCharArray()){
            count[c - 'a']++;
            //System.out.print(c+" ");
        }
        int maxvow = 0;
        int maxconst = 0;
        for(char c = 'a'; c <= 'z'; c++){
            int freq = count[c - 'a'];
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                maxvow = Math.max(maxvow , freq);
            }
            else{
                maxconst = Math.max(maxconst , freq);
            }
        }
        return maxvow + maxconst;
    }
}
