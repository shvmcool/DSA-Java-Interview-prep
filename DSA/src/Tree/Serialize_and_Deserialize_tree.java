package Tree;

public class Serialize_and_Deserialize_tree {
	    StringBuilder str = new StringBuilder();
	    private int index = 0;
	    // Encodes a tree to a single string.
	    public String serialize(TreeNode root) {
	        helperSerialize(root);
	        System.out.println(str);
	        return str.toString();
	    }
	   void helperSerialize(TreeNode root){
	        if(root == null){
	            str.append("null");
	            str.append("#");
	            return;
	        }
	            str.append(root.val);
	             str.append("#");
	        helperSerialize(root.left);
	    
	        helperSerialize(root.right);
	    }

	    // Decodes your encoded data to tree.
	    public TreeNode deserialize(String data) {
	         String[] str = data.split("#");
	     return  helperDesrialize(str);
	    }
	      TreeNode helperDesrialize(String[] str){
	          if(index == str.length -1 || str[index].equals("null")) {
	            index++;
	            return null;
	          }
	           TreeNode root = new TreeNode(Integer.parseInt(str[index]));
	           index ++;
	       root.left = helperDesrialize( str );
	       root.right = helperDesrialize(str);
	        return root;
	      }
	}
