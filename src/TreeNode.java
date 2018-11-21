/*
Lyndsey Wilson
ID#684781

 */
public class TreeNode<T> implements Visitable<T>
{
    T value;
    TreeNode<T> left, right;

    public TreeNode(T val, TreeNode<T> l, TreeNode<T> r)
    {
        value = val;
        left = l;
        right = r;
    }

    @Override
    public void accept(Visitor<T> v)
    {
        v.visit(this);
    }
}


