package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;

public class MorrisTraversal {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
            left=null;
            right=null;
        }

    }

    public static void main(String[] args) {
TreeNode a =new TreeNode(6);
a.right = new TreeNode(4);
a.left =new TreeNode(9);
a.right.left= new TreeNode(8);
a.right.left.right=new TreeNode((3));
        Arrays.stream(solve(a)).forEach(System.out::println);

    }
    public static int[] solve(TreeNode A) {
        TreeNode curr =A;
        ArrayList<Integer>list =new ArrayList<>();
        while(curr !=null){
            if(curr.left == null){
                list.add(curr.val);
                curr= curr.right;
            }
            else {
                TreeNode temp = curr.left;
                while (temp.right !=null && temp.right != curr){
                    temp = temp.right;
                }
                if(temp.right == null){
                    temp.right = curr;
                    curr =curr.left;
                }
                else {
                    temp.right = null;
                    list.add(curr.val);
                    curr = curr.right;
                }
            }
        }
        return  list.stream().mapToInt(Integer::intValue).toArray();
    }
}
