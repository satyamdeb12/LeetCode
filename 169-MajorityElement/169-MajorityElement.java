class Solution {
    public int majorityElement(int[] nums) {
        // SOLUTION 1
        // Map<Integer, Integer> frequency = new HashMap<>();
        // for(int i=0; i<nums.length;i++) {
        //     frequency.put(nums[i], frequency.getOrDefault(nums[i],0)+1);
        //     if(frequency.get(nums[i]) > nums.length/2) {
        //         return nums[i];
        //     }
        // }
        // return -1;


        // SOLUTION 2
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
