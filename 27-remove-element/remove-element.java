class Solution {
    public int removeElement(int[] nums, int val) {
        List <Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] != val){
                list.add(nums[i]);
            }
        }
        for(int i=0; i<list.size(); i++){
            nums[i] = list.get(i);
        }
        return list.size();
    }
}