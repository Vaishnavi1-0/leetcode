class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r= 0,q =0,maxCount = 0;
        while(r < nums.length){
            if(nums[r] == 0)
            q++;

            if(q>k){
                if(nums[l]==0)
                    q--;
                l++;
            }
            if(q<=k){
                maxCount = Math.max(maxCount, r-l+1);
            }
            r++;
        }
        return maxCount;
    }
}