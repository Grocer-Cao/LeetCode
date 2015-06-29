package zhangxl;
/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * @author maoge
 *
 */
public class Sl_LongestCommonPrefix {
	
	/**
	 * ����Ƚϣ��ӵ�0���ַ���ʼ���Ƚ�ÿһ���ַ�����ÿһ��λ�õ��ַ��Ƿ���ȣ�֪��������һ����ƥ���
	 * @param strs
	 * @return
	 */
	 public String longestCommonPrefix(String[] strs) {
		 //������
		 String results = "" ;
		 
		 if(strs.length == 0) return "";
		 //���ݵ�һ���ַ���һ��һ���Ƚ��ַ�
		 for(int i = 0 ; i < strs[0].length() ; i++){
			 //�ӵڶ����ַ�����ʼ���һ���ַ������ַ�һ��һ���Ƚ�
			 for(int j = 1 ; j < strs.length; j++){
				//���ڵ�j���ַ����ĳ���
				if( i >= strs[j].length())
					return strs[0].substring(0, i);
				else if(strs[j].charAt(i)!=strs[0].charAt(i)) 
					 return strs[0].substring(0, i);
			 }
			 results = strs[0];
		 }
		 return results ;
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = new String[]{""};
		System.out.println(
				new Sl_LongestCommonPrefix().longestCommonPrefix(strs));
	}

}
