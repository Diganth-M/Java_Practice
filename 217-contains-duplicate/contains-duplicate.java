class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer>list = new HashSet<>();
       for(int a : nums){
        if(list.contains(a)){
            return true;
        }
        list.add(a);
        } 
    //    Set<Integer> set=new HashSet<>(list);  
    //    for(int a : set){
    //     if(Collections.frequency(list, a) >= 2) return true;
    //    }
       return false;
    }
}