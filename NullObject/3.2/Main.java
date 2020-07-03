public class Main {
    public static void main(String[] args) {
        BTree t1 = new BTree(6,
                new BTree(4, new BTree(3), new BTree(5)),
                new BTree(8));
        System.out.println(t1.toStringPreOrder());
        System.out.println(t1.toStringPostOrder());
        System.out.println(t1.toStringInOrder());
    }
}
