public class BTree {
    private BTree left, right;
    private int root;

    public BTree(int root) {
        this.root = root;
        this.left = null;
        this.right = null;
    }

    public BTree(int root, BTree left, BTree right) {
        this.root = root;
        this.left = left;
        this.right = right;
    }

    public String toStringPreOrder() {
        String s = "(";
        s += root;
        if (left != null) {
            s += "," + left.toStringPreOrder();
        }
        else {
            s += "";
        }

        if (right != null) {
            s += "," + right.toStringPreOrder();
        }
        else {
            s += "";
        }

        s += ")";
        return s;
    }

    // left, right, root
    public String toStringPostOrder() {
        String s = "(";
        if (left != null) {
            s += left.toStringPostOrder() + ",";
        }
        else {
            s += "";
        }

        if (right != null) {
            s += right.toStringPostOrder() + ",";
        }
        else {
            s += "";
        }

        s += root;
        s += ")";
        return s;
    }

    // left, root, right
    public String toStringInOrder() {
        String s = "(";
        if (left != null) {
            s += left.toStringInOrder() + ",";
        }
        else {
            s += "";
        }

        s += root;
        if (right != null) {
            s += "," + right.toStringInOrder();
        }
        else {
            s += "";
        }

        s += ")";
        return s;
    }

    // sum means traverse the tree and add up the roots
    public int sum() {
        int temp = root;
        if (left != null) {
            temp += left.sum();
        }
        else {
            temp += 0;
        }

        if (right != null) {
            temp += right.sum();
        }
        else {
            temp += 0;
        }

        return temp;
    }
}
