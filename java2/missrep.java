class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> ar=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        int r=-1,m=-1;
        for(int i :arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=1;i<=arr.length;i++)
        {
            int f=map.getOrDefault(i,0);
            if(f==0)
            {
                r=i;
            }
            if(f==2)
            {
                m=i;
            }
        }
        ar.add(m);
        ar.add(r);
        return ar;
    }
}
