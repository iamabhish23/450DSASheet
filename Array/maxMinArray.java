class Pair {
    long min;
    long max;

    public Pair(long min, long max) {
        this.min = min;
        this.max = max;
    }
}

public class maxMinArray {
    public static void main(String[] args) {
        long[] arr = { 12, 3, 5, 7, 19, 8 };
        int n = arr.length;

        Pair result = getMinMax(arr, n);

        System.out.println("Minimum element is: " + result.min);
        System.out.println("Maximum element is: " + result.max);
    }

    static long max(long arr[]) {
        long ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            ans = Math.max(ans, arr[i]);
        }
        return ans;
    }

    static long min(long arr[]) {
        long ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            ans = Math.min(ans, arr[i]);
        }
        return ans;
    }

    static Pair getMinMax(long a[], long n) {
        return new Pair(min(a), max(a));
    }
}
