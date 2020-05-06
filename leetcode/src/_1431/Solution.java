package _1431;

import java.util.*;

/**
 * 1431. 拥有最多糖果的孩子
 * https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
 */

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        List<Boolean> list = new ArrayList<>();
        for (int candy : candies) {
            list.add(candy + extraCandies >= max);
        }
        return list;
    }
}
