        // return rev;
        long reverse = 0;
        while(x!=0) {
            reverse = (reverse*10)+(x%10);
            x /=10;
        }
        if((reverse>2147483647) || (reverse<-2147483648)) {
            return 0;
        }
        return (int) reverse;
    }
}
        // }
        //     x /=10;
1
