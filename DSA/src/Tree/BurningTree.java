package Tree;
import java.util.*;
public class BurningTree {

//https://www.geeksforgeeks.org/problems/burning-tree/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=burning-tree
	
	class Node {
	    int data;
	    Node left;
	    Node right;

	    Node(int data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}  

	class Solution {
	    public static int minTime(Node root, int target) {
	        // code here
	        Node StartNodeAddress = null;
	        Map<Node,Node> map = new HashMap<>();
	        Queue<Node> queue = new LinkedList<>();
	        queue.offer(root);
	        while(!queue.isEmpty()){
	            Node node = queue.poll();
	            if(node.data == target){
	                StartNodeAddress = node;
	            }
	            if(node.left!=null){
	                    map.put(node.left , node);
	                    queue.offer(node.left);
	            }
	            if(node.right != null){
	                   map.put(node.right , node); 
	                   queue.offer(node.right);
	            }
	        
	        }
	       return Solution.helper(map,StartNodeAddress);
	    }
	    
	    public static int helper(Map<Node, Node> Upwardlinks, Node target){
	        Queue<Node> queue = new LinkedList<>();
	        queue.offer(target);
	        int time = 0;
	        Set<Node> visited = new HashSet<>();
	        visited.add(target);
	        while(!queue.isEmpty()){
	            int size = queue.size();
	            int anyOneburned = 0;
	            for(int i = 1 ; i <=size; i++){
	                Node node = queue.poll();
	                if(node.left != null && !visited.contains(node.left)){
	                    visited.add(node.left);
	                    anyOneburned = 1;
	                    queue.add(node.left);
	                }
	                  if(node.right != null && !visited.contains(node.right)){
	                    visited.add(node.right);
	                    anyOneburned = 1;
	                    queue.add(node.right);
	                }
	                 if(Upwardlinks.get(node) != null && !visited.contains(Upwardlinks.get(node)) ){
	                    visited.add(Upwardlinks.get(node));
	                    anyOneburned = 1;
	                    queue.add(Upwardlinks.get(node));
	                }
	            }
	            if(anyOneburned == 1){
	                time++;
	            }
	        }
	        return time;
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
