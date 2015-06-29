package zhangxl;

import zhangxl.SL_removeNthFromEnd.ListNode;

/**
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 * �ֱ������������������һ��������С˳����뵽��һ��������
 * @author maoge
 *
 */
public class SL_MergeTwoLists {
	/**
	 * ����ṹ
	 * @author maoge
	 *
	 */
	public class ListNode {
		int val ;
		ListNode next ;
		ListNode(int x){
			this.val = x ;
		}
	}
	/*
	public ListNode mergeTwoLists(ListNode l1 , ListNode l2){
		//l1��ͷָ��
		ListNode ptrL1 = l1 ;
		//l2��ͷָ��
		ListNode ptrL2 = l2 ;
		while(ptrL1 != null && ptrL2!=null){
			//ptrL1�������һ���ڵ�
			if(ptrL2.val >= ptrL1.val && ptrL1.next == null ){
				ListNode temp = ptrL1.next ;
				ptrL1.next = ptrL2 ;
				ptrL1 = temp ;
			}
			else if(ptrL2.val < ptrL1.val && ptrL1.next == null){
				//ptrL2������
				ptrL2 = ptrL2.next ;
			}
			//���L2�Ľڵ���L1�������ڵ�֮�䣬��L2����L1
			else if(ptrL2.val > ptrL1.val && ptrL2.val <= ptrL1.next.val){
				ListNode temp = ptrL1.next ;
				//������һ���ڵ�
				ListNode temp2 = ptrL2.next ;
				//����
				ptrL1.next = ptrL2 ;
				ptrL2.next = temp ;
				//��ptrL2������
				ptrL2 = temp2 ;
			}
			else if(ptrL2.val <= ptrL1.val){
				//������һ���ڵ�
				ListNode temp2 = ptrL2.next ;
				ptrL2.next = ptrL1 ;
				//��ptrL2������
				ptrL2 = temp2 ;
			}
			else {
				//ptrL1������
				ptrL1.next = ptrL1.next.next ;
			}
		}
		
		return l1 ;
	}*/
	/**
	 * �ܵ�˼·���½�һ������dummy���ֱ�������������Ƚ����ǵĴ�С����С�Ľڵ����ӵ�dummy�£�ֱ������һ������Ϊ��
	 * ���lastNode��nextָ��Ϊ�յ��Ǹ�����
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		//����ͷָ��
		ListNode dummy = new ListNode(0);
		//����ͷָ����Ϣ
		ListNode lastNode = dummy ;
		if(l1 == null) return l2 ;
		if(l2 == null) return l1 ;
		while(l1 != null && l2 != null){
			if(l1.val <l2.val){
				lastNode.next = l1 ;
				l1 = l1.next ;
			}
			else {
				lastNode.next = l2 ;
				l2 = l2.next ;
			}
			lastNode = lastNode.next ;
		}
		if(l1 != null){
			lastNode.next = l1 ;
		}else {
			lastNode.next = l2 ;
		}
		return dummy.next ;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SL_MergeTwoLists sl = new SL_MergeTwoLists(); 
		ListNode list1[] = new ListNode[5]; 
		//��ʼ������
		list1[0] = sl.new ListNode(1);
		list1[1] = sl.new ListNode(3);
		list1[2] = sl.new ListNode(5);
		list1[3] = sl.new ListNode(7);
		list1[4] = sl.new ListNode(9);
		
		//��������
		for(int i=0 ; i < 5 ; i++){
			if( 4 == i)
				list1[4].next = null ;
			else list1[i].next = list1[i+1] ;
		}
		
		ListNode list2[] = new ListNode[5]; 
		//��ʼ������
		list2[0] = sl.new ListNode(2);
		list2[1] = sl.new ListNode(4);
		list2[2] = sl.new ListNode(5);
		list2[3] = sl.new ListNode(8);
		list2[4] = sl.new ListNode(10);
		
		//��������
		for(int i=0 ; i < 5 ; i++){
			if( 4 == i)
				list2[4].next = null ;
			else list2[i].next = list2[i+1] ;
		}
		
		//�ϲ���������
		
		ListNode mMerge = sl.mergeTwoLists(list1[0], list2[0]);
		
		//�������
		
		printListNode(mMerge);
	}
	
	public static void printListNode(ListNode list){
		while(list != null){
			System.out.println(list.val);
			list = list.next ;
		}
	}

}
