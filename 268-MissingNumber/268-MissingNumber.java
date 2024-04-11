
    while(start<end) {
      if(nums[mid] == mid){
        start = mid+1;
      } else{
        end = mid;
      }
      mid = start + (end-start)/2;
    }

    return mid;
    }
}
    int mid = start + (end-start)/2;
    int end = nums.length;
    int start = 0;
[
