import java.util.Arrays;
class kthposition {
    public int findKRotation(int arr[]) {
        int i;
       int ar[]=new int[arr.length];
       for(int j=0;j<arr.length;j++)
       {
           ar[j]=arr[j];
       }
       Arrays.sort(ar);
       int a=ar[0];
       for(i=0;i<arr.length;i++)
       {
           if(a==arr[i])
           {
               return i;
           }
       }
       return i;
        
    }
}