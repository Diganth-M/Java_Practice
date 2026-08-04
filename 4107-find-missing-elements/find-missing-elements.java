class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n+1; i++){
            for(int j=i+1; j<n; j++)
            if(nums[i]>nums[j]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        List<Integer> list = new ArrayList<>();
        int end = nums[n-1];
        int ind = 0, curr = nums[0];

        while(curr < end){
            if(nums[ind] == curr){
                curr++;
                ind++;
                continue;
            }
            else{
                while(curr < nums[ind]){
                    list.add(curr++);
                }
                ind++;
                curr++;
            }
        }
        return list;
    }
}