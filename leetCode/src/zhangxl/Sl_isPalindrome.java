package zhangxl;
/**
 * �ж�һ�������Ƿ��ǻ��Ĵ�����ʹ�ö���Ŀռ�
 * @author maoge
 * 
 */
public class Sl_isPalindrome {

	/**
	 * ת�����ַ�����ʹ�õ�����Ŀռ䣬������
	 * ���з�ת���ܻ�������������
	 * @param x
	 * @return
	 */
	public boolean isPalindrome(int x){
		if(x < 0){
			return false ;
		}
		//��¼���������λ��
		int len = 1 ;
		while(x / len >= 10){
			len = len * 10 ;
		}
		while(x != 0){
			//���λ
			int left = x / len ;
			//���λ
			int right = x % 10 ;
			//�ж��Ƿ����
			if(left != right){
				return false ;
			}
			//ȥ�����λ�����λ
			x = (x%len) / 10 ;
			//
			len = len / 100 ;
		}
		return true ;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 12321 ;
		System.out.println(new Sl_isPalindrome().isPalindrome(x));
	}

}
