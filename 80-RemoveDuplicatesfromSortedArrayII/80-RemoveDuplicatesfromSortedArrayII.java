class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        Map<Integer, Integer> frequency = new HashMap<>();
        if(nums.length < 2) {
            return nums.length;
        }
        for(int i=0; i< nums.length-1; i++) {
            frequency.put(nums[i], frequency.getOrDefault(nums[i],0)+1);

            if(i < nums.length-2) { // Before second last index
                if(nums[i] != nums[i+1]) {
                    if(frequency.get(nums[i]) >=2) {
                        nums[count] = nums[i];
                        count++;
                        nums[count] = nums[i];
                        count++;
                    } else {
                        nums[count] = nums[i];
                        count++;
                    }
                }
            } else { // at second last index
                if(nums[i] != nums[i+1]) { // next element is different
                    if(frequency.get(nums[i]) >=2) {
                        nums[count] = nums[i];
                        count++;
                        nums[count] = nums[i];
                        count++;
                        nums[count] = nums[i+1];
                        count++;
                    } else {
                        nums[count] = nums[i];
                        count++;
                        nums[count] = nums[i+1];
                        count++;
                    }
                } else { // next element is same
                    frequency.put(nums[i], frequency.getOrDefault(nums[i],0)+1);
                    if(frequency.get(nums[i]) >=2) {
                        nums[count] = nums[i];
                        count++;
                        nums[count] = nums[i];
                        count++;
                    } else {
                        nums[count] = nums[i];
                        count++;
                    }
                }
            }

        }

        return count;
    }
}
