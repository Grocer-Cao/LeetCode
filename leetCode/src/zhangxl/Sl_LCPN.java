package zhangxl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Given a digit string, return all possible letter combinations that the number could represent.
 * @author maoge
 * ����һ�ŵ绰���ֺ��ַ���ӳ�������Ը�������DFS����
 */
public class Sl_LCPN {

	public List<String> letterCombinations(String digits) {
        //�洢���
		ArrayList<String> list = new ArrayList<String>();
        //PhoneNumberӳ���
		String[] sPN = {" ","","abc","def","ghi","jkl",
				"mno","pqrs","tuv","wxyz"};
    	if(digits == null){
    		return list ;
    	}
		//����DFS�ݹ麯��
    	else rec(list , digits.length(),sPN,digits,new StringBuffer());
		return list;
    }
	/**
	 * DFS�ݹ麯��
	 * @param rect ���������Ա�ʾ���ַ�����List
	 * @param length ����������ַ����ĳ���
	 * @param sPN Phone Number��ӳ���
	 * @param Digits ����������ַ���
	 * @param sb StringBuilder��
	 */
	public static void rec(ArrayList<String> rect,int length,String[] sPN , String Digits,StringBuffer sb){
		//��������ʱ����Digits String����Ϊ0
		if(length == 0){
			//�����������ַ�����ӵ�list��
			rect.add(sb.toString());
			return ;
		}
		String s = sPN[Digits.charAt(0)-'0'];
		for(int i=0;i<s.length();i++){
			//�����ֶ�Ӧ���ַ���ӵ�sb��
			sb.append(s.charAt(i));
			//�ݹ����rect
			rec(rect,length-1,sPN,Digits.substring(1),sb);
			//���ý������ָ��ֳ�
			sb.deleteCharAt(sb.length()-1);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digits = "2";
		ArrayList<String> results = (ArrayList<String>) new Sl_LCPN().letterCombinations(digits);
		Iterator it = results.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
