class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int comp = target - n;
            if (map.containsKey(comp)) {
                return new int[]{map.get(comp), i};
            }
            else {
                map.put(n, i);
            }
        }
        return null;
    }
}
