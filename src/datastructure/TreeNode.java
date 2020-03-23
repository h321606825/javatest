package datastructure;

public class TreeNode {
    private int data;

    public TreeNode left = null;
    public TreeNode right = null;

    TreeNode(int data){
        this.data = data;
    }

    public int getData() {
        return this.data;
    }
}
