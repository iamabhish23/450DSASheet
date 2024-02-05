public class ReverseArray {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        String reversedString = reverseWord(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }

    
    public static String reverseWord(String str) {
        // Reverse the string str
        StringBuilder ans = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            ans.append(str.charAt(i));
        }
        return ans.toString();
    }
}
