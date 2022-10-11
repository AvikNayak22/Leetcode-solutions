class Solution {
    HashMap<String, Boolean> mp = new HashMap<String, Boolean>();

    public boolean isScramble(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }

        if (s1.equals(s2)) {
            return true;
        }

        String copy_s1 = s1;
        String copy_s2 = s2;

        char[] temp1 = copy_s1.toCharArray();
        char[] temp2 = copy_s2.toCharArray();

        Arrays.sort(temp1);
        Arrays.sort(temp2);

        copy_s1 = new String(temp1);
        copy_s2 = new String(temp2);

        if (!copy_s1.equals(copy_s2)) {
            return false;
        }

        String key = (s1 + " " + s2);

        if (mp.containsKey(key)) {
            return mp.get(key);
        }

        int n = s1.length();

        boolean flag = false;

        for (int i = 1; i <= n - 1; i++) {
            if (
                isScramble(s1.substring(0, i), s2.substring(n - i, n)) &&
                isScramble(s1.substring(i, n), s2.substring(0, n - i)) ||
                isScramble(s1.substring(0, i), s2.substring(0, i)) &&
                isScramble(s1.substring(i, n), s2.substring(i, n))
            ) {
                flag = true;
                break;
            }
        }
        mp.put(key, flag);
        return flag;
    }
}
