package com.erkuai.dailyalgorithm.leetcode_easy;

import java.util.HashSet;

/**
 * Created by Administrator on 2019/12/10 15:15.
 */

public class No443 {

    //给定一组字符，使用原地算法将其压缩。
//
// 压缩后的长度必须始终小于或等于原数组长度。
//
// 数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
//
// 在完成原地修改输入数组后，返回数组的新长度。
//
//
//
// 进阶：
//你能否仅使用O(1) 空间解决问题？
//
//
//
// 示例 1：
//
//
//输入：
//["a","a","b","b","c","c","c"]
//
//输出：
//返回6，输入数组的前6个字符应该是：["a","2","b","2","c","3"]
//
//说明：
//"aa"被"a2"替代。"bb"被"b2"替代。"ccc"被"c3"替代。
//
//
// 示例 2：
//
//
//输入：
//["a"]
//
//输出：
//返回1，输入数组的前1个字符应该是：["a"]
//
//说明：
//没有任何字符串被替代。
//
//
// 示例 3：
//
//
//输入：
//["a","b","b","b","b","b","b","b","b","b","b","b","b"]
//
//输出：
//返回4，输入数组的前4个字符应该是：["a","b","1","2"]。
//
//说明：
//由于字符"a"不重复，所以不会被压缩。"bbbbbbbbbbbb"被“b12”替代。
//注意每个数字在数组中都有它自己的位置。
//
//
// 注意：
//
//
// 所有字符都有一个ASCII值在[35, 126]区间内。
// 1 <= len(chars) <= 1000。
//
// Related Topics 字符串


    //leetcode submit region begin(Prohibit modification and deletion)
//
//    此题要求使用原地算法求解,即将压缩结果存在原chars[]数组中.
//
//    使用双指针即可求解此题.这里我们称由相同字符组成的字符串为相同字符序列.
//
//            指针t指示已压缩的结果的末尾,指针i指示未压缩字符串的开头.
//
//            遇到相同的字符,指针i便向后滑动,直到遇到不同字符.指针i滑动的距离即为相同字符序列的长度.

    class Solution {
        public int compress(char[] chars) {
            int t=0;//设置指针
            int i=0;
            while (i <chars.length && t<chars.length) {//遍历字符串
                chars[t++]=chars[i];//取相同字符序列的首字符存下
                int temp=i;//记录相同字符序列首元素位置
                while (i<chars.length &&chars[i]==chars[t-1])
                    i++;//i指针滑动到相同字符序列末尾的下一个位置
                if(i-temp>1){//若相同字符序列长度大于1
                    for(char c:String.valueOf(i-temp).toCharArray()){//向结果中加入相同字符序列的长度的字符形式
                        chars[t++]=c;
                    }
                }
            }
            return t;//t即为已压缩的结果的长度

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
