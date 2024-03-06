class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for(int i=0; i<nums.length;i++) {
            frequency.put(nums[i], frequency.getOrDefault(nums[i],0)+1);
            if(frequency.get(nums[i]) > nums.length/2) {
                return nums[i];
            }
        }
        return -1;

    }
}
[
