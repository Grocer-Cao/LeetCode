package zhangxl;

public class SL_InvertBinaryTree {
	/**
	 * �����������ݽṹ
	 * @author maoge
	 *
	 */
	  public class TreeNode {
		     public int val;
		     public TreeNode left, right;
		     public TreeNode(int val) {
		         this.val = val;
		         this.left = this.right = null;
		     }
		}
	 public TreeNode invertTree(TreeNode root){
		 if(root == null){
			 return null;
		 }
		 TreeNode temp = null;
		 //�������������Ľڵ�
		 temp = root.left ;
		 root.left = root.right ;
		 root.right = temp ;
		 
		 //�ݹ���ã������������ֱ�ת
		 invertTree(root.left);
		 invertTree(root.right);
		 return root ;
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
