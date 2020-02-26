package mianshi;

public class SwapTree {
    public static void main(String args[]) {
        Node root = buildTree();
        System.out.println("反转之前==============");
        inOrderVisit(root);
        ExchangeLeftRight(root);
        System.out.println();
        System.out.println("反转之后==============");
        inOrderVisit(root);
    }

    class Node {

        int data = 0;
        Node left = null;
        Node right = null;
    }

    public static Node buildTree() {
        SwapTree s = new SwapTree();
        Node root = s.new Node();
        root.data = 1;

        Node temp = s.new Node();
        temp.data = 2;
        root.left = temp;

        temp = s.new Node();
        temp.data = 3;
        root.right = temp;

        temp = s.new Node();
        temp.data = 4;
        root.right.right = temp;

        temp = s.new Node();
        temp.data = 5;
        root.left.right = temp;

        temp = s.new Node();
        temp.data = 6;
        root.left.right.right = temp;

        return root;
    }

    public static void inOrderVisit(Node root) {
        if (root == null)
            return;
        inOrderVisit(root.left);
        System.out.print(root.data);
        inOrderVisit(root.right);
    }

    public static void ExchangeLeftRight(Node node) {
        if (node == null)//节点为空 则返回
            return;
        if (node.left == null && node.right == null) {

        } else {//交换左右孩子
            Node temp = node.left;
            node.left = node.right;
            node.right = temp;
        }

        ExchangeLeftRight(node.right);//对右子树进行交换操作

    }
}