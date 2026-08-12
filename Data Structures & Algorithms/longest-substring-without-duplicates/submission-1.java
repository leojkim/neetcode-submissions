class Solution {
    public int lengthOfLongestSubstring(String s) {
        //We are dealing with duplicates, so we want to make use of a hashset
        //Since we are finding a substring of the input string, we want to make use of the sliding window algo
        
        //Start with set, left window, and max length
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;

        //Iterate through input string, and increment the right side of the window as we go
        for (int right = 0; right < s.length(); right++) {

            //Check if our set already contains the character we find on the right side of the window
            char c = s.charAt(right);
            while (set.contains(c)) {

                //If it does, we remove everything from the set up until the FIRST instance of the repeated character
                //Increment the left side of the window each time we remove a char
                set.remove(s.charAt(left));
                left++;
            }

            //Add the character from the left side of the window
            set.add(c);

            //Calculate max (we include + 1 because of each time left and right are equal at the start of a new substring)
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
