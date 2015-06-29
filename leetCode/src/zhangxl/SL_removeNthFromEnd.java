package zhangxl;

/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 * @author maoge
 * �㷨��ʹ������ָ��ֱ�ָ��ͷָ��͵�n���ڵ��ָ�룬Ȼ������ָ��ֱ�����ƶ���ֱ���ڶ���ָ�뵽βָ��Ϊֹ
 */

public class SL_removeNthFromEnd {

	public class ListNode{
		int val ;
		ListNode next ;
		
		ListNode(int x){
			val = x ;
		}
	}
	/*
	    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n <= 0) {
            return null;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode preDelete = dummy;
        for (int i = 0; i < n; i++) {
            if (head == null) {
                return null;
            }
            head = head.next;
        }
        while (head != null) {
            head = head.next;
            preDelete = preDelete.next;
        }
        preDelete.next = preDelete.next.next;
        return dummy.next;
    }
	 */
	public ListNode removeNthFromEnd(ListNode head , int n){
		ListNode NthPtr = head ; //��N���ڵ��ָ��
		ListNode pHead = new ListNode(0);  //ͷָ��
		pHead.next = head ;
		//ͨ������Ѱ�ҵ���n���ڵ��ָ��
		for(int i = 0 ; i < n ; i++){
			if(NthPtr == null){
				return head ;
			}
			NthPtr = NthPtr.next ;
		}
		//����ָ��ֱ������ƶ�
		while( NthPtr!= null ){
			pHead = pHead.next ;
			NthPtr = NthPtr.next ;
		}
		//ɾ��������n���ڵ�
		ListNode temp = pHead.next ; 
		pHead.next = pHead.next.next ;
		temp = null ;
		return head ;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SL_removeNthFromEnd sl = new SL_removeNthFromEnd();
		ListNode list[] = new ListNode[5]; 
		//��ʼ������
		for(int i = 0 ; i < 5 ; i++){
			list[i] = sl.new ListNode(i+1);
		}
		ListNode head = list[0]; 
		//��������
		for(int i=0 ; i < 4 ; i++){
			list[i].next = list[i+1] ;
			//if(i==3) list[i+1].next = null ;
		}
		sl.removeNthFromEnd(list[0], 2);
		while(head != null){
			System.out.println(head.val);
			head = head.next ;
		}
	}

}
