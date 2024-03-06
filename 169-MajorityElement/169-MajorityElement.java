class Solution {
    public int majorityElement(int[] nums) {
        // Map<Integer, Integer> frequency = new HashMap<>();
        // int max = nums[0];
        // for(int i=0; i<nums.length;i++) {
        //     frequency.put(nums[i], frequency.getOrDefault(nums[i],0)+1);
        //     if(frequency.get(nums[i]) > frequency.get(max)) {
        //         max = nums[i];
        //         if(frequency.get(max) > nums.length/2) return max;
        //     }
        // }
        // return max;
    }

        Arrays.sort(nums);
        return nums[nums.length/2];
[
