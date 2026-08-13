class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] count = new int[10];
        for (int digit : digits) {
            count[digit]++;
        }
        int[] ans = new int[900];
        int index = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 8; k += 2) {
                    if (i == j && j == k) {
                        if (count[i] < 3) {
                            continue;
                        }
                    }
                    else if (i == j) {
                        if (count[i] < 2 || count[k] < 1) {
                            continue;
                        }
                    }
                    else if (i == k) {
                        if (count[i] < 2 || count[j] < 1) {
                            continue;
                        }
                    }
                    else if (j == k) {
                        if (count[j] < 2 || count[i] < 1) {
                            continue;
                        }
                    }
                    else {
                        if (count[i] < 1 || count[j] < 1 || count[k] < 1) {
                            continue;
                        }
                    }
                    ans[index++] = i * 100 + j * 10 + k;
                }
            }
        }
        return java.util.Arrays.copyOf(ans, index);
    }
}