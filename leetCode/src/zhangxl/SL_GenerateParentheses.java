package zhangxl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * For example, given n = 3, a solution set is:
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 * 
 * ����˼·�����һ������Ϊ2n�ĺϷ����У���1��2n��λ�ö��������¹��������ŵĸ������ڵ��������ŵĸ�����
 * ������λ��k��ʣ��left�������ź�right�������ţ����left>0�������ǿ���ֱ�Ӵ�ӡ�����Ŷ���Υ�������ܷ��ӡ�����ţ�����Ҫ
 * ��֤left��right��ֵ�Ƿ�����������left>=right�����ܴ�ӡ�����ţ�������Դ�ӡ�����left��right��Ϊ0�������һ���Ϸ����������
 * @author maoge
 *
 */

public class SL_GenerateParentheses {
	public List<String> generateParenthesis(int n){
		if(n<=0) return null ;
		List<String> results = new ArrayList<String>();
		String s = new String();
		generate(n, n, s, results);
		return results ;
	}
	/**
	 * �ݹ麯����
	 * @param leftNum
	 * @param rightNum
	 * @param s
	 * @param results
	 */
	public void generate(int leftNum , int rightNum , String s ,List<String> results){
		//����ʣ������ž�Ϊ0�������кϷ��������add��list��
		if(leftNum == 0 && rightNum == 0){
			results.add(s);
		}
		//�����Ų�Ϊ0����ӡ������s+'('
		if(leftNum > 0){
			//ʣ���������-1
			generate(leftNum - 1, rightNum, s+'(', results);
		}
		//�����Ų�Ϊ0����ʣ���������С��������
		if(rightNum > 0 && leftNum < rightNum){
			generate(leftNum, rightNum-1, s+')', results);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> results = null ;
		int n = 3 ;
		results = new SL_GenerateParentheses().generateParenthesis(n);
		Iterator<String> it = results.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
