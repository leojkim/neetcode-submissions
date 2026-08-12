class Solution {
    int valToFind = 0;
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }
        map.forEach((k, v) -> {
            if (map.containsValue(target - v)) {
                sol[1] = k;
                valToFind = target - v;
            }
        });
        for (int j = 0; j < nums.length; j++ ) {
            if (nums[j] == valToFind) {
                sol[0] = j;
                break;
            }
        }
        return sol;
    }
}