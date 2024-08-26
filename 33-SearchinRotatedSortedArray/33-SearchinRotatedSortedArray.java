                } else {
                    low = mid +1 ;
                }
            } 
            // Unsorted half
            else {
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } 
        }
        return -1;
    }
}
[
[4,5,6,7,0,1,2]
0
[4,5,6,7,0,1,2]
3
[1]
0
4
-1
-1
4
-1
-1
