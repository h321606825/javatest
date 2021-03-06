import java.util.ArrayList;


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
 
    public TreeNode(int val) {
        this.val = val;
 
    }
 
}

public class Solution {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(pRoot==null) return result;
        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        ArrayList<Integer> start = new ArrayList<Integer>();
        start.add(pRoot.val);
        result.add(start);
        int low = 0;
        int high = 1;
        int end = high;
        queue.add(pRoot);
        while(low<high){
            TreeNode t = queue.get(low);
            if(t.left!=null){
                queue.add(t.left);
                temp.add(t.left.val);
                high++;
            }
            if(t.right!=null){
                queue.add(t.right);
                temp.add(t.right.val);
                high++;
            }
            low++;
            if(low==end){
                end = high;
                if(temp.size()!=0)
                    result.add(temp);
                temp = new ArrayList<Integer>();
            }
        }
        return result;
    }

}