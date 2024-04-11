    Arrays.sort(nums);
    int start = 0;
    int end = nums.length;
    int mid = start + (end-start)/2;

    while(start<end) {
      if(nums[mid] == mid){
        start = mid+1;
      } else{
        end = mid;
      }
      mid = start + (end-start)/2;
    }

    public int missingNumber(int[] nums) {
class Solution {
[
