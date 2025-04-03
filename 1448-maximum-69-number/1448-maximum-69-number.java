

class Solution {
    public int maximum69Number(int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        int temp = num;
        while (temp > 0) {
            arr.add(0, temp % 10);
            temp /= 10;
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 6) {
                arr.set(i, 9);
                break;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int digit : arr) {
            ans.append(digit);
        }

        return Integer.parseInt(ans.toString());
    }
}
