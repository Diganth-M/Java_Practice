class Solution {
    public char findTheDifference(String s, String t) {

        int sum =0;
        for( char c : t.toCharArray()){
            sum += c - 'a';
        }

        for(char c : s.toCharArray()){
            sum -= c - 'a';
        }

        return (char)(sum + 'a');
    }
}