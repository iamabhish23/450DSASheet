class Compute 
{
    static long max(long arr[]){
        long ans = arr[0];
        for(int i =0; i<arr.length; i++){
            ans = Math.max(ans,arr[i]);
        }
        return ans;
    }
    
    static long min(long arr[]){
        long ans = arr[0];
        for(int i =0; i<arr.length; i++){
            ans = Math.min(ans,arr[i]);
        }
        return ans;
    }
    
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        return new Pair(min(a),max(a));
    }
}
