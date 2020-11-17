class Leader{
    
    // This functions find the leaders in the array and returns
    // arraylist containing the leaders
    // arr: input array
    // n: size of array
    
    static ArrayList<Integer> leaders(int arr[], int n){
    
     ArrayList<Integer> res = new ArrayList<Integer>();
     res.add(arr[n-1]);
     
     //What if the array has only one element
     if(n==1)
        return res;
        
     int max = arr[n-1];
     for(int i=n-2;i>=0;i--){
         if(arr[i]>=max){
             max = arr[i];
             res.add(0,max);
         }
     }
     
     return res;
     
    }
    
}
