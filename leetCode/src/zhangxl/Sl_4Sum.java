package zhangxl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
/**
 * Given an array S of n integers, are there elements a, b, c in S 
 * such that a + b + c = 0? Find all unique triplets in the array 
 * which gives the sum of zero
 */
import java.util.List;
/**
 * ����������ȶ�������������,Ȼ�����Ҽбƣ������ظ����������Ӷ�O(n^2)
 * @author maoge
 *
 */
public class Sl_4Sum {
	public List<List<Integer>> treeSum(int[] nums,int target){
		//������
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		//������ĳ���С��4��ֱ�ӷ���null
		if(nums.length < 4) return results;
		//�������������,����ĸ��Ӷ�O(n*logn)
		Arrays.sort(nums); //����Arrays���е�sort�������õ���nums��������õ�
		
		//final int target = 0 ;
		
		//�������һ�����ݵ�ָ��
		int last = nums.length - 1 ;
		//������ĵ�һ�����ݿ�ʼ,��������3����
		for (int first = 0 ; first < last - 2 ; first++){
			for (int i = first+1 ; i < last - 1 ; i++){			
				int k = last ;
				int j = i + 1 ;
				//����nums[i]�ظ�������
				if(i > first + 1 && nums[i] == nums[i-1]) continue ;
				//�ӵ�i+1������ʼ���Ҽбƣ������ظ���������
				while(j < k){
					if(nums[first]+nums[i] + nums[j] + nums[k] < target){
						//������֮��С��target����j��1
						j++ ;
						//�����ظ�����
						while(nums[j] == nums[j - 1] && j < k)
							j++;
					}
					//������֮��С��target����k-1
					else if( nums[first]+nums[i] + nums[j] + nums[k] > target ){
						k-- ;
						//�����ظ�����
						while(nums[k] == nums[k+1] && j < k) k-- ;
					}
					else {					
						ArrayList<Integer> list = new ArrayList<Integer>() ;
						list.add(Integer.valueOf(nums[first]));
						list.add(Integer.valueOf(nums[i]));
						list.add(Integer.valueOf(nums[j]));
						list.add(Integer.valueOf(nums[k]));
						results.add(list);
						//�����ظ�����
						j++;
						k--;
						while(nums[j] == nums[j-1] && nums[k] == nums[k+1] && j<k)
							j++ ;
					}
				}
			}
		}
		//ȥ���ظ��Ĳ���
		HashSet h = new HashSet<List<Integer>>(results);
		results.clear();
		results.addAll(h);
		return results;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums = new int[]{-1,0,1,2,-1,-4,2,-3,3,6};
		int[] nums = new int[]{-1,-5,-5,-3,2,5,0,4};
		Sl_4Sum sl = new Sl_4Sum();
		List<List<Integer>> results = sl.treeSum(nums , -7);
		//ʹ�õ�������List�������
		Iterator<List<Integer>> it = results.iterator();
		while(it.hasNext()){
			List<Integer> list = it.next();
			System.out.println(list.get(0)+","+
					list.get(1)+","+list.get(2)+","+list.get(3));
		}
	}

}
