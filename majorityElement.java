class Majority
{
    static int majorityElement(int a[], int size)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        // populate the hashmap
        
        for(int i:a){
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        // check for the condition
        
        for(int i=0;i<size;i++){
            if(map.get(a[i])>size/2)
                return a[i];
        }
        return -1;
    }
}
