package zhangxl;
/**
 * Given n non-negative integers a1, a2, ..., an,
 * where each represents a point at coordinate (i, ai). 
 * n vertical lines are drawn such that the two endpoints of line i is
 *  at (i, ai) and (i, 0). 
 * Find two lines, which together with x-axis forms a container, 
 * such that the container contains the most water.
 * �����������x������1,2,...,n���㣬����������a1,a2,...an�������������߶�֮�����x��Χ�ɵ����������ɵ�����ˮ�Ƕ��١�
 * 
 * @author maoge
 *
 */

public class Sl_maxArea {

	/**
	 * ����̰���㷨��������ָ��i,jָ����β�������֣��Ƚ����������ֵĴ�С����a[i]<a[j]��i++������j--��
	 * ���Ӷ�ΪO(n)
	 * @param height
	 * @return
	 */
	public int maxArea(int[] height){
		//��¼�������
		int max = 0 ;
		//��β����ָ��
		int i,j;
		i = 0 ;
		j = height.length - 1 ;
		while(i<j){
			//��height[i] <= height[j]ʱ
			if(height[i] <= height[j]){
				//�������
				max = Math.max(max, (j-i)*height[i]);
				i++;
			}
			//��height[i] > height[j]ʱ
			else{
				//�������
				max = Math.max(max, (j-i)*height[j]);
				j-- ;
			}
		}
		return max ;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = new int[]{1,1};
		System.out.println(new Sl_maxArea().maxArea(height));
	}

}
