/*Complete the Function below*/
class arraypalin {
    public static boolean isPalinArray(int[] arr) {
        
        for(int i=0;i<arr.length;i++)
        {
            int mul=0;
            int ar=arr[i];
            while(arr[i]>0)
            {
                int rem=arr[i]%10;
                mul=mul*10+rem;
                arr[i]/=10;
                
            }
            if(ar!=mul)
            {
              return false;
            }
        }
        return true;
    }
}