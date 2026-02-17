import java.util.Arrays;
class median {
    public double findMedian(int[] arr) {
        Arrays.sort(arr);
        int count=arr.length;
        double n;
        if(count%2==0)
        {
            count/=2;
            n=(arr[count]+arr[count-1])/2.0;
        }
        else
        {
            count/=2;
            n=arr[count];
        }
        return n;
    }
}
