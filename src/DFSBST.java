/*
Lyndsey Wilson
ID#684781

https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/
 */

public class DFSBST<T extends Comparable<T>> extends BinarySearchTree<T> implements Visitor<T>
{
    public void visit()
    {
        visit(root);
    }

    @Override
    public void visit(TreeNode<T> node)
    {
        System.out.print(node.value + " ");
    }
}
