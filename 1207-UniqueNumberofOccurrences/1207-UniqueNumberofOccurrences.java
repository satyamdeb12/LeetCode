            occurrences.put(arr[i], occurrences.getOrDefault(arr[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: occurrences.entrySet()) {
            frequency.put(entry.getValue(),frequency.getOrDefault(entry.getValue(),0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: frequency.entrySet()) {
            if(entry.getValue() > 1) {
                return false;
            }
        }
        return true;
        for (int i = 0; i < arr.length; i++) {
        Map<Integer, Integer> frequency = new HashMap<>();
        Map<Integer, Integer> occurrences = new HashMap<>();
    public boolean uniqueOccurrences(int[] arr) {
class Solution {
[
