/*
Lyndsey Wilson
ID#684781

https://www.geeksforgeeks.org/insertion-binary-tree/
https://www.geeksforgeeks.org/binary-search-tree-data-structure/
 */
public abstract class BinarySearchTree<T extends Comparable<T>> implements Tree<T>,java.io.Serializable
{
    //printout BFS version of the tree
    public abstract void traverse();

    public class TreeNode<T> implements java.io.Serializable
    {

    }

    protected TreeNode<T> root;

    public BinarySearchTree()
    {
        root = null;
    }

    //insert item in the tree at the top left most open position
    public void insert(T value)
    {
        root = insertHelper(root, value);
    }

    public TreeNode<T> insertHelper(TreeNode<T> ptr, T value)
    {

    }

    //removes item from tree and replaces with the bottom right most element
    public void remove(T item)
    {

    }

    //find a specific tree node that contains item
    public boolean find(T item)
    {
        return findNodeHelper(root, item);
    }

    private boolean findNodeHelper(TreeNode<T> ptr, T item)
    {

    }


}