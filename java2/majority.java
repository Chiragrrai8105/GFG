class majority {
    public static void  main(String[] args) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(count>(nums.length/2))
            {
                return nums[i];
            }
        }
        return 0;
    }
}