package Tree;

public class Flatten_Tree_to_LinkedList {
    public void flatten(TreeNode root) {
        TreeNode[] prevarr= new TreeNode[1];
        // helper(root,prevarr);
        helperMorris(root);
    }
    public void helper(TreeNode root,TreeNode[] prevarr){
        if(root == null) return ;
         helper(root.right,prevarr);
         helper(root.left,prevarr);
        root.right =prevarr[0];
        root.left = null ;
        prevarr[0] = root;
    }
       public void helperMorris(TreeNode root){
        TreeNode cur = root;
        while(cur!=null){
         if(cur.left!=null){
            TreeNode next = cur.left;
            while(next.right!=null){
                next = next.right;
            }
            next.right = cur.right;
            cur.right = cur.left;
            cur.left = null;
         }
            cur = cur.right;
        }
    }
}
