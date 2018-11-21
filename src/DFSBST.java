/*
Lyndsey Wilson
ID#684781

https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/
 */

import java.util.Queue;

public class DFSBST<T extends Comparable<T>> extends BinarySearchTree<T> implements Visitor<T>
{
    public void visit()
    {
        visit(root);
        System.out.println();
    }

    @Override
    public void visit(TreeNode<T> node)
    {
        System.out.print(node.value + " ");
        if(node.left != null)
            node.left.accept(this);
        if(node.right != null)
            node.right.accept(this);
    }

    @Override
    public void visit(Queue<TreeNode<T>> queue)
    {

    }
}