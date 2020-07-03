public class BTree extends AbstractBTree {
    private AbstractBTree left, right;
    private int root;

    public BTree(int root) {
        this.root = root;
        this.left = new NullBTree();
        this.right = new NullBTree();
    }

    public BTree(int root, AbstractBTree left, AbstractBTree right) {
        this.root = root;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toStringPreOrder() {
        String s = "(";
        s += root;
        s += "," + left.toStringPreOrder();
        s += "," + right.toStringPreOrder();
        s += ")";
        return s;
    }

    // left, right, root
    @Override
    public String toStringPostOrder() {
        String s = "(";
        s += left.toStringPostOrder() + ",";
        s += right.toStringPostOrder() + ",";
        s += root;
        s += ")";
        return s;
    }

    // left, root, right
    @Override
    public String toStringInOrder() {
        String s = "(";
        s += left.toStringInOrder() + ",";
        s += root;
        s += "," + right.toStringInOrder();
        s += ")";
        return s;
    }

    // sum means traverse the tree and add up the roots
    @Override
    public int sum() {
        return root + left.sum() + right.sum();
    }
}
