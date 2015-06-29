package zhangxl;
/**
 * Longest Palindromic Substring
 * Given a string S, find the longest palindromic substring in S. 
 * You may assume that the maximum length of S is 1000, 
 * and there exists one unique longest palindromic substring.
 * @author maoge
 *
 */
public class Solution05 {

	public String longestPalindrome(String s){
		//记录最长回文串的长度
		int maxPalinLength = 0 ;
		//最长回文串
		String longestPalinString = null ;
		int length = s.length();
		for(int i = 0 ; i < length-1 ; i++){
			for(int j = i+1 ; j< length ; j++){
				int len = j-i;
				String curr = s.substring(i,j+1);
				if(isPalindrome(curr)){
					if(len > maxPalinLength){
						longestPalinString = curr ;
						maxPalinLength = len ;					
					}
				}
			}
		}
		return longestPalinString;		
	}
	//判断是否是回文串
	public boolean isPalindrome(String s){
		for(int i = 0 ; i<s.length()/2 ; i++){
			if(s.charAt(i) != s.charAt(s.length()-1-i)){
				return false ;
			}
		}
		return true ;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "lcnvoknqgejxbfhijmxglisfzjwbtvhodwummdqeggzfczmetrdnoetmcydwddmtubcqmdjwnpzdqcdhplxtezctvgnpobnnscrmeqkwgiedhzsvskrxwfyklynkplbgefjbyhlgmkkfpwngdkvwmbdskvagkcfsidrdgwgmnqjtdbtltzwxaokrvbxqqqhljszmefsyewwggylpugmdmemvcnlugipqdjnriythsanfdxpvbatsnatmlusspqizgknabhnqayeuzflkuysqyhfxojhfponsndytvjpbzlbfzjhmwoxcbwvhnvnzwmkhjxvuszgtqhctbqsxnasnhrusodeqmzrlcsrafghbqjpyklaaqximcjmpsxpzbyxqvpexytrhwhmrkuybtvqhwxdqhsnbecpfiudaqpzsvfaywvkhargputojdxonvlprzwvrjlmvqmrlftzbytqdusgeupuofhgonqoyffhmartpcbgybshllnjaapaixdbbljvjomdrrgfeqhwffcknmcqbhvulwiwmsxntropqzefwboozphjectnudtvzzlcmeruszqxvjgikcpfclnrayokxsqxpicfkvaerljmxchwcmxhtbwitsexfqowsflgzzeynuzhtzdaixhjtnielbablmckqzcccalpuyahwowqpcskjencokprybrpmpdnswslpunohafvminfolekdleusuaeiatdqsoatputmymqvxjqpikumgmxaxidlrlfmrhpkzmnxjtvdnopcgsiedvtfkltvplfcfflmwyqffktsmpezbxlnjegdlrcubwqvhxdammpkwkycrqtegepyxtohspeasrdtinjhbesilsvffnzznltsspjwuogdyzvanalohmzrywdwqqcukjceothydlgtocukc";
		String Palindrome = new Solution05().longestPalindrome(s);
		System.out.println(Palindrome);
	}

}



