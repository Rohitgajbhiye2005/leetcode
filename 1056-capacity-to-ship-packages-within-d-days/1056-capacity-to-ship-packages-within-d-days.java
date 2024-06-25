class Solution {
 public int shipWithinDays(int[] weights, int days) {
    int sum = 0;
    int max = 0;
    int ans = 0;
    for (int i = 0; i < weights.length; i++) {
        sum += weights[i];
        max = Math.max(max, weights[i]);
    }
    if (weights.length == days) {
        return max;
    }

    int l = max;
    int r = sum;
    while (l <= r) {
        int mid = l + (r - l) / 2;

        if (findPackage(weights, mid, days)) {
            ans = mid;
            r = mid - 1;
        } else {
            l = mid + 1;
        }
    }

    return ans;
}

public boolean findPackage(int[] weights, int mid, int days) {
    int d = 1;
    int sum = 0;

    for (int i = 0; i < weights.length; i++) {
        sum += weights[i];
        if (sum > mid) {
            d++;
            sum = weights[i];
        }
    }

    return d <= days;
}
}