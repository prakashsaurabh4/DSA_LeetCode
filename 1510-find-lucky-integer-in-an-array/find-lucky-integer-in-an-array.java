class Solution {
    public int findLucky(int[] arr) {

        int[] count = new int[501];

        for(int ele : arr) {
            count[ele]++;
        }

        for(int ele = 500; ele >= 1; ele--) {
            if(count[ele] == ele)
                return ele;
        }

        return -1;
    }
}