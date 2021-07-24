package Tree.Practice.SumOfTree;

public class Solution {
    public void treeSum(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftSum = treeSum(node.left);
            int rigthSum = treeSum(node.right);

            return node.data + leftSum + rigthSum;
        }
    }
}
