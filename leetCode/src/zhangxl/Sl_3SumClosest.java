package zhangxl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. 
 * Return the sum of the three integers.
 * You may assume that each input would have exactly one solution.
 * 
 * ����������ȶ�������������,Ȼ�����Ҽбƣ������ظ����������Ӷ�O(n^2)
 * @author maoge
 *
 */
public class Sl_3SumClosest {
	public int threeSum(int[] nums , int target){
		//������
		int results = 0;
		//������ĳ���С��3��ֱ�ӷ���null
		//if(nums.length < 3) return results;
		//�������������,����ĸ��Ӷ�O(n*logn)
		Arrays.sort(nums); //����Arrays���е�sort�������õ���nums��������õ�		
		
		//��target֮�����Сֵ����ʼ��ΪInt�͵����ֵ
		int Min = Integer.MAX_VALUE; 
		
		for(int i=0;i<nums.length;i++){
			int j = i + 1 ;
			int k = nums.length - 1 ;
			while(j < k){
				//3����֮��
				int sums = nums[i] + nums[j] + nums[k] ;
				int gap = Math.abs(sums - target);
				if(gap < Min){
					results = sums ;
					Min = gap ;
				}
				if(sums < target) j++ ;
				else k--;
			}
		}
		return results;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{0,2,1,-3};
		Sl_3SumClosest sl = new Sl_3SumClosest();
		int target = 1 ;
		int results = sl.threeSum(nums, target);
		System.out.println(results);
		
	}

}
