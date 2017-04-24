import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Problem60 problem60 = new Problem60();
        Problem60.TreeNode root = problem60.new TreeNode(5);
        Problem60.TreeNode p1 = problem60.new TreeNode(4);
        Problem60.TreeNode p2 = problem60.new TreeNode(3);
        root.right = p1;
        p1.right = p2;
        String s = problem60.Serialize(root);
        System.out.println(s);
        Problem60.TreeNode x = problem60.Deserialize(s);
        System.out.println(x.val);
        System.out.println(x.right.val);
        System.out.println(x.right.right.val);
    }
}
