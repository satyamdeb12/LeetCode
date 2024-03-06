                        nums[count] = nums[i];
            return nums.length;
        }
        for(int i=0; i< nums.length-1; i++) {
            frequency.put(nums[i], frequency.getOrDefault(nums[i],0)+1);

            if(i < nums.length-2) { // Before second last index
                if(nums[i] != nums[i+1]) {
                    if(frequency.get(nums[i]) >=2) {
                        nums[count] = nums[i];
                        count++;
class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        Map<Integer, Integer> frequency = new HashMap<>();
        if(nums.length < 2) {
[
