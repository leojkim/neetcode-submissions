class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int right = s.length() - 1;

        System.out.println(s);

        while (left < right) {
            if (s.charAt(left) != (s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
