import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        
        HashSet<Integer> occurrences = new HashSet<>();
        
        for (int freq : hm.values()) {
            if (!occurrences.add(freq)) {
                return false;
            }
        }
        
        return true;
    }
}
