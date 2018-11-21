/*
Lyndsey Wilson
ID#684781

https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
 */

public class BFSBST<T extends Comparable<T>> extends BinarySearchTree<T> implements Visitor<T> {
    public void visit() {
        Queue<TreeNode<T>> queue = new Queue<TreeNode<T>>();
        queue.enqueue(root);
        visit(queue);
        System.out.println();
    }

    @Override
    public void visit(TreeNode<T> node) {
        System.out.print(node.value + " ");
    }

}

