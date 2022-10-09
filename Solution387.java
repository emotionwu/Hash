//寻找第一个不重复字符，返回其下标
public class Solution387 {
    public int firstUniqueChar(String s){
        int [] freq=new int[26];
        //存储每一个字母出现的频率
        for(int i =0;i<s.length();i++)
           freq[s.charAt(i) - 'a'] ++;
        for(int i =0; i<s.length();i++)
            if(freq[s.charAt(i)-'a'] ==1)
                return i;

            return -1;
    }
}
