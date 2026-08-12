class Solution {
    public boolean res;

    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int entry : nums) {
            if (map.get(entry) == null) {
                map.put(entry, 1);
            }
            else {
                map.put(entry, map.get(entry) + 1);
            }
        }
        map.forEach((k, v) -> {
            if (map.get(k) > 1) {
                res = true;
            }
        });
        return res;
    }
}
