public class Sort012 {
    public static void main(String[] args) {
        int N = 5;
        int arr[]= {0, 2, 1, 2, 0};
        sorts012(arr, N);
        print(arr);
        
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;

    }

    public static void sorts012(int a[], int n)
    {
        // code here 
        int current = 0; 
        int high = a.length-1;
        int low = 0;
        while(current<=high){
            if(a[current]==0){
                swap(a, current, low); 
                low++;
                current++;
            }else if(a[current]==2){
                swap(a, high, current);
                high--;
            }else{
                current++;
            }
        }
    }

    public static void print(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sort012(int a[], int n)
    {
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt0 = 0;
        int j =0;

        for(int i =0; i<a.length; i++){
            if(a[i]==0){
                cnt0++;
            }else if(a[i]==1){
                cnt1++;
            }else{
                cnt2++;
            }
        }

        for(int i =0; i<cnt0; i++){
            a[j]=0;
            j++;
        }

        for(int i =0; i<cnt1; i++){
            a[j]=1;
            j++;
        }

        for(int i =0; i<cnt2; i++){
            a[j]=2;
            j++;
        }
    }
    
}
