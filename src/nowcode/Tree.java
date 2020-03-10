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
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);

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
    //递归中序遍历二叉树
    void binaryTreeInOrder(TreeNode root){
        if(root==null){
            return;
        }
        binaryTreeInOrder(root.left);
        System.out.print(root.val+" ");
        binaryTreeInOrder(root.right);
    }

    //二叉树的中序遍历非递归
    void binaryTreeInOrderNonR(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode node = null;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            node = stack.pop();
            System.out.print(node.val+" ");
            cur = node.right;
        }
    }

    //后序递归遍历二叉树
    void binaryTreeLastOrder(TreeNode root){
        if(root==null){
            return;
        }
        binaryTreeLastOrder(root.left);
        binaryTreeLastOrder(root.right);
        System.out.print(root.val+" ");
    }

    //二叉树的后序遍历非递归
    void binaryTreePostOrderNonR(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            //左边都入栈
            cur = stack.peek();//最左子树
            //cur.right == prev 代表的是 cur的右边已经打印过了
            if(cur.right == null || cur.right == prev) {
                stack.pop();
                System.out.print(cur.val+" ");
                prev = cur;
                cur = null;
            }else {
                cur = cur.right;
            }
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