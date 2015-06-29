package zhangxl;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * @author maoge
 * ���˼·������Ž�ջ���ҷ����ж��Ƿ�ƥ�䣬ƥ��ʱ���ջ������ж�ջ�Ƿ�Ϊ�գ�Ϊ����ƥ��
 */
public class SL_ValidParentheses {
	public boolean isValid(String s){
		//����ջ���������
		Stack<Character> mStack = new Stack<Character>();
		for(int i = 0 ; i < s.length(); i++){
			//�������������
			Character c = s.charAt(i);
			if(c == '(' || c == '[' || c == '{'){
				//���������ţ�ѹջ
				mStack.push(c);
			}
			//���������ţ���ջ��Ϊ��
			else if(c == ')' && !mStack.isEmpty() && mStack.peek() == '(' ){
				//��������ƥ�䣬���ջ
				mStack.pop();
			}else if(c == ']' && !mStack.isEmpty() && mStack.peek() == '['){
				//��������ƥ�䣬���ջ
				mStack.pop();
			}else if(c == '}' && !mStack.isEmpty() && mStack.peek() == '{'){
				//��������ƥ�䣬���ջ
				mStack.pop();
			} else {
				return false ;
			}
		}
		return mStack.isEmpty() ;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "]";
		System.out.println(new SL_ValidParentheses().isValid(s));
	}

}
