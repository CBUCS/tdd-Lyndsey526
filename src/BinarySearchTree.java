/*
Lyndsey Wilson
ID#684781

https://www.geeksforgeeks.org/insertion-binary-tree/
https://www.geeksforgeeks.org/binary-search-tree-data-structure/
 */
public abstract class BinarySearchTree<T extends Comparable<T>> implements Tree<T>,java.io.Serializable
{

    public abstract class BinarySearchTree<T extends Comparable<T>> implements Tree<T>
    {
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
            if(ptr == null)
                return new TreeNode<T>(value, null, null);
            else if(value.compareTo(ptr.value) < 0)
                ptr.left = insertHelper(ptr.left, value);
            else
                ptr.right = insertHelper(ptr.right, value);
            return ptr;
        }

    public BinarySearchTree()
    {
        root = null;
    }

    //insert item in the tree at the top left most open position
    public void insert(T value)
    {
        root = insertHelper(root, value);
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