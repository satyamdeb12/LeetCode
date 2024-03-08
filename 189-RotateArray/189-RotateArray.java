        if(r<len && len>1){
            int l=0;
            while( l<len ){
                nums[l] = copy[r];
                l+=1;
                r+=1;
                if(r == len){
                    if(r == 2){
                        r = r%(len-1);
                    } else {
                        r = r%(len-1) -1;
                    }
                }
            }
        }
    }
[
