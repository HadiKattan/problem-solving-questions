class DifferenceBetweenTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> first = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> second = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        List<Integer> f = Arrays.stream(nums1).boxed().collect(Collectors.toList());

        for (int i = 0; i < nums2.length; i++) {
            if (first.contains(nums2[i])) {
                first.remove(Integer.valueOf(nums2[i]));
            }
        }
        result.add(new ArrayList<>(first));

        for (int i = 0; i < nums2.length; i++) {
            if (f.contains(nums2[i])) {
                second.remove(Integer.valueOf(nums2[i]));
            }
        }
        result.add(new ArrayList<>(second));
        return result;
    }
}