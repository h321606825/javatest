package likou.mianshi;
/*
实现一个算法，确定一个字符串 s 的所有字符是否全都不同。

示例 1：

输入: s = "leetcode"
输出: false
示例 2：

输入: s = "abc"
输出: true
限制：

0 <= len(s) <= 100
如果你不使用额外的数据结构，会很加分。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/is-unique-lcci
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。


 */
public class First {
    //模除 a 作为数组的下标，每次对对应下标做加一处理。又一个大于1的，即为false。
    public boolean isUnique(String astr) {
        int[] ch = new int[26];
        for (int i=0;i<astr.length();i++) {
            ch[astr.charAt(i)-'a'] += 1;
            System.out.println(astr.charAt(i)-'a');
            System.out.println(ch[astr.charAt(i)-'a']);
            if (ch[astr.charAt(i)-'a']>1) {
                return false;
            }
        }
        return true;
    }
}
