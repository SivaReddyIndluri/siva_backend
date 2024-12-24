package strings;

import java.util.HashMap;
import java.util.Map;

public class StringCharCount {
	
	public void m1() {
		String str = "java developer";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char ch : str.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		map.entrySet();
		System.out.println("no of each charecter:" +map);
	}
	public static void main(String[] args) {
		StringCharCount ss = new StringCharCount();
		ss.m1();
	}

}
