class minmax {
    int[] getMoreAndLess(int[] arr, int target) {
        int countless = 0;
        int countbig = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= target) {
                countless++;
            }
            if (arr[i] >= target) {
                countbig++;
            }
        }

        return new int[] {countless, countbig};
    }
}