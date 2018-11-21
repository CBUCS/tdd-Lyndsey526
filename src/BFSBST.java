/*
Lyndsey Wilson
ID#684781

https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
 */

import java.util.*;

public class BFSBST<T extends Comparable<T>> extends BinarySearchTree<T> implements Visitor<T>
{
	public void visit()
	{
        Queue<TreeNode<T>> queue = new LinkedList<TreeNode<T>>();
        queue.add(root);
		visit(queue);
		System.out.println();
	}

	@Override
	public void visit(TreeNode<T> node)
	{
		System.out.print(node.value + " ");
	}

	@Override
    public void visit(Queue<TreeNode<T>> queue) {
        if (queue.isEmpty())
            return;

        TreeNode<T> node = queue.poll();
		node.accept(this);

        if (node.left != null)
            queue.add(node.left);
        if (node.right != null)
            queue.add(node.right);

		visit(queue);
	}
}


