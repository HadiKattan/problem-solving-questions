class UniqueNumOfOccurences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0 ; i < arr.length; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                m.put(arr[i], 0);
            }
        }

        Set<Integer> s = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            s.add(entry.getValue());
        }
        return m.size() == s.size();
    }
}