/*
Lyndsey Wilson
ID#684781

 */

import java.util.Queue;

public interface Visitor<T> {
    public void visit(TreeNode<T> node);

    public void visit(Queue<TreeNode<T>> queue);
}