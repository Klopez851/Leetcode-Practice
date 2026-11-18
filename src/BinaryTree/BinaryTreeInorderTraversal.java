package BinaryTree;

import java.util.*;

public class BinaryTreeInorderTraversal {
    ///-----------------------
    /// INORDER TRAVERSAL()
    ///-----------------------
    public static List<Integer> recursiveInorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
         inorderTraversal(root, res);
         return res;
    }
    private static void inorderTraversal(TreeNode root, List<Integer> res){
        if(root == null){
            return;
        }
        inorderTraversal(root.left,res);
        res.add(root.val);
        inorderTraversal(root.right, res);
    }
    public static List<Integer> iterativeInorderTraversal(TreeNode root){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> nodes = new Stack<>();

        while(root != null || !nodes.isEmpty()){
            while (root != null){
                nodes.push(root);
                root = root.left;
            }
            root =nodes.pop();
            res.add(root.val);
            root = root.right;

        }

        return res;

    }

    ///-----------------------
    /// PREORDER TRAVERSAL()
    ///-----------------------

    public static List<Integer> recursivePreorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        preorderTraversal(root, res);
        return res;
    }
    private static void preorderTraversal(TreeNode root, List<Integer> res){
        if(root == null){
            return;
        }
        res.add(root.val);
        inorderTraversal(root.left,res);
        inorderTraversal(root.right, res);
    }
    public static List<Integer> PreorderTraversal(TreeNode root){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> nodes = new Stack<>();

        while(root != null || !nodes.isEmpty()){
            while (root != null){
                res.add(root.val);
                nodes.push(root);
                root = root.left;
            }
            root =nodes.pop();
            root = root.right;

        }

        return res;

    }

    ///-----------------------
    /// POSTORDER TRAVERSAL()
    ///-----------------------


    //AI Generated Tree builder, im focusing on traversal not building trees
    public static TreeNode buildTree(List<Integer> values) {

        if (values == null || values.isEmpty() || values.get(0) == null) {
            return null;
        }

        TreeNode root = new TreeNode(values.get(0));

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;

        while (!queue.isEmpty() && i < values.size()) {

            TreeNode curr = queue.poll();

            // Left child
            if (i < values.size() && values.get(i) != null) {
                curr.left = new TreeNode(values.get(i));
                queue.add(curr.left);
            }
            i++;

            // Right child
            if (i < values.size() && values.get(i) != null) {
                curr.right = new TreeNode(values.get(i));
                queue.add(curr.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) {
        // in order traversal: <fill in order>
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9);
        TreeNode root = buildTree(values);

        System.out.println(recursiveInorderTraversal(root));
    }
}
