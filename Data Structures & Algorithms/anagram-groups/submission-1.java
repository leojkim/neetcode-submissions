class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //We want to group into buckets, meaning a hashmap may work here
        //We use a String key here for the words in sorted form
        //We use an ArrayList of Strings here to store the original word

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        //Iterate through each word
        for (String word : strs) {

            //Convert the word to a char array to sort the word into a Key word
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            //If the map doesn't have the Key sort word, we add it, and create a new ArrayList for the value
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            //Store the original word in the Value's ArrayList
            map.get(sorted).add(word);
        }

        //Return a list of the map's values, since they contain groupings of the original words
        return new ArrayList<>(map.values());
    }
}
