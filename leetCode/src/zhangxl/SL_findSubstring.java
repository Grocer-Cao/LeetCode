package zhangxl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * You are given a string, s, and a list of words, words, that are all of the same length. 
 * Find all starting indices of substring(s) in s that is a concatenation of each word in words
 * @author XLZhang
 *
 */
public class SL_findSubstring {
	public List<Integer> findSubstring(String s,String[] words){
		List<Integer> res = new ArrayList<Integer>();
		if(s == null || s.length() == 0 || words == null || words.length == 0){
			return res ;
		}
		//word�ĳ���,ÿ�����ʳ�����ͬ
		int len = words[0].length();
		//words�п��ܰ��������ͬ�ĵ��ʣ�����value��ʾ���ʵĸ���
		Map<String , Integer> map = new HashMap<String ,Integer>();
		for(int i = 0 ; i < words.length ; i++){
			if(map.containsKey(words[i])){
				//�����������
				map.put(words[i], map.get(words[i])+1);
			} else {
				//����Ψһ
				map.put(words[i], 1);
			}
		}
		HashMap<String , Integer> MapTemp = new HashMap<String, Integer>() ;
		MapTemp.putAll(map);
 		for(int i = 0 ; i <= s.length() - words.length * len ; i++){
			int from = i ;
			String str = s.substring(from , from + len);
			int cnt = 0 ;
			while(MapTemp.containsKey(str) && MapTemp.get(str) > 0){
				MapTemp.put(str, MapTemp.get(str) - 1) ;
				cnt++ ;
				from = from + len ;
				if(from + len > s.length()) break ;
				str = s.substring(from, from+len);
			}
			//�ҵ�һ�����
			if(cnt == words.length){
				res.add(i);
			}
			//Ϊ��һ�����¸�ֵ
			MapTemp.putAll(map);
		}
		
		
		return res ;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "barfoothefoobarman";
		String[] words = new String[]{"foo","bar"};
		List<Integer> results = new SL_findSubstring().findSubstring(s, words);
		Iterator it = results.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
