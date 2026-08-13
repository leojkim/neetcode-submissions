class Solution {
    public int search(int[] nums, int target) {
        //Since this is a binary search, we can think of breaking this into left and right segments as we go
         int left = 0;
         int right = nums.length - 1;

        //Iterative till left is == to or > than right
         while (left <= right) {

            //Find midpoint between left and right
            //We need to add left each time to account for the portion of the array we've already ruled out
            int mid = left + (right - left)/2;

            //Found the target at the midpoint
            if (nums[mid] == target) {
                return mid;
            }

            //Midpoint is less than target, so we bring left up
            else if (nums[mid] < target) {
                left = mid + 1;
            }

            //Midpoint is greater than target, so we bring right down
            else {
                right = mid - 1;
            }

         }

         //Not found
         return -1;
    }
}
