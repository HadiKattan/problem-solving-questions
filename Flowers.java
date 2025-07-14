class Flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int max = 0;

        if (flowerbed[0] == 0) {
            if (flowerbed.length > 1 && flowerbed[1] == 0) {
                max++;
                flowerbed[0] = 1;
            }
        }

        if (flowerbed.length == 1 && flowerbed[0] == 0)
            return true;

        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0 && flowerbed[i] != 1) {
                max++;
                flowerbed[i] = 1;
            }
            if (max >= n)
                return true;
        }

        if (flowerbed[flowerbed.length - 1] == 0) {
            if (flowerbed.length > 1 && flowerbed[flowerbed.length - 2] == 0)
                max++;
        }

        return max >= n;
    }
}