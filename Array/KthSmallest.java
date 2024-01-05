class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        Arrays.sort(arr);
        int ans = arr[0];
        int count =1;
        for(int i =0; i<arr.length-1; i++){
            if(count == k){
                return ans;
            }
            if(arr[i]==arr[i+1]){
                continue;
            }else{
                ans = arr[i+1];
                count++;
            }
            
        }
        return ans;
    } 
}
