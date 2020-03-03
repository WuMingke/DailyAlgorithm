package com.erkuai.dailyalgorithm.leetcode_easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No811 {
    //一个网站域名，如"discuss.leetcode.com"，包含了多个子域名。作为顶级域名，常用的有"com"，下一级则有"leetcode.com"，最
//低的一级为"discuss.leetcode.com"。当我们访问域名"discuss.leetcode.com"时，也同时访问了其父域名"leetcode.com"以及顶级域名 "com"。
//
// 给定一个带访问次数和域名的组合，要求分别计算每个域名被访问的次数。其格式为访问次数+空格+地址，例如："9001 discuss.leetcode.com
//"。
//
// 接下来会给出一组访问次数和域名组合的列表cpdomains 。要求解析出所有域名的访问次数，输出格式和输入格式相同，不限定先后顺序。
//
//
//示例 1:
//输入:
//["9001 discuss.leetcode.com"]
//输出:
//["9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"]
//说明:
//例子中仅包含一个网站域名："discuss.leetcode.com"。按照前文假设，子域名"leetcode.com"和"com"都会被访问，所以它们都被
//访问了9001次。
//
//
//
//示例 2
//输入:
//["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
//输出:
//["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 i
//ntel.mail.com","951 com"]
//说明:
//按照假设，会访问"google.mail.com" 900次，"yahoo.com" 50次，"intel.mail.com" 1次，"wiki.org"
//5次。
//而对于父域名，会访问"mail.com" 900+1 = 901次，"com" 900 + 50 + 1 = 951次，和 "org" 5 次。
//
//
// 注意事项：
//
//
// cpdomains 的长度小于 100。
// 每个域名的长度小于100。
// 每个域名地址包含一个或两个"."符号。
// 输入中任意一个域名的访问次数都小于10000。
//
// Related Topics 哈希表

    /**
     * 对于包含一个 . 的域名 x.y，我们需要统计的是 x.y 和 y；对于包含
     * 两个 . 的域名 a.b.c，我们需要统计的是 a.b.c，b.c 和 c。
     * 在统计这些字符串时，我们可以使用哈希映射（HashMap）。
     * 统计结束之后，我们遍历哈希映射并输出结果。
     */

    /**
     * 不懂？
     */
    class Solution {
        public List<String> subdomainVisits(String[] cpdomains) {
            //存储对应的字符串和出现的次数
            Map<String, Integer> counts = new HashMap();
            for (String domain : cpdomains) {
                //将cpdomains分成了次数和域名info[0]是次数，info[1]是域名
                String[] cpinfo = domain.split(" ");
                //将域名按照“.”分开
                String[] frags = cpinfo[1].split("\\.");
                int count = Integer.valueOf(cpinfo[0]);
                String cur = "";
                for (int i = frags.length - 1; i >= 0; --i) {
                    cur = frags[i] + (i < frags.length - 1 ? "." : "") + cur;
                    counts.put(cur, counts.getOrDefault(cur, 0) + count);
                }
            }

            List<String> ans = new ArrayList();
            for (String dom : counts.keySet())
                ans.add("" + counts.get(dom) + " " + dom);
            return ans;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
