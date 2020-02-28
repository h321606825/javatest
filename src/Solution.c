


    //二叉树结点结构
struct TreeNode {
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
    TreeNode(int x) :
            val(x), left(NULL), right(NULL) {
    }
};
class Solution {
public:
    TreeNode* Convert(struct TreeNode* pRootOfTree)
    {
        TreeNode* pNode = NULL;
        _BST2List(pRootOfTree,&pNode);
         TreeNode* pHead = pNode;
        while (pHead!=NULL&&pHead->left!=NULL)
            pHead = pHead->left;
        return pHead;
    }
    void _BST2List(TreeNode* pRoot, TreeNode**pRev)
    {
        if (NULL == pRoot)
            return;
        TreeNode*pCur=pRoot;
        if(pCur->left!=NULL)//递归左子树
            _BST2List(pCur->left,pRev);
        pCur->left=*pRev;
        if(*pRev!=NULL)
            (*pRev)->right=pCur;
        *pRev=pCur;
        if(pCur->right!=NULL)
            _BST2List(pCur->right,pRev);
    }
};
