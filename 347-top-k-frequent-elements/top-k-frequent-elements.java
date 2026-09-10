class Pair implements Comparable<Pair> {
    int ele;
    int freq;

    Pair(int ele, int freq) {
        this.ele = ele;
        this.freq = freq;
    }

    public int compareTo(Pair p) {
        if (this.freq == p.freq)
            return this.ele - p.ele;

        return this.freq - p.freq;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        // Min heap
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int key : map.keySet()) {
            int freq = map.get(key);

            pq.add(new Pair(key, freq));

            if (pq.size() > k) {
                pq.remove();
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        while (pq.size() > 0) {
            Pair top = pq.remove();
            ans.add(top.ele);
        }

        Collections.reverse(ans);
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}
