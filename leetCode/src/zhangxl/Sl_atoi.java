package zhangxl;
/**
 * ʵ���ַ���������֮���ת��
 * 
 * ���������ǵ�����������ַ�
 * 1.���ַ������߿�ָ��
 * 2.�ո�
 * 3.������
 * 4.������ʵֵ
 * 5.����Ĵ���
 * @author maoge
 *
 */
public class Sl_atoi {

	public int atoi(String str){
		//ȥ���ո�
		//str = str.replace(" ", "");
		//ȥ���ַ�����β�Ŀո�
		str = str.trim();
		//������ַ������߿�ָ��
		if(str == null || str.length()<1){
			return 0 ;
		}
		char flag = '+';
		int i = 0 ;
		if(str.charAt(0) == '-'){
			flag = '-';
			i++ ;
		}else if(str.charAt(0) == '+'){
			i++;
		}
		//ʹ��double���ʹ洢���
		double result = 0 ;
		while(str.length() > i && str.charAt(i) >= '0' && str.charAt(i)<='9'){
			result = result * 10 + (str.charAt(i) - '0');
			i++ ;
		}
		if(flag == '-'){
			result = -result ;
		}
		if(result > Integer.MAX_VALUE){
			return Integer.MAX_VALUE ;
		}
		if(result < Integer.MIN_VALUE){
			return Integer.MIN_VALUE ;
		}
		return (int)result ;
	}
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "  -123 45  " ;
		System.out.println(new Sl_atoi().atoi(string));
	}

}
