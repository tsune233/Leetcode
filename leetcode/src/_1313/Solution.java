package _1313;

import java.util.ArrayList;
import java.util.List;

/**
 * 1313. 解压缩编码列表
 * https://leetcode-cn.com/problems/decompress-run-length-encoded-list/
 */

public class Solution {
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i+=2) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i + 1]);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
