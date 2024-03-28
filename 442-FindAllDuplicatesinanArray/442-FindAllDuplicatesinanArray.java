class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        boolean[] isEncountered = new boolean[nums.length];
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i< nums.length; i++){
            int num = nums[i];
            if(isEncountered[num-1]){
                result.add(num);
            } else{
                isEncountered[num-1] = true;
        return result;
            }
        }
    }
}
[
