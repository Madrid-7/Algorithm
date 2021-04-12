package 单词拆分;

import java.util.List;

/**
 * @author ：ZXF
 * @program: 2021_4_12
 * @description:
 * @date ：2021-04-13 01:24
 */

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.length() == 0) {
            return false;
        }
        boolean[] canBreak = new boolean[s.length() + 1];

        for (int i = 1; i <= s.length(); i++) {
            if (wordDict.contains(s.substring(0, i))) {
                canBreak[i] = true;
                continue;
            }
            for (int j = i - 1; j > 0; j--) {
                if (canBreak[j] && wordDict.contains(s.substring(j, i))) {
                    canBreak[i] = true;
                    break;
                }
            }
        }
        return canBreak[s.length()];
    }
}