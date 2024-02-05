import java.util.Arrays;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = { 12, 3, 5, 7, 19 };
        int k = 3;

        int result = kthSmallest(arr, 0, arr.length - 1, k);

        System.out.println("The " + k + "th smallest element is: " + result);
    }

    public static int kthSmallest(int[] arr, int l, int r, int k) {
        Arrays.sort(arr);
        int ans = arr[0];
        int count = 1;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (count == k) {
                return ans;
            }
            if (arr[i] == arr[i + 1]) {
                continue;
            } else {
                ans = arr[i + 1];
                count++;
            }
        }
        return ans;
    }
}
