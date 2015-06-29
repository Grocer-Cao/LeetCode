package zhangxl;

import java.util.HashMap;

public class Solution03 {
	
	public static int lengthOfLongerstSubstring(String s){
		//��Ӵ��ĳ���
		int MaxLength = 0 ;
		//�ַ���������ָ�룬SheadΪͷָ�룬StailΪβָ��
		int Shead=0,Stail=0;
		while(Stail < s.length()-1){
			//��ȡ�Ӵ�
			Stail++ ;
			String ss = s.substring(Shead, Stail);
			//βָ������ƶ�
			String Schar = s.charAt(Stail) +"";
			if(ss.contains(Schar)){
				//�Ӵ��������ظ��ַ�
					//������ֵ���Ƚϣ�����������ֵ���������µ�ֵ�滻
					MaxLength = Math.max(MaxLength, Stail - Shead) ;
				//���ʱ��ͷָ��ָ����һ���ظ���ĸ��index+1
				int i = ss.indexOf(Schar);
				Shead = Shead + ss.indexOf(Schar) + 1;
			}
		}
		return Math.max(MaxLength, s.length() - Shead);
		/*char[] arr = s.toCharArray();
		int pre = 0 ;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0 ; i<arr.length ; i++){
			if(!map.containsKey(arr[i])){
				map.put(arr[i],i);
			}else {
				pre = Math.max(pre, map.size());
				i = map.get(arr[i]);
				map.clear();
			}
		}
		return Math.max(pre, map.size());*/
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "abcabcdbbabcdebbbbabcdefghijklmn!@#$%^&*()_+" ;
		System.out.println(lengthOfLongerstSubstring(string));
	}

}
