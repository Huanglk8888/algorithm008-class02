import java.util.*;

//49. 字母异位词分组
public class Group_anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);

            if (map.containsKey(key)) {
                map.get(key).add(strs[i]);
            } else {
                List<String> temp = new ArrayList<String>();
                temp.add(strs[i]);
                map.put(key, temp);
            }
        }
        return new ArrayList<List<String>>(map.values());
    }
}
