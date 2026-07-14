class Solution {
    public int search(int[] nums, int target) {
        int exsist=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                exsist=i;
            }

        }
        return exsist;
    }
}