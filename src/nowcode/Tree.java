package nowcode;

import java.util.Stack;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}

public class Tree {
    //先序遍历递归算法
    public static void preOrder(TreeNode root) {
        if(root == null)return;
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.val+" ");

    }
    //先序遍历非递归算法
    public static void preOrder2(TreeNode root) {
        if(root==null)return;
        Stack<TreeNode> q =new Stack<TreeNode>();
        q.add(root);
        while(q.isEmpty()==false) {
            TreeNode cur = q.pop();
            System.out.print(cur.val +" ");//Visit(root)
            if(cur.right!=null)q.add(cur.right);//注意是right元素先进栈
            if(cur.left!=null)q.add(cur.left);
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        //先序1 2 4 5 3 6 7
        //中序 4 2 5 1 6 3 7
        //后序4 5 2 6 7 3 1
        //       1
        //    2      3
        //  4   5  6   7
        //
        preOrder(root);
    }
}