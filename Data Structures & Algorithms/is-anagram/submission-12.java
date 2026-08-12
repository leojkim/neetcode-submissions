class Solution {
    public boolean isAnagram(String s, String t) {
        //We can make use of an array here
        //Turn s and t into character arrays and then use native array sort
        //Compare arrays at the end

        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        
        Arrays.sort(charS);
        Arrays.sort(charT);

        //Need to use Arrays.equals here to manually override .equals, since using .equals just inherits the Object .equals
        return Arrays.equals(charS, charT);


    }
}
