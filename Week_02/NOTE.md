# 242. 有效的字母异位词
    解法思路：哈希映射
        1.首先判断两个字符串长度是否相等，不相等则直接返回 false
        2.若相等，则初始化 26 个字母哈希表，遍历字符串 s 和 t
        3.s 负责在对应位置增加，t 负责在对应位置减少
        4.如果哈希表的值都为 0，则二者是字母异位词
        
# 589. N叉树的前序遍历   
    解法思路：递归 参考二叉树遍历
    
# 49. 字母异位词分组
    解法思路：哈希映射 
        将每个字符串按照字母顺序排序，这样的话就可以把 eat，tea，ate 都映射到 aet。其他的类似。
        
# 94. 二叉树的中序遍历
    解法思路：递归
        
             