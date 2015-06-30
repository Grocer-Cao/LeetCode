package zhangxl;

import java.util.Stack;

import zhangxl.SL_SwapNodesInPairs.ListNode;

/**
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 * 
 * @author maoge
 *
 */
public class SL_reverseKGroup {
	
	public class ListNode {
		int val ;
		ListNode next ;
		ListNode(int x) {
			// TODO Auto-generated constructor stub
			val = x ;
		}
	}
	/**
	 * ����˼·��ÿ�α���k���ڵ㲢����һ��ջ�У�Ȼ���ջ��˳����Ƿ�ת���k���ڵ��˳�򣬽����γ�һ������Ȼ��ʣ�µĽڵ��ٵݹ���ô˷�����
	 * 
	 * @param head
	 * @param k
	 * @return
	 */
	public ListNode reverseKGroup(ListNode head , int k){
		ListNode dummy = new ListNode(0);
		dummy.next = head ;
		ListNode pHead = dummy ;
		Stack<ListNode> s = new Stack<SL_reverseKGroup.ListNode>();
		for(int i=0 ; i < k ; i++){
			pHead = pHead.next ;
			//������С��k
			if(pHead == null){
				s.clear();
				return dummy.next ;
			}
			//ѹջ
			else s.push(pHead);
			/*//���ȸպ�Ϊk
			if(i == k - 1 && pHead.next == null){
				
			}*/
		}
		ListNode nextStart = pHead.next ;
		//��ת
		ListNode p = dummy ;
		dummy.next = s.peek();
		while(!s.isEmpty()){
			p.next = s.peek();
			p = s.peek();
			//��ջ
			s.pop() ;			
		}
		//���ȸպ�Ϊk
		if(pHead.next == null){
			return dummy.next ;
		}
		else p.next = reverseKGroup( nextStart,k);
		return dummy.next ;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SL_reverseKGroup sl = new SL_reverseKGroup();
		ListNode list1[] = new ListNode[6]; 
		//��ʼ������
		list1[0] = sl.new ListNode(1);
		list1[1] = sl.new ListNode(2);
		list1[2] = sl.new ListNode(3);
		list1[3] = sl.new ListNode(4);
		list1[4] = sl.new ListNode(5);
		list1[5] = sl.new ListNode(6);
		
		//��������
		for(int i=0 ; i < 6 ; i++){
			if( 5 == i)
				list1[5].next = null ;
			else list1[i].next = list1[i+1] ;
		}
		
		//����
		int k = 3 ;
		ListNode result = sl.reverseKGroup(list1[0], k);
		printListNode(result);
	}
	public static void printListNode(ListNode list){
		while(list != null){
			System.out.println(list.val);
			list = list.next ;
		}
	}
}
