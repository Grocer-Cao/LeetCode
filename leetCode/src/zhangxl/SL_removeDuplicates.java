package zhangxl;
/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * 
 * @author maoge
 *
 */
public class SL_removeDuplicates {
	/**
	 * ɾ�������е��ظ����֣�����ΨһԪ�صĴ�С��nums����Ҫ�仯
	 * ����˼·��
	 * 1.���鳤��Ϊ0 �� ֱ�ӷ���0��nums���鲻�仯
	 * 2.���鳤�Ȳ�Ϊ0 �� ��nums[i]==nums[i-1],�����������ֱ��nums[i]!=nums[i-1],count++,����
	 * nums[i]����nums[i-1]
	 * @param nums
	 * @return
	 */
	public int removeDupicates(int[] nums){
		int result = 0 ;
		if(nums.length < 1)
			return 0 ;
		else result ++ ;
		for(int i = 1 ; i < nums.length ; i++ ){
			/*if(i == 0)
				result++ ;*/
			if(nums[i] == nums[i-1])
				continue ;
			else if(nums[i]!=nums[i-1]) {
				nums[result] = nums[i] ;
				result ++ ;
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		int[] nums = new int[]{1,1,2,2,2,3,3,4,4,4,4} ;//{1,1,2,2,2,3,3,4,4,4,4}
		int length = new SL_removeDuplicates().removeDupicates(nums) ;
		System.out.println(length);
		for(int i = 0 ; i < length ; i ++){
			System.out.println(nums[i]);
		}
	}
}
