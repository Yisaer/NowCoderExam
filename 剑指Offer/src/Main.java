public class Main {

    public static void main(String[] args) {

        Problem16 problem16 = new Problem16();
        Problem16.TreeNode root1 = problem16.new TreeNode(8);
        Problem16.TreeNode root1left = problem16.new TreeNode(9);
        Problem16.TreeNode root1right = problem16.new TreeNode(2);
        root1.left = root1left;
        root1.right = root1right;
        Problem16.TreeNode root2 = problem16.new TreeNode(8);
        Problem16.TreeNode root2left = problem16.new TreeNode(9);
        Problem16.TreeNode root2right = problem16.new TreeNode(2);
        root2.left = root2left;
        root2.right = root2right;
        boolean is = problem16.isSame(root1,root2);
        System.out.println(is);


    }
}
